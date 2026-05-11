package org.example.flex_planner.controller;

import org.example.flex_planner.model.User; // ОЧЕНЬ ВАЖНО
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Locale;

@Controller
public class PlannerController {

    private User currentUser = new User(160, 50, 18, "Сброс веса");

    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
        model.addAttribute("user", currentUser);

        double heightM = currentUser.getHeight() / 100.0;
        double bmi = (heightM > 0) ? currentUser.getWeight() / (heightM * heightM) : 0;
        model.addAttribute("bmi", String.format(Locale.US, "%.1f", bmi));

        int calories = (int) (currentUser.getWeight() * 30);
        if ("Набор массы".equals(currentUser.getGoal())) calories += 500;
        else calories -= 300;

        model.addAttribute("calories", calories);
        return "dashboard";
    }

    @PostMapping("/update-params")
    public String updateParams(@ModelAttribute("user") User user) {
        this.currentUser.setHeight(user.getHeight());
        this.currentUser.setWeight(user.getWeight());
        this.currentUser.setAge(user.getAge());
        this.currentUser.setGoal(user.getGoal());
        return "redirect:/dashboard";
    }
}
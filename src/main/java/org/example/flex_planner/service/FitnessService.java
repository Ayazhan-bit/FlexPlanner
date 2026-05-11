package org.example.flex_planner.service;

import org.springframework.stereotype.Service;

@Service
public class FitnessService {

    // Логика расчета ИМТ (BMI)
    public double calculateBMI(Integer height, Integer weight) {
        if (height == null || weight == null || height == 0) return 0;
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    // Логика расчета калорий (упрощенная формула Миффлина-Сан Жеора)
    public int calculateDailyCalories(Integer height, Integer weight, Integer age) {
        if (height == null || weight == null || age == null) return 0;
        // Формула для женщин (твой профиль настроен так)
        return (int) (10 * weight + 6.25 * height - 5 * age - 161);
    }
}

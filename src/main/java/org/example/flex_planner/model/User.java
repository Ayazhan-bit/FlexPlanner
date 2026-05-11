package org.example.flex_planner.model;

public class User {
    private int height;
    private int weight;
    private int age;
    private String goal;

    public User() {}

    public User(int height, int weight, int age, String goal) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.goal = goal;
    }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }
    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getGoal() { return goal; }
    public void setGoal(String goal) { this.goal = goal; }
}
package com.example.asm;

public class Spend {
    private String name;
    private String description;
    private String detail;
    private Double amount;
    private String time;
    private String category;

    public Spend() {
    }

    public Spend(String name, String description, String detail, Double amount, String time, String category) {
        this.name = name;
        this.description = description;
        this.detail = detail;
        this.amount = amount;
        this.time = time;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

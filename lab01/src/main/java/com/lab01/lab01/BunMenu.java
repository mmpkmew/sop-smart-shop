package com.lab01.lab01;

public class BunMenu {
    private String name;
    private String detail;
    private Bun[] buns;
    private double price;

    public BunMenu(String name, String detail, Bun[] buns, double price) {
        this.name = name;
        this.detail = detail;
        this.buns = buns;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public Bun[] getBuns() {
        return buns;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setBuns(Bun[] buns) {
        this.buns = buns;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

package com.company;

public class Circle {

    private final double pi = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double perimeter(){
        return 2 * getPi() * radius;
    }

    public double area(){
        return getPi() * radius * radius;
    }
}

package com.company;

public class Square {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int perimeter(){
        return a * 4;
    }

    public int area(){
        return a * a;
    }

}

package com.company;

public class Main {

    public enum Shape{SQUARE, RECTANGLE, CIRCLE};

    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square.perimeter());
        System.out.println(square.area());

        Rectangle rectangle = new Rectangle(8,6);
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());

        Circle circle = new Circle(3);
        System.out.printf("%.2f%n", circle.perimeter());
        System.out.printf("%.2f%n", circle.area());



        Shape shape = Shape.SQUARE;
        double perimeter = 0;
        double area = 0;
        int a = 8;
        int b = 0;
        final double pi = Math.PI;
        double radius = 0;


        switch (shape){
            case SQUARE -> {
                perimeter = a * 4;
                area = a * a;
                break;
            }
            case RECTANGLE -> {
                perimeter = 2 * (a + b);
                area = a * b;
                break;
            }
            case CIRCLE -> {
                perimeter = 2 * pi * radius;
                area = pi * radius * radius;
                break;
            }
            default -> System.out.println("Vstup není validní");
        }

        System.out.println(shape + " Obvod: " + perimeter + "\t Obsah: " + area);

    }
}

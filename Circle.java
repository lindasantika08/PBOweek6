/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testshape;

/**
 *
 * @author LINDA
 */
// Kelas Circle sebagai subclass dari Shape
public class Circle extends Shape {
     private double radius; // Variabel instance untuk radius lingkaran

    // Konstruktor default untuk Circle, menginisialisasi radius ke 1.0.
    public Circle() {
        radius = 1.0;
    }

    // Konstruktor lain untuk Circle, dengan parameter radius.
    public Circle(double radius) {
        this.radius = radius;
    }

    // Konstruktor lain untuk Circle, dengan parameter radius, warna, dan status terisi.
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Memanggil konstruktor superclass Shape dengan warna dan status terisi.
        this.radius = radius;
    }

    // Getter untuk mendapatkan nilai radius.
    public double getRadius() {
        return radius;
    }

    // Setter untuk mengatur nilai radius.
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Metode untuk menghitung luas lingkaran.
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Metode untuk menghitung keliling lingkaran.
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override metode toString() untuk mengembalikan informasi objek Circle, mencantumkan radius dan superclass Shape.
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}


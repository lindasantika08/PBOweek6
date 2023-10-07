/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testshape;

/**
 *
 * @author LINDA
 */
// Kelas Rectangle sebagai subclass dari Shape
public class Rectangle extends Shape {
    private double width;  // Variabel instance untuk lebar
    private double length; // Variabel instance untuk panjang

    // Konstruktor default untuk Rectangle, menginisialisasi lebar dan panjang ke 1.0.
    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    // Konstruktor lain untuk Rectangle, dengan parameter lebar dan panjang.
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Konstruktor lain untuk Rectangle, dengan parameter lebar, panjang, warna, dan status terisi.
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); // Memanggil konstruktor superclass Shape dengan warna dan status terisi.
        this.width = width;
        this.length = length;
    }

    // Getter untuk mendapatkan nilai lebar.
    public double getWidth() {
        return width;
    }

    // Setter untuk mengatur nilai lebar.
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter untuk mendapatkan nilai panjang.
    public double getLength() {
        return length;
    }

    // Setter untuk mengatur nilai panjang.
    public void setLength(double length) {
        this.length = length;
    }

    // Metode untuk menghitung luas persegi panjang.
    public double getArea() {
        return width * length;
    }

    // Metode untuk menghitung keliling persegi panjang.
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override metode toString() untuk mengembalikan informasi objek Rectangle, mencantumkan lebar, panjang, dan superclass Shape.
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}

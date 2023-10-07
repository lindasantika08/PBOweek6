/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testshape;

/**
 *
 * @author LINDA
 */
// Kelas utama Shape
public class Shape {
    private String color;    // Variabel instance untuk warna
    private boolean filled;  // Variabel instance untuk status terisi (filled)

    // Konstruktor default untuk Shape, menginisialisasi warna ke "green" dan status terisi ke true.
    public Shape() {
        color = "green";
        filled = true;
    }

    // Konstruktor lain untuk Shape, dengan parameter warna dan status terisi.
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter untuk mendapatkan warna bentuk.
    public String getColor() {
        return color;
    }

    // Setter untuk mengatur warna bentuk.
    public void setColor(String color) {
        this.color = color;
    }

    // Getter untuk mendapatkan status terisi bentuk.
    public boolean isFilled() {
        return filled;
    }

    // Setter untuk mengatur status terisi bentuk.
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Metode toString() untuk mengembalikan representasi teks dari bentuk.
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}



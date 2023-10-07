/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testshape;

/**
 *
 * @author LINDA
 */
// Kelas Square sebagai subclass dari Rectangle
public class Square extends Rectangle {
    // Konstruktor Square dengan satu parameter yang mewakili panjang sisi.
    public Square(double side) {
        super(side, side); // Memanggil konstruktor superclass Rectangle dengan panjang dan lebar yang sama.
    }

    // Override metode setWidth() untuk mengatur lebar dan panjang dengan nilai yang sama.
    @Override
    public void setWidth(double width) {
        super.setWidth(width);   // Memanggil metode setWidth() dari superclass Rectangle.
        super.setLength(width);  // Memanggil metode setLength() dari superclass Rectangle.
    }

    // Override metode setLength() untuk mengatur panjang dan lebar dengan nilai yang sama.
    @Override
    public void setLength(double length) {
        super.setWidth(length);  // Memanggil metode setWidth() dari superclass Rectangle.
        super.setLength(length); // Memanggil metode setLength() dari superclass Rectangle.
    }

    // Override metode toString() untuk mengembalikan informasi objek Square, mencantumkan panjang sisi dan superclass Rectangle.
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}

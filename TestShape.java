/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testshape;

/**
 *
 * @author LINDA
 */
public class TestShape {
    public static void main(String[] args) {
        // Membuat objek Shape (tidak ada parameter)
        Shape shape1 = new Shape();
        System.out.println(shape1); // Mencetak informasi objek Shape

        // Membuat objek Circle dengan radius 2.0, warna "blue", dan terisi (true)
        Circle circle1 = new Circle(2.0, "blue", true);
        System.out.println(circle1); // Mencetak informasi objek Circle

        // Membuat objek Rectangle dengan panjang 3.0, lebar 4.0, warna "yellow", dan tidak terisi (false)
        Rectangle rectangle1 = new Rectangle(3.0, 4.0, "yellow", false);
        System.out.println(rectangle1); // Mencetak informasi objek Rectangle

        // Membuat objek Square dengan sisi 5.0 (yang juga adalah panjang dan lebar), tidak perlu warna dan isFilled karena diwarisi dari Rectangle
        Square square1 = new Square(5.0);
        System.out.println(square1); // Mencetak informasi objek Square
    }
}


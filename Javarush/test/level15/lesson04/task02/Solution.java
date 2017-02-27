package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, int value){
        System.out.println("Заполняем объектами Int");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, short value){
        System.out.println("Заполняем объектами Short");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, long value){
        System.out.println("Заполняем объектами Long");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n , double value){
        System.out.println("Заполняем объектами Double");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, float value){
        System.out.println("Заполняем объектами Float");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, byte value){
        System.out.println("Заполняем объектами Byte");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(Float m, Float n, Object value)
    {
        System.out.println("float");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(Integer m, Integer n, Object value)
    {
        System.out.println("Integer");
        printMatrix(m, n, (Object) value);
    }
}

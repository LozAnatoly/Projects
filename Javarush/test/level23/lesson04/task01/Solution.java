package com.javarush.test.level23.lesson04.task01;

/* Inner
Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] res = new Solution[2];
        Solution one = new Solution();
        one.innerClasses[0] = one.new InnerClass();
        one.innerClasses[1] = one.new InnerClass();

        Solution two = new Solution();
        two.innerClasses[0] = two.new InnerClass();
        two.innerClasses[1] = two.new InnerClass();

        res[0] = one;
        res[1] = two;

        return res;
    }
}

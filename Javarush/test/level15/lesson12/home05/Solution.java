package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    private Solution(Integer a, Integer c){}
    private Solution(Float a, Integer c){}
    private Solution(Double a, Integer c){}
    Solution(Integer a, Boolean c){}
    Solution(Float a, Boolean c){}
    Solution(Double a, Boolean c){}
    protected Solution(Integer a){}
    protected Solution(Float a){}
    protected Solution(Double a){}
    public Solution(Integer a, Character c){}
    public Solution(Float a, Character c){}
    public Solution(Double a, Character c){}

}


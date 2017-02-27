package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> children = new ArrayList<>();

        Human son1 = new Human("Mark", true, 10, new ArrayList<Human>());
        Human son2 = new Human("Tolya", true,23, new ArrayList<Human>());
        Human daughter = new Human("Alenka", false, 24, new ArrayList<Human>());

        children.add(son1);
        children.add(son2);
        children.add(daughter);

        ArrayList<Human> parents1 = new ArrayList<>();
        ArrayList<Human> parents2 = new ArrayList<>();

        Human father = new Human("Oleg", true, 44, children);
        Human mother = new Human("Nata", false, 43, children);

        parents1.add(father);
        parents2.add(mother);

        Human fgrandfather = new Human("Leo", true, 70, parents1);
        Human mgrandfathet = new Human("Vasya", true, 71, parents2);
        Human fGrandMother = new Human("Luda", false, 66, parents1);
        Human mGrandMother = new Human("Toma", false, 67, parents2);

        System.out.println(fgrandfather.toString());
        System.out.println(fGrandMother.toString());
        System.out.println(mgrandfathet.toString());
        System.out.println(mGrandMother.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());




    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        int countChildren;
        ArrayList<Human> children = new ArrayList<>(countChildren);


        Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}

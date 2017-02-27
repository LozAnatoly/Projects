package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Anatoly on 12/5/16.
 */
public class LatteMaker extends DrinkMaker implements Runnable
{
    @Override
    void getRightCup()
    {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient()
    {
        System.out.println("Делаем кофе");
    }

    @Override
    void pour()
    {
        System.out.println("Заливаем молоком с пенкой");
    }

    @Override
    public void run()
    {
        makeDrink();
    }
}

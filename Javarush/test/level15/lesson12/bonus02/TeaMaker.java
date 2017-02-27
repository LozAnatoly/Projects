package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Anatoly on 12/5/16.
 */
public class TeaMaker extends DrinkMaker implements Runnable
{

    @Override
    void getRightCup()
    {
        System.out.println("Берем чашку для чая");
    }

    @Override
    void putIngredient()
    {
        System.out.println("Насыпаем чай");
    }

    @Override
    void pour()
    {
        System.out.println("Заливаем водой");
    }


    @Override
    public void run()
    {
        makeDrink();
    }
}

package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Anatoly on 11/26/16.
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}

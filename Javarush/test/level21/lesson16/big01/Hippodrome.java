package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Anatoly on 12/2/16.
 */
public class Hippodrome
{
    public static void main(String[] args) throws InterruptedException
    {
        game = new Hippodrome();

        game.horses.add(new Horse("Vaska", 3, 0));
        game.horses.add(new Horse("Maska", 3, 0));
        game.horses.add(new Horse("Slavka", 3, 0));

        game.run();
        game.printWinner();
    }
    private static ArrayList<Horse> horses = new ArrayList<>();
    public ArrayList<Horse> getHorses()
    {
        return horses;
    }
    public static Hippodrome game;
    public void move(){
        for (int i = 0; i < horses.size(); i++)
        {
            horses.get(i).move();
        }
    }
    public void print(){
    for (Horse horse : horses)
    {
        horse.print();
    }
        System.out.println();
        System.out.println();
    }
    public void run() throws InterruptedException
    {
        for (int i = 1; i <= 100; i++)
        {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public Horse getWinner()
    {
        Horse winner = horses.get(0);
        for (Horse horse : horses)
        {
            if (horse.getDistance() > winner.getDistance())
            {
                winner = horse;
            }
        }
        return winner;
    }
    public void printWinner()
    {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}

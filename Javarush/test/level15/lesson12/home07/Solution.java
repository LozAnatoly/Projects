package com.javarush.test.level15.lesson12.home07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/* Файл в статическом блоке
1. Инициализируй константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Constants.FILE_NAME все строки и добавь их по-отдельности в List lines.
3. Закрой поток ввода методом close().
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static
    {

        FileReader fr = null;
        try
        {
            fr = new FileReader(Constants.FILE_NAME);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        String line;
        try
        {
            while((line = br.readLine()) != null){
                lines.add(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            br.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}

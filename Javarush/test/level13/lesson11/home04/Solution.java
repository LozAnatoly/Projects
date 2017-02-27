package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String fileName = read.readLine();
        FileWriter writer = new FileWriter(fileName, false);
        String input = null;

        while (true)
        {
            input = read.readLine();

            if (input.equals("exit"))
            {
                writer.write(input);
                break;
            }
            else
            {
                writer.write(input);
                writer.write(System.lineSeparator());
            }
        }
        writer.close();
        read.close();
    }

}

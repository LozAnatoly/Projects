package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(read.readLine());
        FileOutputStream outputStream = new FileOutputStream(read.readLine());
        read.close();
        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            if (data == 46) data = 33;
            outputStream.write(data);
        }
        inputStream.close();
        outputStream.close();
    }
}

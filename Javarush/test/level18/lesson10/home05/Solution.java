package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

/*
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());

        FileInputStream in = new FileInputStream(file1);
        FileOutputStream out = new FileOutputStream(file2);


        while(in.available() > 0){
            byte[] data = new byte[in.available()];
            in.read(data);
            out.write(getInput(data));
        }


        in.close();
        out.close();

    }

    private static byte[] getInput(byte[] data){

        StringBuilder builder = new StringBuilder();
        String[] s = new String(data).split(" ");
        byte[] res;
        long[] tmp = new long[s.length];

        for(int i = 0; i < s.length; i++){
            tmp[i] = Math.round(Double.valueOf(s[i]));
        }

        for(long i : tmp){
            builder.append(i);
            builder.append(" ");
        }

        res = builder.toString().getBytes();

        return res;
    }
}*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException, IOException
    {
        List<Long> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOne = reader.readLine();
        String nameTwo = reader.readLine();

        Scanner scan = new Scanner(new File(nameOne));
        while (scan.hasNextDouble())
        {
            result.add(Math.round(scan.nextDouble()));
        }

        BufferedWriter os = new BufferedWriter(new FileWriter(nameTwo));
        String tmp = "";
        for (Long s : result)
            tmp = tmp + s + " ";
        os.write(tmp);

        reader.close();
        scan.close();
        os.flush();
        os.close();
    }
}
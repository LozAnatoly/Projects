package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream out1 = new FileOutputStream(reader.readLine(), true);
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileInputStream inputStream1 = new FileInputStream(reader.readLine());

        while(inputStream.available() > 0){
            byte[] b = new byte[inputStream.available()];
            int count = inputStream.read(b);

            out1.write(b, 0, count);
        }

        while(inputStream1.available() > 0){
            byte[] b = new byte[inputStream1.available()];
            int count = inputStream1.read(b);

            out1.write(b, 0, count);
        }


        reader.close();
        out1.close();
        inputStream.close();
        inputStream1.close();
    }
}

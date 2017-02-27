package com.javarush.test.level19.lesson08.task05;

/* Дублируем текст
Считайте с консоли имя файла
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна дублировать вывод всего текста в файл, имя которого вы считали
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Закройте поток файла

Пример вывода на экран:
it's a text for testing

Пример тела файла:
it's a text for testing
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        reader.close();

        PrintStream printStream = System.out;

        ByteArrayOutputStream outputStream1 = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream1);
        System.setOut(stream);

        testString.printSomething();

        String result = outputStream1.toString();
        System.setOut(printStream);

        outputStream.write(outputStream1.toByteArray());
        System.out.println(result);

        outputStream.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}


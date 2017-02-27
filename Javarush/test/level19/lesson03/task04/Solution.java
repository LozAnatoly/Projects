package com.javarush.test.level19.lesson03.task04;

import javax.swing.text.html.parser.DTD;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner scanner;
        PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException
        {
            String s = scanner.nextLine();
            String[] personArr = s.split(" ");
            Calendar calendar = new GregorianCalendar(Integer.parseInt(personArr[5]), Integer.parseInt(personArr[4]) - 1, Integer.parseInt(personArr[3]));
            Date birthday = calendar.getTime();
            Person person = new Person(personArr[1], personArr[2], personArr[0], birthday);
            return person;
        }

        @Override
        public void close() throws IOException
        {
            this.scanner.close();
        }
    }
}

package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задача №1
        {
           int i = 0;
           while (i < 10) {
               i++;
               System.out.print(i + " ");
           }
            System.out.print("\n");
           for (; i > 0; i--) {
               System.out.print(i + " ");
           }
        }
        System.out.print("\n");

        // Задача №2
        {
            // 1 Вариант решения (проще и удобнее)
            int d = 3;
            for ( ; d <= 31; d = d + 7) {
                System.out.println("Сегодня пятница, " + d + "-е число. Необходимо подготовить отчет.");
            }
            // 2 Вариант решения (более сложный)

            int i = 3;
            while (i <= 31) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
                i = i + 7;
                if (i > 31) {
                 break;
             }
            }
        }
        // Задача №3
        {
            int year = 2022;
            int start = 0;
            for ( ; start >= 0 && start <= year + 100; start = start + 79) {
                if (start >= year - 200) {
                    System.out.println(start);
                }
            }
        }

    }
}

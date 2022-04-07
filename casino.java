package OldJava;

import java.util.Random;
import java.util.Scanner;

public class casino {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите на что ставить?");

        int N = scanner.nextInt();

        switch (N) {

            case 1:
                System.out.println("Вы выбрали поставить на число");
                System.out.println("Введите сумму");
                int c = scanner.nextInt();


                int b = random.nextInt(36);
                System.out.println("Введите число на которое хотите поставить");

                int a = 1;
                a = scanner.nextInt();

                if (a == b) {
                    c = (c * 36);
                    System.out.println(" Вы победили ");
                    System.out.println(c);
                } else
                    System.out.println("Вы проиграли ");
                break;

            case 2:
                System.out.println("Вы выбрали поставить на красное или черное");
                int M = scanner.nextInt();
                System.out.println("1 - черное. 2 - красное.");
                System.out.println("Введите сумму");
                int f = scanner.nextInt();


        }

    }
}
package PalgaArvutamine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String finishSalary = new String();

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, enter your current salary");
            int currentSalary = scanner.nextInt();

            System.out.println("Please, enter the period");
            int period = scanner.nextInt();

            System.out.println("Select the loop:\n 1 - while\n 2 - do ... while\n 3 - for");
            int loop = scanner.nextInt();

            int index = 0;

            switch (loop) {
                case 1: {
                    System.out.println("WHILE\n");
                    while (period > 0) {
                        currentSalary += 1000;
                        period--;
                        index++;
                        System.out.printf("%d month: ", index);
                        System.out.printf("salalry %d \n", currentSalary);
                    }
                    break;
                }

                case 2: {
                    System.out.println("DO WHILE\n");
                    do {
                        currentSalary += 1000;
                        period--;
                        index++;
                        System.out.printf("%d month: ", index);
                        System.out.printf("salalry %d \n", currentSalary);
                    }
                    while (period > 0);
                    break;
                }

                default: {
                    System.out.println("FOR\n");
                    for (int i = 0; i < period; i++) {
                        currentSalary += 1000;
                        System.out.printf("%d month: ", i + 1);
                        System.out.printf("salalry %d \n", currentSalary);
                    }
                    break;
                }
            }

            System.out.println("Print 'close' for exit or print any other string to continue");
            finishSalary = scanner.next();
        }
        while (!finishSalary.contentEquals("close"));

    }
}

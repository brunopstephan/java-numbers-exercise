import NumbersMutation.NumbersMutation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer[] inputNumbers = new Integer[10];

        System.out.println("Enter 10 integer numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            inputNumbers[i] = scanner.nextInt();

        }

        NumbersMutation numbersMutation = new NumbersMutation();

        numbersMutation.setNumbers(inputNumbers);

        Integer[] numbers = numbersMutation.getNumbers();

        StringBuilder text = new StringBuilder();

        for (Integer number : numbers) {
            text.append(number).append(" ");
        }

        System.out.println("Number's list: " + text);

        Float average = numbersMutation.getAverage();

        System.out.println("Average: " + average);

        Integer smallest = numbersMutation.getSmallest();

        System.out.println("Smallest number: " + smallest);

        Integer biggest = numbersMutation.getBiggest();

        System.out.println("Biggest number: " + biggest);

    }
}
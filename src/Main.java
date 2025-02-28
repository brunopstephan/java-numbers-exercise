import NumbersMutation.NumbersMutation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer[] inputNumbers = new Integer[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            inputNumbers[i] = scanner.nextInt();

        }

        NumbersMutation numbersMutation = new NumbersMutation();

        numbersMutation.setNumbers(inputNumbers);

        Integer[] numbers = numbersMutation.getNumbers();

        StringBuilder text = new StringBuilder();

        for (Integer number : numbers) {
            text.append(number).append(" ");
        }

        System.out.println("Números: " + text);

        Float average = numbersMutation.getAverage();

        System.out.println("Média: " + average);

        Integer smallest = numbersMutation.getSmallest();

        System.out.println("Menor número: " + smallest);

        Integer biggest = numbersMutation.getBiggest();

        System.out.println("Maior número: " + biggest);

    }
}
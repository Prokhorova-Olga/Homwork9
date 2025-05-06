import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1

        System.out.println("Task 1");

        int[] expenses = new int[]{20000, 15000, 23000, 18000, 10000};
        int totalExpenses = 0;
        for (int index = 0; index < expenses.length; index++) {
            totalExpenses += expenses[index];
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей.");
        System.out.println();
        System.out.println("_____________________");

        // Task 2

        System.out.println("Task 2");

        int maxSum = -1;
        int minSum = Integer.MAX_VALUE;
        for (final int current : expenses) {
            if (current > maxSum) {
                maxSum = current;
            }
        }
        for (final int expense : expenses) {
            if (expense < minSum) {
                minSum = expense;
            }
        }

        System.out.println("Максимальная сумма трат за неделю составила " + maxSum + " рублей." +
                " Минимальная сумма трат за неделю составила " + minSum + " рублей.");
        System.out.println();
        System.out.println("_____________________");

        // Task 3

        System.out.println("Task 3");
        double averageMonthlyExpenses = (double) totalExpenses / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + String.format("%.2f", averageMonthlyExpenses) + " рублей.");
        System.out.println();
        System.out.println("_____________________");

        // Task 4

        System.out.println("Task 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int pointerOne = 0;
        int pointerTwo = reverseFullName.length - 1;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[pointerOne];
            reverseFullName[pointerOne] = reverseFullName[pointerTwo];
            reverseFullName[pointerTwo] = temp;
            pointerOne++;
            pointerTwo--;
        }
        System.out.println(Arrays.toString(reverseFullName));

    }
}
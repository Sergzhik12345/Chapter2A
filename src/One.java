import java.util.Scanner;
public class One {
    /**
     * @author Siarhei_Hrakau
     * Date of receipt of the task: 17.04.2023
     * Due dato of the task: 17.04.2023
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        // Ввод чисел
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число #" + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        sc.close();
        int shortestNumber = numbers[0];
        int longestNumber = numbers[0];
        // Поиск самого короткого и самого длинного числа
        for (int i = 1; i < n; i++) {
            if (numbers[i] < shortestNumber) {
                shortestNumber = numbers[i];
            }
            if (numbers[i] > longestNumber) {
                longestNumber = numbers[i];
            }
        }
        // Вывод результатов
        System.out.println("Самое короткое число: " + shortestNumber + ", его длина: " + String.valueOf(shortestNumber).length());
        System.out.println("Самое длинное число: " + longestNumber + ", его длина: " + String.valueOf(longestNumber).length());
    }
}


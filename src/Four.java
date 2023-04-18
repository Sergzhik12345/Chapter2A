import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Four {
    /**
     * @author Siarhei_Hrakau
     * Date of receipt of the task: 17.04.2023
     * Due dato of the task: 18.04.2023
     */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        //Определяем колличество цифр;
        System.out.println("Введите колличество цифр");
        int count = sc.nextInt();

        // объявление и заполнение массива, числами из консоли;
        int [] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Введите число # "+ (i+1));
            numbers[i] = sc.nextInt();
        }
        sc.close();
        int desiredNumber = findDesiredNumber(numbers);
        System.out.println("Число с минимальным количеством цифр: "+ desiredNumber);
    }

    // Метод для нахождение числа с минимальным числом различных цифр
    public static int findDesiredNumber(int[] array){
        int quantityUniqueNumbers = 11;
        int desiredNumber = array[0];
        for (int number:array){
            int currentUniqueNumbers = findQuantityUniqueNumbers (number);
            if (currentUniqueNumbers<quantityUniqueNumbers){
                quantityUniqueNumbers=currentUniqueNumbers;
                desiredNumber=number;
            }
        }
        return desiredNumber;
    }

    // Метод для определения количества цифр в числе;
    public static int findQuantityUniqueNumbers (int number){
        Set<Integer> digits = new HashSet<>();
        while (number > 0) {
            int digit = number % 10;
            digits.add(digit);
            number /= 10;
        }
        return digits.size();
    }
}

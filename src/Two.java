import java.util.Scanner;
import  java.util.Arrays;

public class Two {
    /**
     * @author Siarhei_Hrakau
     * Date of receipt of the task: 17.04.2023
     * Due dato of the task: 17.04.2023
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
        //Сортировка по убыванию/возрастанию (Для убывания Arrays.sort(numbers, Comparator.reverseOrder()) )
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

import java.util.Scanner;
public class Three{
    /**
     * @author Siarhei_Hrakau
     * Date of receipt of the task: 17.04.2023
     * Due dato of the task: 17.04.2023
     */
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        double average;
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

        //Находим среднее арифметическое массива
        for (int i : numbers){
            sum+=i;
        }
        average = sum/count;

        //Выводим на консоль те числа, которые > среднеарифметического
        for (int i : numbers){
            if (i>average){
                System.out.println("число "+i+" и его длинна - "+ String.valueOf(i).length());
            }
        }
    }
}
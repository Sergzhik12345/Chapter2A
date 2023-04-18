import java.util.Scanner;
public class Six {
    /**
     * @author Siarhei_Hrakau
     * Date of receipt of the task: 18.04.2023
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
        int result = findIncrease(numbers);
        if (result != -1){
            System.out.println("Число с цифрами, идущими в строгом порядке возрастания: " + result);
        } else {
            System.out.println("Не найдено число с цифрами, идущими в строгом порядке возрастания.");
        }
    }

    // метод для нахождения числа, в котором все цифры идут по возрастанию
    public static int findIncrease(int[] array){
        int allNumbersIncrease=-1;
        for (int number:array){
            if (compareNumbers(number)){
                allNumbersIncrease=number;
                break;
            }
        }
        return allNumbersIncrease;
    }

    //Метод для сравнения всех цифр числа
    public static boolean compareNumbers (int number){
        boolean isDesired;
        int previous = 10;
        while (number%10<previous && number>0){
           previous=number%10;
           number/=10;
        }
        isDesired = (number == 0);
        return isDesired;
    }
}

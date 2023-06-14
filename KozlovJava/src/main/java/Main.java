import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Составить алгоритм: если введенное число больше 7, то вывести "Привет"
        moreThanSevenTask();
        /* 2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести "Привет, Вячеслав",
        если нет, то вывести "Нет такого имени" */
        isVyacheslavTask();
        // 3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива, кратные 3
        findNumberIsMultipleThree();
    }

    private static void moreThanSevenTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, число.");
        int number = scanner.nextInt ();
        System.out.println("Введенное число: " + number);
        if(number > 7){
            System.out.println("Привет");
        }
    }

    private static void isVyacheslavTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, имя.");
        String name = scanner.nextLine();
        System.out.println("Введенное имя: " + name);
        if(name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }
        else{
            System.out.println("Нет такого имени");
        }
    }

    private static void findNumberIsMultipleThree(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> multipleThreeNumbers = new ArrayList<>();
        System.out.println("Введите размер будущего массива чисел");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println(String.format("Введите %x элементов массива чисел", size));
        for(int i = 0; i < size; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Введенное массив: " + numbers);
        for(int number : numbers){
            if(number % 3 == 0){
                multipleThreeNumbers.add(number);
            }
        }
        System.out.println(multipleThreeNumbers);
    }
}
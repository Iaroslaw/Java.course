import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Класс Scanner (нужен для ввода)
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        name = reverse(name);
        System.out.println(name);
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        age_answer(age); //Вывод сообщения в зависимости от возраста
        int nums [] = new int [5]; //массив чисел
        System.out.print("Введите 5 любых чисел:\n");
        for (int i = 0; i < 5; i++) {
            nums[i] = in.nextInt();
        }
        int min = min(nums);
        int max = max(nums);
        System.out.printf("Наименьшее число: %d\n", min);
        System.out.printf("Наибольшее число: %d\n", max);
    }

    //Реверс имени
    public static String reverse(String name) {
        return new StringBuilder(name).reverse().toString();
    }

    //Вывод сообщения в зависимости от возраста
    public static void age_answer(int age) {
        if (0 > age) {
            System.out.println("Возраст не может быть отрицательным");
        }
        if (0 <= age && age <= 18) {
            System.out.println("Делай уроки");
        }
        if (age > 18) {
            System.out.println("Езжай в Польшу на клубнику");
        }
    }

    //Поиск максимального числа
    public static int max(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < 5; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    //Поиск минимального числа
    public static int min(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < 5; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}

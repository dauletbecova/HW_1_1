import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
        //1
        String Name;

        //2
        final int NUM = 5;

        //3
        String word = "hello";

        //4
        Name = NUM + word;

        //5
        System.out.println("Значение переменной Name: " + Name);
        System.out.println("Значение константы NUM: " + NUM);
        System.out.println("Значение переменной word: " + word);

        //6
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        //7
        System.out.println("Введите ваше имя: ");

        //8
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        //9
        System.out.println("Привет, " + name + "!");
    }
}

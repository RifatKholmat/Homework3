package Homework3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    public static void  main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        char reserve[] = new char[15];
        Arrays.fill(reserve, '#');
        String word = words[random.nextInt(words.length)];
        System.out.println("example: " + word);
        System.out.println("Компьютер предлагает угадать Вам слово из предложенных->");
        System.out.println(Arrays.toString(words));
        while (true) {
            System.out.println("Введите свой вариант");
            String answer = scanner.next();
            if (answer.equals(word)) {
                System.out.println("Вы угадали!");
                break;
            }
            for (int i = 0; i < answer.length() && i < word.length(); i++) {//до этого не смог сам додуматься( подсмотрел у вас
                if (answer.charAt(i) == word.charAt(i)) reserve[i] = word.charAt(i);
            }
            System.out.println("Вы не угадали слово целиком:");
            System.out.println(new String(reserve));
        }
    }
}

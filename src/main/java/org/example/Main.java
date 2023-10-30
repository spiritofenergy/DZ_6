package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                System.out.println("// 1. Пользователь вводит дробное число. Если оно больше пи, вывести 6" +
                        "“pimore”");
                System.out.println("Введите дробное число !");
                Scanner scanner = new Scanner(System.in);
                double number1 = scanner.nextDouble();
                if (number1 > Math.PI){
                    System.out.println("pimore");
                }



                System.out.println("// 2. Пользователь вводит строку. Используя метод .contains(‘ ‘) \n" +
                        "пробел, определите, ввел пользователь одно слово, или больше");
                Scanner sc = new Scanner(System.in);
                String str1 = sc.nextLine();
                boolean x = str1.contains(" ");
                if(x){
                    System.out.println("Вы ввели больше одного слова.");
                }else {
                    System.out.println("Нет пробелов!");
                }


                System.out.println(" // 3. Пользователь вводит четыре числа. Найти наибольшее из них.");
                ArrayList<Integer> integerArrayList = new ArrayList<>();
                System.out.println("Введите 4 числа ");
                for (int i = 0; i < 4; i++){
                    int a = scanner.nextInt();
                    integerArrayList.add(a);
                    Collections.sort(integerArrayList);}
                System.out.println("Отсортированный список " + integerArrayList);
                System.out.println("Наибольшее число - " + integerArrayList.get(integerArrayList.size()-1));

                System.out.println(" // Второй вариант");
                System.out.println(" // 3. Пользователь вводит четыре числа. Найти наибольшее из них.");
                ArrayList<Integer> integerArrayList2 = new ArrayList<>();
                System.out.println("Введите 4 числа ");
                for (int i = 0; i < 4; i++) {
                    int a = scanner.nextInt();
                    integerArrayList2.add(a);
                }
                System.out.println("Это весь список - " + integerArrayList2);
                int maxValue = 0;
                for (int i = 0; i < integerArrayList2.size(); i++) {
                    if (maxValue < integerArrayList2.get(i)) {
                        maxValue = integerArrayList2.get(i);
                    }
                }            System.out.println("Это максимальное значение - " + maxValue);
            }
        }


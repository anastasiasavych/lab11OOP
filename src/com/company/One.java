package com.company;

import java.util.Arrays;

public class One {

    void firstMethod() {
        try {
            int a = 0;
            System.out.println("a: " + a);
            int b = 42 / a;
            int c[] = {5};
            c[6] = b;
        } catch (ArithmeticException e) {
            System.out.println("Ділення на нуль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Помилка індексації за межами масиву: " + e);
        }
        System.out.println("Після блоку операторів try/catch");
    }

    void secondMethod(int a,String str){
        try {
            int b = 42 / a;
            System.out.println("b = " + a);
            try {
                int length = str.length();
                System.out.println("Довжина рядка: " + length);
            } catch (NullPointerException e) {
                System.out.println("Виникла помилка: нульове посилання. " + e);
            }
        }catch (ArithmeticException e){
            System.out.println("Ділення на 0: " + e);
        }
    }

    void thirdMethod(int b){
        int a = 12;
        try {
            int[] array = new int[b];
            array[1] = a;
            System.out.println("Масив"+ Arrays.toString(array) +" створено успішно.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Виникла помилка: недопустимий розмір масиву.");
        } finally {
            System.out.println("Виконання блоку finally, a: "+a);
        }
    }
}

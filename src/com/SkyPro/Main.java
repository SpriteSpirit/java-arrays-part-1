package com.SkyPro;

public class Main {

    public static void main(String[] args) {
	/*
	Task #1
	Объявите три массива:
    1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
    2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 – сразу заполнив его значениями.
    3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
	 */
        //1
        int[] arrs = new int[3];
        arrs[0] = 1;
        arrs[1] = 2;
        arrs[2] = 3;

        for (int arr : arrs) {
            System.out.print("[" + arr + "] ");
        }
        System.out.println(" "); // empty line

        //2
        float[] arrs2 = {1.57f, 7.654f, 9.986f};
        for (float arr2 : arrs2) {
            System.out.print("[" + arr2 + "] ");
        }
        System.out.println(" ");  // empty line

        //3
        String[] arrs3 = {"Rock", "Scrissors", "Paper"};
        int random1 = (int) (Math.random() * 3);
        int random2 = (int) (Math.random() * 3);
        String dropped1 = arrs3[random1];
        String dropped2 = arrs3[random2];

        System.out.println("[" + dropped1 + "] VS " + "[" + dropped2 + "]");
        if (dropped1 == arrs3[0] && dropped2 == arrs3[1] || dropped1 == arrs3[1] && dropped2 == arrs3[0]) {
            System.out.println("ROCK WIN!");
        } else if (dropped1 == arrs3[1] && dropped2 == arrs3[2] || dropped1 == arrs3[2] && dropped2 == arrs3[1]) {
            System.out.println("SCRISSORS WIN!");
        } else if (dropped1 == arrs3[0] && dropped2 == arrs3[2] || dropped1 == arrs3[2] && dropped2 == arrs3[0]) {
            System.out.println("PAPPER WIN!");
        } else if (random1 == random2) {
            System.out.println("DRAW!");
        }
        /*
	    Task #2
	    Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую.
	    Запятая между последним элементом одного массива и первым элементом следующего не нужна.
	    */
        for (int arr : arrs) {
            System.out.print(arr + " ");
        } System.out.println(" "); // empty line

        for (float arr2 : arrs2) {
            System.out.print(arr2 + " ");
        } System.out.println(" ");  // empty line

        for (int i = 0; i < arrs3.length; i++) {
            System.out.print(arrs3[i] + " ");
        } System.out.println(" ");  // empty line
        /*
	    Task #3
	    Распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
        Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        Если во втором задании в консоль у вас вывелся результат
        1, 2, 3
        1.57, 7.654, 9.986
	    */
        for (int i = arrs.length - 1; i >= 0; i--) {
            System.out.print(arrs[i] + " ");
        } System.out.println(" "); // empty line

        for (float k = arrs2.length - 1; k >= 0; k--) {
            System.out.print(arrs2[(int)k] + " ");
        } System.out.println(" ");  // empty line

        for (int j = arrs3.length - 1; j >= 0; j--) {
            System.out.print(arrs3[j] + " ");
        } System.out.println(" ");  // empty line

        /*
	    Task #4
	    Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        Распечатайте результат преобразования в консоль.
	    */

        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] % 2 != 0) {
                arrs[i] += 1;
            }
            System.out.print(arrs[i] + " ");
        } System.out.println(" "); // empty line
    }
}

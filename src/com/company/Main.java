package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList();
        ArrayList<String> listB = new ArrayList();
        System.out.println("Введите слова");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }
        System.out.println("Введите слова");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }
        System.out.println("Список А " + listA);
        System.out.println("Список Б " + listB);
        Collections.reverse(listB);
        System.out.println("Список Б реверс " + listB);

        ArrayList<String> listC = new ArrayList<>();
        ListIterator<String> b = listB.listIterator();
        ListIterator<String> a = listA.listIterator();
        for (int i = 0; i < listA.size(); i++) {
            listC.add(a.next());
            listC.add(b.next());
        }
        System.out.println("Список С " + listC);
        Collections.sort(listC, Comparator.comparing(String::length));
        System.out.println("Список С по длине " + listC);


    }
}

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class DZ {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите слова");
        for (int i = 0; i < 5; i++) {
            try {
                listA.add(bufferRead.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(listA);
        System.out.println("Введите слова");
        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            try {
                listB.add(bufferRead.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Список В " + listB);
        Collections.reverse(listB);
        System.out.println("Список В реверес " +listB);
        ArrayList<String> listC = new ArrayList<>();
        ListIterator<String> Iterb = listB.listIterator();
        ListIterator<String> Itera = listA.listIterator();
        for (int i = 0; i < listA.size(); i++) {
            listC.add(Itera.next());
            listC.add(Iterb.next());
        }System.out.println("Список С "+listC);


        Collections.sort(listC, Comparator.comparing(String::length));
        System.out.println("Список С "+listC);
    }
}

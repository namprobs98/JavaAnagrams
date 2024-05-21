/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.javaanagrams;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nhat Anh
 */
public class JavaAnagrams {

    public static boolean areAnagrams(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        //Nếu độ dài 2 string không bằng nhau
        if (a.length() != b.length()) {
            return false;
        }
        //Convert từ string sang array
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();

        //Sort array
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        return Arrays.equals(charArrayA, charArrayB);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (areAnagrams(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

    }
}

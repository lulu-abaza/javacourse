/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.human;
import java.util.Scanner;

/**
 *
 * @author connect
 */
public class Main {
    static void checkAge() {
        Scanner myObj = new Scanner(System.in);
        int age = myObj.nextInt();
        if(age < 18) {
            throw new ArithmeticException("access denied");
        } else {
            System.out.println("access granted");
        }
    }
      public static void main(String[ ] args) {
          checkAge();
      }
}

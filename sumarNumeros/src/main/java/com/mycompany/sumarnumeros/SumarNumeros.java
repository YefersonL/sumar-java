/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumarnumeros;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class SumarNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
    }
}

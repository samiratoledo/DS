/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double nvalor;

        System.out.println("CALCULADORA");

        System.out.printf("Digite 1 para Youtube e 2 para Twitch: ");
        int plat = sc.nextInt();

        System.out.printf("Digite os Donates: ");
        double valor = sc.nextDouble();

        System.out.printf("Digite os Subs: ");
        int subs = sc.nextInt();

        if (valor <= 100) {
            System.out.println("Saldo: " + valor);
            System.out.println("Subs: " + subs);
            System.out.println("Saldo insuficiente para saque mínimo");

        } else if (valor > 100) {

            if (plat == 1) {
                if (valor > 100) {
                    nvalor = valor * 0.7;
                    System.out.println("Saldo: R$" + nvalor);
                    System.out.println("Subs: " + subs);
                } else if (valor <= 100) {
                    System.out.println("Saldo: " + valor);
                    System.out.println("Subs: " + subs);
                    System.out.println("Saldo insuficiente para saque mínimo");
                }

                if (plat == 2) {
                    if (valor > 100) {
                        nvalor = valor * 0.5;
                        System.out.println("Saldo: R$" + nvalor);
                        System.out.println("Subs: " + subs);
                    } else if (valor <= 100) {
                        System.out.println("Saldo: " + valor);
                        System.out.println("Subs: " + subs);
                        System.out.println("Saldo insuficiente para saque mínimo");
                    }

                }

            }

        }
    }
}

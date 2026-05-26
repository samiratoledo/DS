package javaapplication1;

import java.util.Scanner;
import javax.swing.*;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nvalor = 0;

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

            if (plat == 2) {

                nvalor = valor * 0.5;
                System.out.println("Saldo: R$" + nvalor);
                System.out.println("Subs: " + subs);

            } else if (plat == 1) {

                nvalor = valor * 0.7;
                System.out.println("Saldo: R$" + nvalor);
                System.out.println("Subs: " + subs);

            }

        }

    }

}

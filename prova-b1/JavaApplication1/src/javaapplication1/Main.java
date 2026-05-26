package javaapplication1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main {
    public static void main(String[] args) {
        // ### Opção 4: O "Filtro de Streamer" (Cálculo de Donates/Sub)

        // **Cenário:** Um streamer da Twitch/YouTube quer saber quanto ele vai receber
        // "limpo" no final do mês após as taxas das plataformas.

        // - **Entradas (POST):** Valor Total de Donates, Número de "Subs" (Inscrições)
        // e Plataforma (Twitch ou YouTube).
        // - **Lógica de Cálculo:**
        // - Na **Twitch**, a plataforma fica com 50% do valor dos Subs.
        // - No **YouTube**, a taxa é de 30%.
        // - **Desafio:** Se o valor final for menor que R$ 100,00, exibir um aviso:
        // "Saldo insuficiente para saque mínimo".

        JFrame janela = new JFrame("O Filtro de Streamer (Cálculo de Donates/Sub)");
        JTextArea area = new JTextArea();

        janela.add(janela);
        janela.setSize(300, 500);
        janela.setVisible(true);
        
        JLabel label = new JLabel();

        label.setText("subs");
        label.setText("donetes");
    

        double valor = 0;
        String plat = "yt";
        int subs = 0;

        // if(valor<=100)
        // {
        // ("Saldo insuficiente para saque mínimo");

        // } else if(valor > 100) {

        // if (plat == "yt") {
        // valor = valor * 0.7;
        // "Saldo: " + valor;
        // } else if (plat == "tw") {
        // valor = valor * 0.5;
        // "Saldo: R$" + valor;
        // }

        // }
    }
}

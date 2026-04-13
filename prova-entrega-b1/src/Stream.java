import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Stream {
    public static void main(String[] args) throws Exception {

        /*
         * ### Opção 4: O "Filtro de Streamer" (Cálculo de Donates/Sub)
         ** 
         * Cenário:** Um streamer da Twitch/YouTube quer saber quanto ele vai receber
         * "limpo" no final do mês após as taxas das plataformas.
         * 
         * - **Entradas (POST):** Valor Total de Donates, Número de "Subs" (Inscrições)
         * e Plataforma (Twitch ou YouTube).
         * - **Lógica de Cálculo:**
         * - Na **Twitch**, a plataforma fica com 50% do valor dos Subs.
         * - No **YouTube**, a taxa é de 30%.
         * - **Desafio:** Se o valor final for menor que R$ 100,00, exibir um aviso:
         * "Saldo insuficiente para saque mínimo".
         */

        JFrame janela = new JFrame("O \"Filtro de Streamer\" (Cálculo de Donates/Sub)");

        janela.setLayout(null);
        janela.setSize(360, 400);

        JLabel labelDonates = new JLabel("Valor total de Donates: ");
        labelDonates.setBounds(20, 20, 300, 30);

        JTextField inputDonates = new JTextField();
        inputDonates.setBounds(20, 50, 300, 30);

        JLabel labelSubs = new JLabel("Valor total de Subs: ");
        labelSubs.setBounds(20, 80, 300, 30);

        JTextField inputSubs = new JTextField();
        inputSubs.setBounds(20, 110, 300, 30);

        JLabel labelPlat = new JLabel("Plataforma: ");
        labelPlat.setBounds(20, 140, 300, 30);

        String opcoesEnvio[] = { "YouTube", "Twitch" };
        JComboBox<String> comboEnvio = new JComboBox<>(opcoesEnvio);
        comboEnvio.setBounds(20, 170, 300, 30);

        JButton btn = new JButton("Calcular");
        btn.setBounds(20, 210, 100, 30);

        JLabel labelResultado = new JLabel("Valor: R$ 0,00");
        labelResultado.setFont(new Font("Arial", Font.BOLD, 16));
        labelResultado.setBounds(20, 290, 340, 30);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double donates = Double.parseDouble(inputDonates.getText());
                int subs = Integer.parseInt(inputSubs.getText());
                String plat = (String) comboEnvio.getSelectedItem();
                double valor = donates;

                if (plat.equals("YouTube")) {
                    valor *= 0.7;
                } else if (plat.equals("Twitch")) {
                    valor *= 0.5;
                }

                if (valor < 100) {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque mínimo");
                }
                labelResultado.setText(String.format("Total: R$ %.2f", valor));
                    labelResultado.setForeground(new Color(50, 50, 50)); 
            }
        });

        janela.add(labelDonates);
        janela.add(inputDonates);
        janela.add(labelSubs);
        janela.add(inputSubs);
        janela.add(labelPlat);
        janela.add(comboEnvio);
        janela.add(btn);
        janela.add(labelResultado);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

}

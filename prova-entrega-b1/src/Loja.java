import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Loja {
    public static void main(String[] args) throws Exception {

        /*
         * ### Opção 2: Sistema de Vendas "Black Friday" (Cupom de Desconto)
         ** 
         * Cenário:** Uma loja quer aplicar descontos dinâmicos no carrinho de compras
         * dependendo do valor gasto e de um código promocional.
         * 
         * - **Requisitos Técnicos:**
         * - Campos: Valor da Compra e Código do Cupom (Texto).
         * - **Lógica de Cálculo:**
         * - Se o valor for acima de R$ 500,00, ganha 10% de desconto automático.
         * - Se o usuário digitar o cupom "AMIGAO10", ganha mais R$ 10,00 de desconto
         * fixo.
         * - Exibir o "Valor Original", o "Desconto Aplicado" e o "Valor Final".
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

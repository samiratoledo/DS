import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Loja {
      public void funcLoja() {

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

        JFrame janela = new JFrame("Sistema de Vendas \"Black Friday\" (Cupom de Desconto)");

        janela.setLayout(null);
        janela.setSize(360, 350);

        JLabel labelCompras = new JLabel(" Valor da Compra: ");
        labelCompras.setBounds(20, 20, 300, 30);

        JTextField inputCompras = new JTextField();
        inputCompras.setBounds(20, 50, 300, 30);

        JLabel labeCupom = new JLabel("Código do Cupom: ");
        labeCupom.setBounds(20, 80, 300, 30);

        JTextField inputCupom = new JTextField();
        inputCupom.setBounds(20, 110, 300, 30);

        JButton btn = new JButton("Calcular");
        btn.setBounds(20, 150, 100, 30);

        JLabel labelSub = new JLabel("Subtotal: R$ 0,00");
        labelSub.setFont(new Font("Arial", Font.BOLD, 16));
        labelSub.setBounds(20, 210, 340, 30);

        JLabel labelDesconto = new JLabel("Desconto: R$ 0,00");
        labelDesconto.setFont(new Font("Arial", Font.BOLD, 16));
        labelDesconto.setBounds(20, 240, 340, 30);

        JLabel labelTotal = new JLabel("Total: R$ 0,00");
        labelTotal.setFont(new Font("Arial", Font.BOLD, 16));
        labelTotal.setBounds(20, 270, 340, 30);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double valor = Double.parseDouble(inputCompras.getText());
                String cupom = (String) inputCupom.getText();
                double fvalor = valor;
                double desconto = 0;

                if (valor > 500) {
                    fvalor *= 0.9;
                    desconto = valor * 0.1;
                }

                if (cupom.equals("AMIGAO10")) {
                    fvalor -= 10;
                }

                labelSub.setText(String.format("SubTotal: R$ %.2f", valor));

                labelDesconto.setText(String.format("Desconto: R$- %.2f", desconto));
                labelDesconto.setForeground(new Color(180, 0, 0));

                labelTotal.setText(String.format("Total: R$ %.2f", fvalor));
                labelTotal.setForeground(new Color(0, 150, 0));
            }
        });

        janela.add(labelCompras);
        janela.add(inputCompras);
        janela.add(labeCupom);
        janela.add(inputCupom);
        janela.add(btn);
        janela.add(labelSub);
        janela.add(labelDesconto);
        janela.add(labelTotal);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

}

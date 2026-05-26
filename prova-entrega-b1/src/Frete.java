import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Frete {

      public void funcFrete() {

        /*
         * ### Opção 1: O Simulador de Frete "Logística Express"
         ** 
         * Cenário:** Uma transportadora precisa de um sistema que calcule o valor do
         * frete com base na distância e no peso da mercadoria.
         * 
         * - **Requisitos Técnicos:**
         * - Captar: Distância (km), Peso (kg) e Tipo de Envio (Normal ou Expresso).
         * - **Lógica de Cálculo:**
         * - Valor base: R$ 10,00.
         * - Cobrar R$ 0,50 por km rodado.
         * - Se o peso for maior que 20kg, adicionar uma taxa de R$ 30,00.
         * - Se o envio for "Expresso", o valor total aumenta em 20%.
         */

        JFrame janela = new JFrame("O Simulador de Frete Logística Express");
        
        janela.setLayout(null); 
        janela.setSize(400, 350);

        JLabel labelDistancia = new JLabel("Digite a distância (km):");
        labelDistancia.setBounds(20, 20, 200, 30);
        
        JTextField inputDistancia = new JTextField();
        inputDistancia.setBounds(20, 50, 340, 30);

        JLabel labelPeso = new JLabel("Digite o peso (kg):");
        labelPeso.setBounds(20, 90, 200, 30); 

        JTextField inputPeso = new JTextField();
        inputPeso.setBounds(20, 120, 340, 30);

        JLabel labelEnvio = new JLabel("Tipo de Envio:");
        labelEnvio.setBounds(20, 150, 200, 30);

        String opcoesEnvio [] = {"Normal", "Expresso"};
        JComboBox<String> comboEnvio = new JComboBox<>(opcoesEnvio);
        comboEnvio.setBounds(20, 180, 340, 30);

        JButton btn = new JButton("Calcular");
        btn.setBounds(20, 220, 100, 30);
        
        JLabel labelResultado = new JLabel("Total: R$ 0,00");
        labelResultado.setFont(new Font("Arial", Font.BOLD, 16));
        labelResultado.setBounds(20, 270, 340, 30);

     
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    double distancia = Double.parseDouble(inputDistancia.getText());
                    double peso = Double.parseDouble(inputPeso.getText());
                    String tipo = (String) comboEnvio.getSelectedItem();

                    double total = 10.00; // Valor base
                    total += distancia * 0.50; // R$ 0,50 por km

                    if (peso > 20) {
                        total += 30.00; // Taxa peso extra
                    }

                    if (tipo.equals("Expresso")) {
                        total *= 1.20; 
                    }

                    labelResultado.setText(String.format("Total: R$ %.2f", total));
                    labelResultado.setForeground(new Color(0, 128, 0)); 
            }
        });

        janela.add(labelDistancia);
        janela.add(inputDistancia);
        janela.add(labelPeso);
        janela.add(inputPeso);
        janela.add(labelEnvio);
        janela.add(comboEnvio);
        janela.add(btn);
        janela.add(labelResultado);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
} 
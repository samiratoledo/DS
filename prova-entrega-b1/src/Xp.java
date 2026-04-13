import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Xp {
      public void funcXp() {

        /*
         * ### Opção 3: O "Calculador de XP" (Sistema de RPG/Games)
         ** 
         * Cenário:** Um novo jogo de RPG precisa de uma página para calcular se o
         * jogador subiu de nível após uma missão.
         * 
         * - **Entradas (POST):** Nível Atual, XP Acumulado e Dificuldade da Missão
         * (Fácil, Média, Difícil).
         * - **Lógica de Cálculo:**
         * - Cada missão dá uma base de 100 XP.
         * - Se a dificuldade for **Média**, multiplica por 1.5. Se for **Difícil**,
         * multiplica por 2.0.
         * - **O "Level Up":** Se o novo total de XP for maior que 1000, exibe uma
         * mensagem: "PARABÉNS! Você subiu para o nível X+1".
         */

        JFrame janela = new JFrame(" O \"Calculador de XP\" (Sistema de RPG/Games)");

        janela.setLayout(null);
        janela.setSize(360, 360);

        JLabel labelNivel = new JLabel("Nível Atual: ");
        labelNivel.setBounds(20, 20, 300, 30);

        JTextField inputNivel = new JTextField();
        inputNivel.setBounds(20, 50, 300, 30);

        JLabel labelXp = new JLabel(" XP Acumulado: ");
        labelXp.setBounds(20, 80, 300, 30);

        JTextField inputXp = new JTextField();
        inputXp.setBounds(20, 110, 300, 30);

        JLabel labelMissao = new JLabel("Dificuldade da Missão: ");
        labelMissao.setBounds(20, 140, 300, 30);

        String opcoesEnvio[] = { "Fácil", "Médio", "Difícil" };
        JComboBox<String> comboEnvio = new JComboBox<>(opcoesEnvio);
        comboEnvio.setBounds(20, 170, 300, 30);

        JButton btn = new JButton("Calcular");
        btn.setBounds(20, 210, 100, 30);

        JLabel labelResultado = new JLabel("XP: 0");
        labelResultado.setFont(new Font("Arial", Font.BOLD, 16));
        labelResultado.setBounds(20, 260, 340, 30);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int nivel = Integer.parseInt(inputNivel.getText());
                int xp = Integer.parseInt(inputXp.getText());
                String missao = (String) comboEnvio.getSelectedItem();
                xp += 100;

                if (missao.equals("Médio")) {
                    xp *= 1.5;
                } else if (missao.equals("Difícil")) {
                    xp *= 2;
                }

                
                if (xp > 1000) {
                    JOptionPane.showMessageDialog(null, "Level Up! \nPARABÉNS! Você subiu para o nível " + nivel + 1);
                }
                labelResultado.setText(String.format("XP final: " + xp));
                labelResultado.setForeground(new Color(0, 128, 0));
            }
        });

        janela.add(labelNivel);
        janela.add(inputNivel);
        janela.add(labelXp);
        janela.add(inputXp);
        janela.add(labelMissao);
        janela.add(comboEnvio);
        janela.add(btn);
        janela.add(labelResultado);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

}

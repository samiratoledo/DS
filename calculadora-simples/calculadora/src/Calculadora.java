import javax.swing.*;
import java.awt.*;
//CODIGO COMPLETO NO DRIVE

public class Calculadora {
    private JFrame janela;
    private JTextField visorEquacao;
    private JTextField visorAtual;

    private double resultado = 0;
    private String operadorPendente = "+";
    private boolean novoNumero = true;

    public Calculadora() {

        janela = new JFrame();
        janela.setSize(350, 450);
        janela.setTitle("Calculadora");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelVisores = new JPanel(new GridLayout(2, 1, 5, 4));

        visorEquacao = new JTextField();
        visorEquacao.setEditable(false);
        visorEquacao.setHorizontalAlignment(JTextField.RIGHT);

        visorAtual = new JTextField("0");
        visorAtual.setEditable(false);
        visorAtual.setHorizontalAlignment(JTextField.RIGHT);
        visorAtual.setFont(new Font("Arial", Font.BOLD, 28));

        painelVisores.add(visorEquacao);
        painelVisores.add(visorAtual);

        janela.add(painelVisores, BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel(new GridLayout(4, 4));

        String textos[] = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String texto : textos) {
            JButton btn = new JButton(texto);
            btn.addActionListener(e -> tratarClique(texto));
            painelBotoes.add(btn);
        }

        janela.add(painelBotoes);

        janela.setVisible(true);
    }

    private void tratarClique(String comando) {
        
        if ("0123456789".contains(comando)) {
            if (novoNumero) {
                visorAtual.setText(comando);
                novoNumero = false;
            } else 
            visorAtual.setText(comando);

        } else if ("+-*/=".contains(comando)) {
            operadorPendente = comando;
            calcular(Double.parseDouble(visorAtual.getText()));
            if (comando.equals("=")) {
              //  visorEquacao.setText(visorEquacao.getText() + visorAtual.getText() +" " + visorAtual.setText(String.valueOf(resultado)));
                visorAtual.setText(String.valueOf(resultado));
            }
            visorEquacao.setText(visorEquacao.getText() + visorAtual.getText() + " " + comando + " ");
        }
    }

    private void calcular(double valor) {
        if (operadorPendente.equals("+")) {
            resultado += valor;
        } else if (operadorPendente.equals("-")) {
            resultado -= valor;
        } else if (operadorPendente.equals("*")) {
            resultado *= valor;
        } else if (operadorPendente.equals("/")) {
            resultado /= valor;
        }
    }

}

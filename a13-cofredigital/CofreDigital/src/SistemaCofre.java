import java.awt.FlowLayout;
import javax.swing.*;

class Cofre {

    private String senhaEstrutural;
    private double dinheiroInterno;
    private boolean estaAberto;

    public Cofre(String senhaInicial) {
        this.senhaEstrutural = senhaInicial;
        this.dinheiroInterno = 0.0;
        this.estaAberto = false;
    }

    public double getDinheiroInterno() {
        return dinheiroInterno;
    }

    public boolean getEstaAberto() {
        return estaAberto;
    }

    public void tentarAbrir(String senhaDigitada) {
        if (senhaEstrutural.equals(senhaDigitada)) {
            estaAberto = true;
        }
    }

    public boolean depositar(double valor) {
        if (estaAberto == true && valor > 0) {
            dinheiroInterno += valor;
            return true;
        }
        return false;
    }
}

// ==========================================
// INTERFACE GRÁFICA
// ==========================================
public class SistemaCofre extends JFrame {

    private Cofre meuCofre = new Cofre("1234");

    public SistemaCofre() {

        super("Cofre Digital v1.0");
        setLayout(new FlowLayout());

        JTextField txtSenha = new JTextField(8);
        JTextField txtValor = new JTextField(6);

        JButton btnAbrir = new JButton("Tentar Abrir");
        JButton btnDepositar = new JButton("Colocar Dinheiro");

        JLabel lblStatus = new JLabel("Status: TRANCADO | Saldo: R$ 0.00");

        btnAbrir.addActionListener(e -> {

            meuCofre.tentarAbrir(txtSenha.getText());

            if (meuCofre.getEstaAberto()) {
                lblStatus.setText("Status: ABERTO | Saldo: R$ " + meuCofre.getDinheiroInterno());
            } else {
                JOptionPane.showMessageDialog(this, "Senha Incorreta!");
            }
        });

        btnDepositar.addActionListener(e -> {

            try {
                double valor = Double.parseDouble(txtValor.getText());
                boolean sucesso = meuCofre.depositar(valor);

                if (sucesso) {
                    lblStatus.setText("Status: ABERTO | Saldo: R$ " + meuCofre.getDinheiroInterno());

                } else {
                    JOptionPane.showMessageDialog(this, "Depósito inválido! Abra o cofre e digite um valor maior que zero.");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Digite um número válido!");
            }
        });

        add(new JLabel("Senha:"));
        add(txtSenha);
        add(btnAbrir);

        add(new JLabel("Valor (R$):"));
        add(txtValor);
        add(btnDepositar);

        add(lblStatus);

        setSize(320, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        new SistemaCofre().setVisible(true);
    }
}
public class Conta {
    String titular;
    double saldo;

    public void deposita(double valor) {
     this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo < valor) {
            return false; // Saldo insuficiente
        } else {
            this.saldo -= valor;
            return true; // Sucesso
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }

}

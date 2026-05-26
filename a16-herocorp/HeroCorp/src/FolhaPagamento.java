import java.util.ArrayList;

public class FolhaPagamento {

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Assalariado("Ana", "987654321-00", 6000.00));
        funcionarios.add(new Assalariado("Mariana", "321654987-11", 8500.00));
        funcionarios.add(new Assalariado("Roberto", "741852963-22", 4200.00));
        funcionarios.add(new Assalariado("Fernanda", "159357486-33", 12500.00));

        funcionarios.add(new Comissionado("Lucas", "258369147-44", 0.08, 15000));
        funcionarios.add(new Comissionado("Patrícia", "456123789-55", 0.12, 32000));
        funcionarios.add(new Comissionado("Ricardo", "789456123-66", 0.07, 54000));
        funcionarios.add(new Comissionado("Beatriz", "951753852-77", 0.15, 21000));
        funcionarios.add(new Comissionado("Carlos", "123456789-00", 0.10, 4000));
        funcionarios.add(new Comissionado("José", "145676789-00", 0.20, 100000));

        for (Funcionario f : funcionarios) {
            double valor = f.vencimentos();
            if (f instanceof Comissionado) {
                valor += 200.00;
            }
            System.out.println(f.toString() + " | Vencimento: " + String.format("%,.2f", valor));

        }
    }

}

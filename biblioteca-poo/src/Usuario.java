
public class Usuario {

    private final String codigo;
    private final String nome;
    private final String cpf;
    private final String email;
    private static int contador = 1;
    private int numeroLivros = 0;

    public Usuario(String nome, String cpf, String email) {
        this.codigo = "U" + contador++;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public static boolean validarEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    public static boolean validarCPF(String cpf) {

        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11) {
            return false;
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int soma = 0;
        int peso = 10;

        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * peso;
            peso--;
        }

        int digito1 = 11 - (soma % 11);
        if (digito1 >= 10) {
            digito1 = 0;
        }

        if (digito1 != (cpf.charAt(9) - '0')) {
            return false;
        }

        soma = 0;
        peso = 11;

        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * peso;
            peso--;
        }

        int digito2 = 11 - (soma % 11);
        if (digito2 >= 10) {
            digito2 = 0;
        }

        return digito2 == (cpf.charAt(10) - '0');
    }
    /*public int getNumeroLivros() {
        return numeroLivros;
    }*/
}

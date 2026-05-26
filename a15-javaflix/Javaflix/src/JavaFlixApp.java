
class Midia {
    protected String titulo;
    protected int anoLancamento;

    // Construtor da classe pai
    public Midia(String titulo, int anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public void exibirFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }
}

// ========================================================
// TODO: VOCÊ DEVE IMPLEMENTAR AS SUBCLASSES AQUI (VEJA O DESAFIO)
// ========================================================

class Filme extends Midia {
    private int duracaoEmMinutos;

    public Filme(String titulo, int anoLancamento, int duracaoEmMinutos) {
        super(titulo, anoLancamento);
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
    }

}

class Serie extends Midia {
    private int totalTemporadas;

    public Serie(String titulo, int anoLancamento, int totalTemporadas) {
        super(titulo, anoLancamento);
        this.totalTemporadas = totalTemporadas;
    }

    @Override
    public void exibirFicha() {
        super.exibirFicha();
        if (totalTemporadas == 1) {
            System.out.println("Total de Temporadas: " + totalTemporadas + " temporada");
        } else {
            System.out.println("Total de Temporadas: " + totalTemporadas + " temporadas");
        }
    }
}

// CLASSE PRINCIPAL (Não mexer aqui, serve para testar seu código)
public class JavaFlixApp {
    public static void main(String[] args) {
        System.out.println("--- Carregando Catálogo JavaFlix ---");

        // Instanciando um Filme (Título, Ano, Duração)
        Filme filme1 = new Filme("Inception", 2010, 148);

        // Instanciando outro Filme
        Filme filme2 = new Filme("Interestelar", 2014, 169);

        // Instanciando uma Série (Título, Ano, Temporadas)
        Serie serie1 = new Serie("Stranger Things", 2016, 4);

        // Instanciando outra Série
        Serie serie2 = new Serie("Breaking Bad", 2008, 5);

        // Testando os métodos herdados e sobrescritos
        System.out.println("\n[Ficha do Filme]");
        filme1.exibirFicha();

        System.out.println("\n[Ficha do Filme]");
        filme2.exibirFicha();

        System.out.println("\n[Ficha da Série]");
        serie1.exibirFicha();       

        System.out.println("\n[Ficha da Série]");
        serie2.exibirFicha();
    }
}

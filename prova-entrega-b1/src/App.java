import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String opcao = JOptionPane.showInputDialog(null,
                "Escolha uma opção: \n \n1 - O Simulador de Frete \"Logística Express\" \n2 -  Sistemas de Vendas \"Black Friday\" \n3 - O \"Calculador de XP\" (Sistema de RPG/Games) \n4 - O \"Filtro de Streamer\" (Cálculo de Donates/Subs) \n \n");

        switch (opcao) {
            case "1":
                Frete janelaFrete = new Frete();
                janelaFrete.funcFrete();
                break;

            case "2":
                Loja janelaDesc = new Loja();
                janelaDesc.funcLoja();
                break;

            case "3":
                Xp janelaXp = new Xp();
                janelaXp.funcXp();
                ;
                break;

            case "4":
                Stream janelaStream = new Stream();
                janelaStream.funcStream();
                break;

            default:
                break;
        }
    }
}
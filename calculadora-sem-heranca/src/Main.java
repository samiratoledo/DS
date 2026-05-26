import javax.swing.UIManager;

public class Main {
  public static void main(String[] args) {
    // Estilo nativo do Windows
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
      e.printStackTrace();
    }
    // new CalculadoraSimples();
    new CalculadoraSimplesSemHeranca();
  }
}

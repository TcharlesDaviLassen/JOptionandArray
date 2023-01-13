package javas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Jopionexamples {

    // PARENTCOMPONENT:
    // O JOptionPane precisa de um componente do qual será derivado, o mais comum é
    // usar (e criar um JFrame para isso)
    // que é o que ocorre no exemplo acima. Desta forma a interface do JOptionPane
    // usará o Jframe (ou seja lá qual for a classe pai)
    // para renderizar-se.

    public static void main(String[] args) {

        String digiteUmNumero = JOptionPane.showInputDialog(
                "Digite qual modal quer que aparessa\n" +
                "1 para modal MessageDialog\n" + 
                "2 para modal InputDialog");
        Integer number = Integer.parseInt(digiteUmNumero);

        if (number == 1) {

            String erro = "Erro 404: não foi possível encontrar o batman";

            // Cria um JFrame
            JFrame frame = new JFrame("JOptionPane exemplo");

            // Cria o JOptionPane por showMessageDialog
            JOptionPane.showMessageDialog(frame,
                    "Houve um problema ao procurar o batman:\n\n" + erro + ".", // mensagem
                    "Erro 404", // titulo da janela
                    JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showInputDialog(null, "Qual é o valor do produto de compra", "").toUpperCase();
        }

        System.exit(0);

    }

}

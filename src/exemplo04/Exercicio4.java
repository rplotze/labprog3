package exemplo04;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) {

        String brindes[] = {
            "Caneta", "Chaveiro", "Boné",
            "Teclado", "Mouse", "Mousepad",
            "Camiseta", "Caneca", "Copo",
            "Viagem"
        };
        exibirSorteado(sorteio(brindes.length), brindes);
    }

    public static int sorteio(int total) {
        return (int) (Math.random() * total)+1;
    }

    public static void exibirSorteado(int numero, String b[]) {
        JOptionPane.showMessageDialog(
            null,
            String.format(
                "BRINDES \n%s \n\nNÚMERO SORTEADO: %d \nBRINDE: %s",
                Arrays.toString(b), numero, b[numero-1].toUpperCase()
            )
        );
    }

}

package exemplo04;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exercicio1 {
    
    public static final double VALOR = 22.5;

    public static void main(String[] args) {

        double notas[] = new double[5];
        //double notas[] = {8.5, 9.2, 6.3, 4.9, 9.7};
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {

            notas[i] = Double.parseDouble(
                JOptionPane.showInputDialog(
                    "Nota " + (i+1) + ": "
                )
            );
            soma += notas[i];
        }

        Arrays.sort(notas);

        int i = notas.length - 1;
        StringBuilder sb = new StringBuilder();
        sb.append("NOTAS").append("\n");
        while (i >= 0) {
            sb.append(String.format("%.1f\n", notas[i]));
            i--;
        }
        sb.append(
            String.format("Média: %.1f\n", (soma / notas.length))
        );
        JOptionPane.showMessageDialog(null, sb);
    }

}

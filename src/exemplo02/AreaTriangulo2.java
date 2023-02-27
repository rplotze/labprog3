package exemplo02;

import javax.swing.JOptionPane;

public class AreaTriangulo2 {
    
    public static void main(String[] args) {
        
        String str1 = JOptionPane.showInputDialog(
            "Informe a base"
        );
        String str2 = JOptionPane.showInputDialog(
            "Informe a altura"
        );
        double area = (Double.parseDouble(str1)
                *Double.parseDouble(str2))/2;
        JOptionPane.showMessageDialog(
            null,
            String.format("Área = %.2f",area),
            "Triângulo",
            JOptionPane.INFORMATION_MESSAGE
        );
        
    }
    
}

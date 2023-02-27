package exemplo02;

import javax.swing.JOptionPane;

public class IMCCalculadora {
    
    public static void main(String[] args) {
        
        String str1 = JOptionPane.showInputDialog("Peso");
        String str2 = JOptionPane.showInputDialog("Altura");
        double peso = Double.parseDouble(str1);
        double altura = Double.parseDouble(str2);
        JOptionPane.showMessageDialog(null, 
            String.format("IMC= %.2f", (peso/Math.pow(altura,2)))
        );
    }
    
}

package exemplo04;

import javax.swing.JOptionPane;

public class Exercicio3 {
    
    public static void main(String[] args) {
        exibirMensagem(lerIdade());
    }
    
    public static int lerIdade(){
        return Integer.parseInt(
            JOptionPane.showInputDialog("Informe a idade")
        );
    }
    
    public static void exibirMensagem(int idade){
        String msg = "";
        if (idade >=0 && idade <=2){
            msg = "Criança";
        }else if (idade >=3 && idade <=11){
            msg = "Criança";
        }else if (idade >=12 && idade <=19){
            msg = "Adolescente";
        }else if (idade >=20 && idade <=30){
            msg = "Jovem";
        }else if (idade >=31 && idade <=60){
            msg = "Adulto";
        }else if (idade > 60){
            msg = "Idoso";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    
}

package exemplo03;

import javax.swing.JOptionPane;

public class Tabuada {
    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Informe um número"
            )
        );
        
        StringBuilder sb = new StringBuilder();
        /* SOLUÇÃO 1 : FOR
        for (int i = 1; i <= 10; i++) {
            sb.append(
                String.format(
                    "%d x %d = %d\n", num, i, (num*i)
                )
            );
        }
        */
        
        //SOLUÇÃO 2: WHILE
        int i = 1;
        while (i<=10){
            sb.append(
                String.format(
                    "%d x %d = %d\n", num, i, (num*i)
                )
            );
            i++;
        }
        
        
        JOptionPane.showMessageDialog(null,sb.toString());
    }
    
}

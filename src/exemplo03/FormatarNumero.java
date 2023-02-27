package exemplo03;

import java.text.DecimalFormat;

public class FormatarNumero {
    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat();
        
        double v1 = 70;
        df.applyPattern("#0.00");
        System.out.println(df.format(v1));
        
        double v2 = 2583.65;
        df.applyPattern("R$ #,##0.00");
        System.out.println(df.format(v2));
    }
    
}

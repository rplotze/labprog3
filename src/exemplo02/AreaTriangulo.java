package exemplo02;

import java.util.Scanner;

public class AreaTriangulo {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a base: ");
        double base = entrada.nextDouble();
        
        System.out.print("Informe a altura: ");
        double altura = entrada.nextDouble();
        
        System.out.println(String.format(
            "Área = %.2f",((base*altura)/2)
        ));
        
    }
    
}

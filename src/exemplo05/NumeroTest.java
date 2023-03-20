package exemplo05;

public class NumeroTest {
    
    public static void main(String[] args) {
        
        Numero n1 = new Numero();
        n1.numero = 25;
        System.out.println("Raiz Quadrada: " + n1.raizQuadrada());
        System.out.println("Quadrado.....: " + n1.quadrado());
        System.out.println("Cubo.........: " + n1.cubo());
        
    }
    
}

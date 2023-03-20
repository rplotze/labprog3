package exemplo06;

public class BrinquedoTest {
    
    public static void main(String[] args) {
        Brinquedo b1 = new Brinquedo();
        b1.setNome("Bola");
        b1.setFaixaetaria("0 a 2");
        b1.setPreco(10.00);
        System.out.println(b1);
        
        Brinquedo b2 = new Brinquedo(
            "Skate","acima de 50", 120.00
        );
        System.out.println(b2);
    }
    
}

package exemplo05;

public class CarroTest {
    
    public static void main(String[] args) {
        
        //Criação de um OBJETO da classe Carro
        Carro fusca = new Carro();
        fusca.fabricante = "VW";
        fusca.modelo = "Fusca";
        fusca.cor = "Amarelo";
        fusca.ano = 1968;
        fusca.ligar();
        
        Carro corcel = new Carro();
        corcel.fabricante = "Ford";
        corcel.modelo = "Corcel II";
        corcel.cor = "Cinza";
        corcel.ano = 1982;
        corcel.ligar();
        
        //Criação de um VETOR DE OBJETOS da classe Carro
        Carro carros[] = new Carro[3];
        
        carros[0] = new Carro();
        carros[0].fabricante = "Fabricante 1";
        carros[0].modelo = "Modelo 1";
        
        carros[1] = new Carro();
        carros[1].fabricante = "Fabricante 2";
        carros[1].modelo = "Modelo 2";
        
        carros[2] = new Carro();
        carros[2].fabricante = "Fabricante 3";
        carros[2].modelo = "Modelo 3";
        
        for(Carro c : carros){
            System.out.println("Fabricante: " + c.fabricante);
            System.out.println("Modelo....: " + c.modelo);
        }
        
        for (int i = 0; i < carros.length; i++) {
            Carro c = carros[i];
            System.out.println("Fabricante: " + c.fabricante);
            System.out.println("Modelo....: " + c.modelo);
        }
        
    }
    
}
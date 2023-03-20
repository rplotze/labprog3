package exemplo05;

public class PessoaTest {

    public static void main(String[] args) {
        
        Pessoa joao = new Pessoa();
        joao.nome = "João da Silva";
        joao.altura = 1.98;
        joao.peso = 93.50;
        System.out.println(
            String.format("IMC: %.2f",joao.imc())
        );
        
    }
}

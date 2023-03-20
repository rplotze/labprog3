package exemplo06;

public class PessoaTest {
    
    public static void main(String[] args) {
        
        Pessoa joao = new Pessoa();
        joao.setNome("João da Silva");
        joao.setEmail("joao@email.com");
        System.out.println(joao.toString());
        
        
        Pessoa ana = new Pessoa();
        System.out.println(ana.toString());
        
        Pessoa jose = new Pessoa(
            "José Antônio",
            "jose@email.com"
        );
        System.out.println(jose.toString());
    }
    
}

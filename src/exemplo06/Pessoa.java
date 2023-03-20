package exemplo06;

public class Pessoa {
    //Atributos
    private String nome;
    private String email;
    
    //CONSTRUTOR PADRÃO
    public Pessoa(){
        System.out.println(
            "Construtor padrão da classe pessoa."
        );
        this.nome = "";
        this.email = "";
    }
    //CONSTRUTOR SOBRECARREGADO
    public Pessoa(String nome, String email){
        setNome(nome);
        setEmail(email);
    }
    
    
    //Método SET
    //Enviar um dado para o objeto
    public void setNome(String nome){
        if (nome.length() >= 3){
            this.nome = nome;
        }else{
            System.err.println(
                "O nome deve ter no mínimo três caracteres."
            );
        }
    }
    
    public void setEmail(String email){
        if (email.contains("@")){
            this.email = email;
        }else{
            System.err.println(
                "O formato do email é inválido."
            );
        }
    }
    
    //Método GET
    //Retorna o dado de um objeto
    public String getNome(){
        return this.nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    //Método toString
    //Retornar todos os dados do objeto
    @Override
    public String toString(){
        return "Nome: " + this.getNome() + 
            "\nEmail: " + this.getEmail();
    }
    
}

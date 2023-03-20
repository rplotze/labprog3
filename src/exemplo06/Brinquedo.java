package exemplo06;

public class Brinquedo {
    
    private String nome;
    private String faixaetaria;
    private double preco;

    public Brinquedo() {
    }

    public Brinquedo(String nome) {
        this.nome = nome;
    }

    public Brinquedo(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Brinquedo(String nome, String faixaetaria, double preco) {
        this.nome = nome;
        setFaixaetaria(faixaetaria);
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaixaetaria() {
        return faixaetaria;
    }

    public void setFaixaetaria(String faixaetaria) {
        
        switch(faixaetaria){
            case "0 a 2":
                this.faixaetaria = faixaetaria;
                break;
            case "3 a 5":  
                this.faixaetaria = faixaetaria;
                break;
            case "6 a 10":  
                this.faixaetaria = faixaetaria;
                break;
            case "acima de 10":  
                this.faixaetaria = faixaetaria;
                break;
            default:
                System.err.println("Faixa etária inválida.");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Brinquedo{" + "nome=" + nome + ", faixaetaria=" + faixaetaria + ", preco=" + preco + '}';
    }
    
}

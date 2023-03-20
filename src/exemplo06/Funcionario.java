package exemplo06;

import java.time.LocalDate;

public class Funcionario {
    
    private String nome;
    private double salario;
    private int anocontratacao;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario, int anocontratacao) {
        this.nome = nome;
        this.salario = salario;
        this.anocontratacao = anocontratacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnocontratacao() {
        return anocontratacao;
    }

    public void setAnocontratacao(int anocontratacao) {
        this.anocontratacao = anocontratacao;
    }
    
    public double getBonificacao(){
        int tempo = LocalDate.now().getYear()-anocontratacao;
        if (tempo > 5  && tempo <=  10){
            return 0.05;
        }else if  (tempo > 10  && tempo <=  20){
            return 0.10;
        } else if (tempo > 20){
            return 0.20;
        }else{
            return 0.00;
        }
    }
    
    public double getSalarioTotal(){
        return getSalario()+(getSalario()*getBonificacao());
    }
    
    @Override
    public String toString(){
        return "Nome: " + getNome() + 
            String.format("\nSalário: R$ %.2f", getSalario()) +
            "\nAno contratação: " + getAnocontratacao() +
            String.format("\nBonificação: %.1f%%", getBonificacao()*100) +
            String.format("\nSalário Total: %.2f", getSalarioTotal());
    }
    
}

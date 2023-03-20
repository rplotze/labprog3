package exemplo05;

public class Pessoa {
    
    //Atributos
    public String nome;
    public double peso;
    public double altura;
    
    //Métodos
    public double imc(){
        return (peso/Math.pow(altura,2));
    }
    
}

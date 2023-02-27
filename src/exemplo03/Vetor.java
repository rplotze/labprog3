package exemplo03;

public class Vetor {
    
    public static void main(String[] args) {
        
        //Vetor com 5 (cinco) elementos
        int v[] = new int[5];
        
        //Preencher o vetor
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random()*100);
        }
        
        //Exibir os valores
        System.out.println("Tamanho= " + v.length);
        for (int i = 0; i < v.length; i++) {
            System.out.println(
                String.format("[%d] = %d",i,v[i])
            );
        }
        
    }
    
}

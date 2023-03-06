package exemplo04;

public class Exercicio2 {
    
    public static void main(String[] args) {
        
        int img[][] = new int[10][10];
        
        //Números aleatórios
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                img[i][j] = (int)(Math.random()*255);
            }
        }
        
        //Exibirção
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                System.out.print(img[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}

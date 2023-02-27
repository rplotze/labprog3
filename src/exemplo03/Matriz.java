package exemplo03;

public class Matriz {
    
    public static void main(String[] args) {
        
        //Matriz com 3 linhas e 4 coluna
        int mat[][] = new int[3][4];
        
        //Preencher a matriz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int)(Math.random()*10);
            }
        }
        
        //Exibir os valores na tela
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.print("\n");
        }
        
    }
    
}

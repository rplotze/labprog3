package exemplo05;


public class Bomba {
    
    public boolean status;
    
    public void ligar(int segundos){
        try {
            status = true;
            System.out.println("Bomba ligada.");
            for (int i = 0; i <  segundos; i++) {
                System.out.println(
                    "Tempo restante: " + (segundos-i) + " segundos.");
                Thread.sleep(1000);
            }          
            desligar();
        } catch (InterruptedException ex) {
            System.err.println("ERRO");
        }
        
    }
    
    public void desligar(){
        status = false;
        System.out.println("Bomba desligada.");
    }
    
}

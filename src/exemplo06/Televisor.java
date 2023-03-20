package exemplo06;

public class Televisor {
    
    private int volume;
    private int canal;
    
    public Televisor(){
        this.volume = 0;
        this.canal = 1;
    }
    
    public Televisor(int volume, int canal){
        setVolume(volume);
        setVolume(canal);
    }
    
    public void setVolume(int volume){
        if (volume >=0 && volume <=100){
            this.volume = volume;
        }else{
            System.err.println("Volume inválido.");
        }
    }
    public void setCanal(int canal){
        if (canal >=1 && canal <=999){
            this.canal = canal;
        }else{
            System.err.println("Canal inválido.");
        }
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public int getCanal(){
        return this.canal;
    }
    
    public void aumentarVolume(){
        setVolume(getVolume()+1);
    }
    
    public void reduzirVolume(){
        setVolume(getVolume()-1);
    }
    
    public void trocarCanal(int canal){
        setCanal(canal);
    }
    
    @Override
    public String toString(){
        return "Volume: " + getVolume()
               + "\nCanal: " + getCanal();
    }
    
}

package exemplo06;

public class TelevisorTest {
    
    public static void main(String[] args) {
        Televisor lg = new Televisor();
        lg.setCanal(48);
        lg.setVolume(32);
        System.out.println(lg.toString());
        lg.trocarCanal(1589);
        System.out.println(lg.toString());
    }
}

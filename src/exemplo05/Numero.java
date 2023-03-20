package exemplo05;

public class Numero {

    public int numero;

    public double raizQuadrada() {
        if (verificarNumero()) {
            return Math.sqrt(numero);
        } else {
            return 0;
        }
    }

    public int quadrado() {
        if (verificarNumero()) {
            return (int) Math.pow(numero, 2);
        } else {
            return 0;
        }
    }

    public int cubo() {
        /*
        if (verificarNumero()) {
            return (int) Math.pow(numero, 3);
        } else {
            return 0;
        }
        */
        return verificarNumero() ? 
            (int)Math.pow(numero,3) : 0;
    }

    public boolean verificarNumero() {
        /*
        if (numero > 0) {
            return true;
        } else {
            return false;
        }
        */
        
        //Operador Ternário
        return (numero > 0);
    }

}

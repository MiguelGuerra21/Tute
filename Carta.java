/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    // instance variables - replace the example below with your own
    private int valor;
    private int palo;

    /**
     * Constructor for objects of class Carta
     */
    public Carta(int valor, int palo)
    {
        // initialise instance variables
        this.valor = valor;
        this.palo = palo;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */ 
    public int getPalo()
    {
        // put your code here
        return palo;
    }
    
    public int getValor()
    {
        return valor;
    }
    
    public String toString()
    {
        String valorCarta = valor + "";
        String paloCarta = "";
        String textoDevuelto = "";
        switch(palo){
            case 0: paloCarta = " de oros";
            break;
            case 1: paloCarta = " de copas";
            break;
            case 2: paloCarta = " de espadas";
            break;
            case 3: paloCarta = " de bastos";
            break;
        }
        switch(valor){
            case 1: valorCarta = "As";
            break;
            case 10: valorCarta = "Sota";
            break;
            case 11: valorCarta = "Caballo";
            break;
            case 12: valorCarta = "Rey";
            break;
        }
        textoDevuelto = valorCarta + paloCarta;
        return textoDevuelto;
    }
    
    public boolean ganaA(Carta cartaQueGana, int paloQuePinta)
    {
        boolean gana = false;
        if(palo == cartaQueGana.getPalo()){
            if(getPosicionEscalaTute() > cartaQueGana.getPosicionEscalaTute()){
                gana = true;
            }
        }
        else{
            if(cartaQueGana.getPalo() != paloQuePinta){
                gana = true;
            }
        }
        return gana;
    }   
    
    public int getPosicionEscalaTute() 
    {
        int posicion = valor;
        if (valor == 3) {
            posicion = 13;
        }
        else if (valor == 1) {
            posicion = 14;
        }
        return posicion;    
    }
}

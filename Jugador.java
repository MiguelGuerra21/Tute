import java.util.Random;
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    // instance variables - replace the example below with your own
    private String nombre;
    private Carta[] cartas;
    private int contador;
    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(String nombre)
    {
        // initialise instance variables
        this.nombre = nombre;
        cartas = new Carta[5];
        contador = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void recibirCarta(Carta nuevaCarta)
    {
        if(contador < 5 && cartas[contador] == null){
            cartas[contador] = nuevaCarta;
            contador++;
        }
    }

    public void verCartasJugador()
    {
        for(Carta cartaActual : cartas){
            if(cartaActual != null){
                System.out.println(cartaActual);
            }
        }
    }

    public String getNombre(){
        return nombre;
    }

    public Carta tirarCarta(String cartaTirada)
    {
        Carta cartaEscogida = null;
        if(contador > 0){
            boolean buscando = true;
            int contadorCartas = 0;
            while(contadorCartas < cartas.length && buscando){
                cartaEscogida = cartas[contadorCartas];
                if(cartaEscogida != null && cartaTirada.equals(cartaEscogida.toString())){
                    buscando = false;
                    cartas[contadorCartas] = null;
                    contador--;
                    System.out.println(nombre + " tira la carta: " + cartaEscogida);
                }
                contadorCartas++;
            } 
        }
        return cartaEscogida;
    }

    public Carta sacarCartaAleatoria()
    {
        Carta cartaTirada = null;
        if(contador > 0){
            Random cartaAleatoria = new Random();
            boolean buscando = false;
            while(!buscando){
                int aleatorio = cartaAleatoria.nextInt(cartas.length);
                if(cartas[aleatorio] != null){
                    cartaTirada = cartas[aleatorio];
                    cartas[aleatorio] = null;
                    contador--;
                    System.out.println(nombre + " tira la carta " + cartaTirada);
                    buscando = true;
                }
            }
        }
        return cartaTirada;
    }
}

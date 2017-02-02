import java.util.ArrayList;
/**
 * Crear una clase Baza que (haz un commit por cada punto):
- Tenga un constructor que admita dos parametros. 
El primero es un entero que indica el número de jugadores que van a tirar carta 
y el segundo es otro entero que indica el palo que pinta.
Tenga un método llamado addCarta que admita un parámetro de tipo Carta y un segundo parámetro de tipo String. 
El primer parámetro representa la carta que tira un jugador a la mesa y que, por tanto, se añade a la baza. 
No hace falta comprobar que la carta añadida sea o no null, se supone que es una carta. 
El segundo parámetro indica el nombre del jugador que tiro la carta. El método no devuelve nada.
- Tenga un método llamado getPaloPrimeraCartaDeLaBaza sin parámetros que devuelva un entero que representa el palo de la primera carta añadida a la baza 
o -1 en caso de que no se haya añadido aún ninguna carta.
- Tenga un método llamado cartaQueVaGanandoLaBaza sin parámetros que devuelva un objeto Carta. 
Este objeto carta es la carta que va ganando la baza conforme a las normas del julepe.
En caso de que la baza este vacía este método devuelve null.
- Tenga un método llamado nombreJugadorQueVaGanandoLaBaza que no admite parámetros 
y que devuelve el nombre del jugador que va ganando la baza en el momento actual.
 */
public class Baza
{
    private ArrayList<Carta> cartasEnBaza ;
    private ArrayList<String> nombresJugadores ;
    private int paloQuePinta;
    Carta cartaGanadora;
    int contadorJugadores;

    /**
     * Constructor for objects of class Baza
     */
    public Baza(int numJugadores, int paloQuePinta)
    {
        cartasEnBaza = new ArrayList<Carta>(numJugadores);
        nombresJugadores = new ArrayList<String>(numJugadores);
        this.paloQuePinta = paloQuePinta;
        contadorJugadores = 0;
        cartaGanadora = null;
    }

    public void addCarta(Carta siguienteCarta , String jugadorQueTiro){
        cartasEnBaza.add(siguienteCarta);
        nombresJugadores.add(jugadorQueTiro);
    }

    public int getPaloPrimeraCarta(){
        int paloBaza = -1;
        if(!cartasEnBaza.isEmpty()){
            paloBaza = cartasEnBaza.get(0).getPalo();
        }
        return paloBaza;
    }

    public Carta cartaQueVaGanando(){
        if(!cartasEnBaza.isEmpty()){
            cartaGanadora = cartasEnBaza.get(0);
            for(Carta cartaActual : cartasEnBaza){
                if(cartaActual.ganaA(cartaGanadora , paloQuePinta)){
                    cartaGanadora = cartaActual;
                    contadorJugadores++;
                }
            }
        }
        contadorJugadores = 0;
        return cartaGanadora;

    }

    public String nombreJugadorQueVaGanando(){
        String nombreGanador = nombresJugadores.get(contadorJugadores);
        return nombreGanador;
    }
}
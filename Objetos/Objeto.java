package Objetos;
import Personajes.Personaje;

public abstract class Objeto {
	protected Personaje personaje;
    protected int valorPlus;

    public Objeto(Personaje personaje) {
        this.personaje = personaje;      
        this.valorPlus = 30; 
    }
    public int getValorMejorado() {
        return valorPlus;
    }
    public abstract int aplicarMejora();
}

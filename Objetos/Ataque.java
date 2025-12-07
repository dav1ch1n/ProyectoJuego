package Objetos;
import Personajes.Personaje;

public class Ataque extends Objeto{
	public Ataque(Personaje personaje) {
        super(personaje);
        this.valorPlus=30;
    }
	
    @Override
    public int aplicarMejora() {
        return personaje.getAtaque() + valorPlus;
    }
}

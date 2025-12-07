package Partida;

import Personajes.Personaje;

public class Movimientos{
	static int attack;
	static int defends;
	static int life;
	private static int vidaActual;
	public Movimientos(int attack, int defends, int life) {
        this.attack = attack;
        this.defends = defends;
        this.life = life;
        this.vidaActual = life;
	}
	public static int getAttack() {
		return attack;
	}
	public static int getDefends() {
		return defends;
	}

	public static int getLife() {
		return life;
	}
	public static int getVidaActual() {
        return vidaActual;
    }

	public static int VidaDevuelta(int vida) {
		return vida;
	}
	
	public static void Movimiento() {
		int critico = (int)(Math.random()*5);
		int defenderte;
		int daño;
		int ataques = getAttack();
		int defensas = getDefends();
		int vidas = getLife();
		if (vidas >= 0) {
			defenderte = (int)(Math.random()*5);
			if (defenderte==0) {
				System.out.println("Te conseguiste defender, el ataque recibido se reduce a la mitad");
				ataques/=2;
				if (critico==0) {
					daño=ataques-defensas;
					vidaActual-=daño;
				}
				else {
					System.out.println("Hiciste crítico, el ataque se ejecutará con su 100% del daño.");
					vidaActual-=ataques;
				}
			}
			else {
				if (critico==0) {
					System.out.println("Hiciste crítico, el ataque se ejecutará con su 100% del daño.");
					vidaActual-=ataques;
				}
				else {
					daño=ataques-defensas;
					vidaActual-=daño;
				}
			}
		} else {
			System.out.println("Perdiste");
		}
		System.out.println("Te queda de vida: "+vidaActual);
	}
}

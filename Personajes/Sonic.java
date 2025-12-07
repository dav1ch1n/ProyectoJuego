package Personajes;

public class Sonic extends Personaje{
	protected String nombre;
	protected int bonus;
	public Sonic(String nombre) {
		this.nombre = "Sonic";
		this.bonus=30;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int getAtaque() {
		ataque=130;
		return ataque;
	}
	@Override
	public int getDefensa() {
		defensa=80;
		return defensa;
	}
	@Override
	public int getVida() {
		vida=440;
		return vida;
	}
	
	@Override
	public void atributos() {
		vida=440;
		ataque=130;
		defensa=80;
		System.out.println("El personaje "+nombre+" tiene unas caracteristicas: vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa);
	}
	public int getBonus() {
		return bonus;
	}
	@Override
	public void Bonus(int num) {
		//int vuelta=0;
		if (num == 0) {
			vida+=bonus;
		}
		else if (num == 1){
			ataque+=bonus;
		}
		else if (num == 2){
			defensa+=bonus;
		}
			
	}
	public String toString() {
		return "El personaje "+nombre+" tiene unas "+ super.toString();
	}

}

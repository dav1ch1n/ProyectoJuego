package Jugadores;

public class Jugador2 {
	protected String nombre;
	protected String personaje;
	public Jugador2(String nombre, String personaje) {
		this.nombre = nombre;
		this.personaje = personaje;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPersonaje() {
		return personaje;
	}
	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}
	public void info() {
		System.out.println("El jugador 2 "+nombre+" ha escogido el personaje "+personaje);
	}
}

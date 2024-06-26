

public class Asignatura {
	private Profesor profesor;
	private int aula;
	private String hora;
	private String nombre;

	public Asignatura(Profesor profesor, int aula, String hora, String nombre) {
		this.profesor = profesor;
		this.aula = aula;
		this.hora = hora;
		this.nombre = nombre;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public int getAula() {
		return aula;
	}

	public void setAula(int aula) {
		this.aula = aula;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
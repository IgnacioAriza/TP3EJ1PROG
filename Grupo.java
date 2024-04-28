public class Grupo {
	private Alumno[] alumnos;
	private String curso;
	private char letra;

	public Grupo(String curso, char letra, int cantidadAlumnos) {
		this.curso = curso;
		this.letra = letra;
		this.alumnos = new Alumno[cantidadAlumnos];
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
}
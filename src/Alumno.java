
public class Alumno {
	private String nombre;
	private String curso;
	private int[] notas;

	// Constructor con 3 parámetros: nombre, curso y cantidad de asignaturas
	public Alumno(String nombre, String curso, int numAsignaturas) {
		this.nombre = nombre;
		this.curso = curso;
		this.notas = new int[numAsignaturas];
	}

	// Constructor con 2 parámetros: nombre y curso
	public Alumno(String nombre, String curso) {
		this(nombre, curso, 5); 
	}

	// Constructor con el parámetro nombre
	public Alumno(String nombre) {
		this(nombre, "DAM"); 
	}

	// Métodos getter y setter 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	// Método para cambiar la nota de la asignatura que queramos
	public void cambiarNota(int asignatura, int nuevaNota) {
		if (asignatura >= 0 && asignatura < notas.length) {
			notas[asignatura] = nuevaNota;
		} else {
			System.out.println("Asignatura inválida. No se pudo cambiar la nota.");
		}
	}

	// Método para imprimir las notas del alumno
	public void imprimirNotas() {
		System.out.println("Notas de " + nombre + ":");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Asignatura " + (i + 1) + ": " + notas[i]);
		}
	}

	// Método para calcular la nota media por alumno
	public double notaMedia() {
		if (notas.length == 0) {
			return 0.0; // Si no hay notas, la media es 0
		}

		int sumaNotas = 0;
		for (int nota : notas) {
			sumaNotas += nota;
		}

		return (double) sumaNotas / notas.length;
	}

}

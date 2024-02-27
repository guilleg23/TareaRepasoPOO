
public class Alumno {
	private String nombre;
	private String curso;
	private int[] notas;

	// Constructor con 3 parámetros
	public Alumno(String nombre, String curso, int asignaturas) {
		this.nombre = nombre;
		this.curso = curso;
		inicializarNotas(asignaturas, 0); // Inicializa las notas a 0
	}

	// Constructor con 2 parámetros
	public Alumno(String nombre, String curso) {
		this(nombre, curso, 5); // Por defecto, 5 asignaturas
	}

	// Constructor con 1 parámetro
	public Alumno(String nombre) {
		this(nombre, "DAM"); // Por defecto, curso DAM y 5 asignaturas
	}

	// Inicializa el array de notas
	private void inicializarNotas(int cantidad, int valorInicial) {
		notas = new int[cantidad];
		for (int i = 0; i < cantidad; i++) {
			notas[i] = valorInicial;
		}
	}

	// Métodos para modificar los atributos y las notas

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void setNota(int asignatura, int nota) {
		if (asignatura >= 0 && asignatura < notas.length) {
			notas[asignatura] = nota;
		}
	}

	public void setNotas(int[] nuevasNotas) {
		if (nuevasNotas.length == notas.length) {
			System.arraycopy(nuevasNotas, 0, this.notas, 0, notas.length);
		}
	}

	public void modificarNota(int asignatura, int cambio) {
		if (asignatura >= 0 && asignatura < notas.length) {
			int nuevaNota = notas[asignatura] + cambio;
			notas[asignatura] = Math.min(Math.max(nuevaNota, 0), 100); // Asegura que la nota esté entre 0 y 100
		}
	}

	// Métodos adicionales como ejemplo
	public String getNombre() {
		return nombre;
	}

	public String getCurso() {
		return curso;
	}

	public int[] getNotas() {
		return notas.clone();
	}
	
	public int notaMedia() {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return notas.length > 0 ? suma / notas.length : 0;
    }
}

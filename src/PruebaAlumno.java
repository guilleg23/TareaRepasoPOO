
public class PruebaAlumno {
	public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Mario");
        Alumno alumno2 = new Alumno("Lucía");
        Alumno alumno3 = new Alumno("Carlos");

        // Ejemplo de uso de getters
        System.out.println("El alumno " + alumno1.getNombre() + " está matriculado en " + alumno1.getCurso() + " y su media de notas es " + alumno1.notaMedia());
        System.out.println("El alumno " + alumno2.getNombre() + " está matriculado en " + alumno2.getCurso() + " y su media de notas es " + alumno2.notaMedia());
        System.out.println("El alumno " + alumno3.getNombre() + " está matriculado en " + alumno3.getCurso() + "  y su media de notas es " + alumno3.notaMedia());

	}
}

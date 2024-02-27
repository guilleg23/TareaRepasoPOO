
public class PruebaAlumno {
	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Juan");
		Alumno alumno2 = new Alumno("María");
		Alumno alumno3 = new Alumno("Pedro");
		
		alumno1.setNotas(new int[] { 7, 8, 6, 9, 8, 7 });
		alumno2.setNotas(new int[] { 5, 4, 5, 7, 8, 5 });
		
		//Cambiamos a un aprobado la asignatura que tiene suspensa con el método cambiarNota
		alumno2.cambiarNota(1, 5);
		alumno3.setNotas(new int[] { 8, 5, 5, 5, 6, 8 });
		
		// Imprimir las notas de los alumnos
		System.out.println(alumno1.getNombre() + " tiene una nota media de: ");
		System.out.println(alumno1.notaMedia() + " en el ciclo de " + alumno1.getCurso());
		alumno1.imprimirNotas();
		
		System.out.println(alumno2.getNombre() + " tiene una nota media de: ");
		System.out.println(alumno2.notaMedia() + " en el ciclo de " + alumno2.getCurso());
		alumno2.imprimirNotas();
		
		System.out.println(alumno3.getNombre() + " tiene una nota media de: ");
		System.out.println(alumno3.notaMedia() + " en el ciclo de " + alumno3.getCurso());
		alumno3.imprimirNotas();		
	}

}

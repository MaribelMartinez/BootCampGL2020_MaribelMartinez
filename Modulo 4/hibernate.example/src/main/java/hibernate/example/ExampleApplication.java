package hibernate.example;

public class ExampleApplication {

	public static void main(String[] args) {
		
		
		AlumnoDao alumnoDao = new AlumnoDao();
		
		Alumno alumno = new Alumno("1", "Jose", "Perez");
		alumnoDao.createAlumno(alumno);
		System.out.println("Agregando alumno...: " + alumno);
		
		Alumno alumno2 = new Alumno("2", "Esteban", "Quito");
		System.out.println("Agregando alumno...: " + alumno2);
		alumnoDao.createAlumno(alumno2);
		
		Alumno alumno3 = new Alumno("3", "Ulrica", "Godofreda");
		System.out.println("Agregando alumno...: " + alumno3);
		alumnoDao.createAlumno(alumno3);
		
		System.out.println("Alumnos:");
		System.out.println(alumnoDao.getAlumnos());

		alumno2.setNombre("Estefano");
		System.out.println("Modificando nombre del alumno Estaban por su nombre real Estefano...");
		alumnoDao.updateAlumno(alumno2);
		
		System.out.println("Alumnos:");
		System.out.println(alumnoDao.getAlumnos());		
		
		
		System.out.println("Eliminando al alumno "+alumno+ " porque ya se encontraba en una practica anterior");
		alumnoDao.removeAlumno(alumno);
		
		System.out.println("Alumnos:");
		System.out.println(alumnoDao.getAlumnos());		
		
		
	}
	

}

package hibernate.carrera;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;

public class CarreraMenu {

	
	public static void main(String[] args) throws ParseException {
		
		Competidor competidor2 = new Competidor("2", 2, "Sebastian Loeb");
		
		Competidor competidor3 = new Competidor("3", 3, "Marcus Gronholm");
		
		Competidor competidor7 = new Competidor("7", 7, "Carlos Sainz");
		
		Competidor competidor11 = new Competidor("11", 11, "Petter Solberg");
		
		CarreraDao carreraDao = new CarreraDao();
		
		List<Competidor> competidores = new ArrayList<Competidor>();
		
		competidores.add(competidor2);
		competidores.add(competidor3);
		competidores.add(competidor7);
		competidores.add(competidor11);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha = sdf.parse("2017-07-17");
		
		Carrera carrera = new Carrera("1", fecha, "Gran Carrera Global", competidores);
		
		competidor11.setCarrera(carrera);
		competidor2.setCarrera(carrera);
		competidor3.setCarrera(carrera);
		competidor7.setCarrera(carrera);
		
		carreraDao.createCarrera(carrera);
		
		
		System.out.println(carreraDao.getCarreras());
		
		System.out.println(carreraDao.getCarrera(fecha, "Gran Carrera Global"));
	}
}

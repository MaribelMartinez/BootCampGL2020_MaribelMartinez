package hibernate.menu;

import java.util.ArrayList;
import java.util.List;

public class MenuMain {

	public static void main(String[] args) {

		MenuDao menuDao = new MenuDao();

		Plato plato1 = new Plato("1", "Milanesa clasica", 500.0,
				"una delicada milanesa con crocantes papas fritas finamente seleccionadas");

	//	menuDao.createPlato(plato1);

		Plato plato2 = new Plato("2", "Lomo al piedra", 750.0,
				"un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el lomo junto a especias orientales y sudamericanas "
						+ "logrando un elixir entre la textura y el sabor.");

		//menuDao.createPlato(plato2);

		//System.out.println(menuDao.getPlatos());
		
		Menu menu = new Menu();
		
		List<Plato> platos = new ArrayList<Plato>();
		
		platos.add(plato1);
		platos.add(plato2);
		
		menu.setId("1");
		menu.setPlatos(platos);
		
		plato1.setMenu(menu);
		plato2.setMenu(menu);

		menuDao.createMenu(menu);
		
		System.out.println(menuDao.getPlatos());
		
		/*
		 * menu1.setPrecio(600.0);
		 * 
		 * menuDao.updateMenu(menu1);
		 * 
		 * System.out.println("Actualizando precio menu1...");
		 * System.out.println(menuDao.getMenu("Milanesa clasica", 600.0,
		 * "una delicada milanesa con crocantes papas fritas finamente seleccionadas"));
		 * 
		 * System.out.println("Buscando menu por id = 2...");
		 * System.out.println(menuDao.getMenuById("2"));
		 * 
		 * menuDao.removeMenu(menu1); System.out.println("Eliminando menu1..");
		 * System.out.println(menuDao.getMenus());
		 * 
		 * if (menuDao.existsMenu("3")) { System.out.println("true"); } else {
		 * System.out.println("false"); }
		 */
		//HibernateConfig.getSessionFactory().close();

	}
}

package menu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import hibernate.menu.Menu;
import hibernate.menu.MenuDao;
import hibernate.menu.Plato;

public class TestMenu {

	private static Menu menu;
	private static Plato plato1;
	private static Plato plato2;
	private static MenuDao menuDao;
	private static List<Plato> platos;
	
	@BeforeAll
	static void setUp() {
		MenuDao menuDao = new MenuDao();

		plato1 = new Plato("1", "Milanesa clasica", 500.0,
				"una delicada milanesa con crocantes papas fritas finamente seleccionadas");

	//	menuDao.createPlato(plato1);

		plato2 = new Plato("2", "Lomo al piedra", 750.0,
				"un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el lomo junto a especias orientales y sudamericanas "
						+ "logrando un elixir entre la textura y el sabor.");

		//menuDao.createPlato(plato2);

		//System.out.println(menuDao.getPlatos());
		
		menu = new Menu();
		
		platos = new ArrayList<Plato>();
		
		platos.add(plato1);
		platos.add(plato2);
		
		menu.setId("1");
		menu.setPlatos(platos);
		
		plato1.setMenu(menu);
		plato2.setMenu(menu);

		menuDao.createMenu(menu);
		System.out.println("BEFOREALL"+menuDao.getMenuById("1"));
	}

	@Test
	void testCreate() {
		System.out.println("CREATE"+menuDao.getMenuById("1"));
		
		assertEquals(platos, menuDao.getMenuById("1").getPlatos());
	}
	
	
	/*
	 * @Test void testFindAll() { System.out.println(menuDao.getPlatos());
	 * assertNotNull(menuDao.getPlatos()); assertTrue(menuDao.getPlatos().size() ==2
	 * );
	 * 
	 * }
	 * 
	 * @Test void testFindById() {
	 * assertEquals("1",menuDao.getMenuById("1").getId()); }
	 * 
	 * 
	 * @Test void testUpdate() { platos.remove(plato1); plato1.setPrecio(700.0);
	 * platos.add(plato1); menu.setPlatos(platos); menuDao.updateMenu(menu);
	 * assertEquals(700.0, menuDao.getPlatoById("1").getPrecio()); }
	 */
	  
	/*
	 * @Test void testRemove() { Plato plato3 = new Plato("3", "Lomo al piedra",
	 * 750.0,
	 * "un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el lomo junto a especias orientales y sudamericanas "
	 * + "logrando un elixir entre la textura y el sabor.");
	 * menuDao.createPlato(plato3); assertNotNull(menuDao.getPlatoById("3"));
	 * menuDao.removePlato(plato3); assertThrows(NoResultException.class, () ->
	 * menuDao.getPlatoById("3")); }
	 * 
	 * @Test void testExists() { assertTrue(menuDao.existsMenu("1"));
	 * assertFalse(menuDao.existsMenu("3")); }
	 */
	 
}

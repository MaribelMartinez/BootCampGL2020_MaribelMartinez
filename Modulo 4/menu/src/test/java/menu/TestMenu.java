package menu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import javax.persistence.NoResultException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import hibernate.menu.Menu;
import hibernate.menu.MenuDao;

public class TestMenu {

	static Menu menu1;
	static Menu menu2;
	static MenuDao menuDao;

	@BeforeAll
	static void setUp() {
		menuDao = new MenuDao();
		menu1 = new Menu("1", "Milanesa clasica", 500.0,
				"una delicada milanesa con crocantes papas fritas finamente seleccionadas");
		
		menu2 = new Menu("2", "Lomo al piedra", 750.0,
				"un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el lomo junto a especias orientales y sudamericanas "
						+ "logrando un elixir entre la textura y el sabor.");
		menuDao.createMenu(menu1);
		menuDao.createMenu(menu2);
	}

	@Test
	void testCreate() {
		assertEquals(menu1.getDescripcion(), menuDao.getMenuById("1").getDescripcion());

	}
	
	@Test
	void testFindAll() {
		
		assertNotNull(menuDao.getMenus());
		assertTrue(menuDao.getMenus().size() == 2);

	}
	
	@Test
	void testFindById() {
		assertEquals("1",menuDao.getMenuById("1").getId());
	}
	
	
	@Test
	void testUpdate() {
		menu1.setPrecio(700.0);
		menuDao.updateMenu(menu1);
		assertEquals(700.0, menuDao.getMenuById("1").getPrecio());
	}


	@Test
	void testRemove() {
		Menu menu3 = new Menu("3", "Lomo al piedra", 750.0,
				"un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el lomo junto a especias orientales y sudamericanas "
						+ "logrando un elixir entre la textura y el sabor.");
		menuDao.createMenu(menu3);
		assertNotNull(menuDao.getMenuById("3"));
		menuDao.removeMenu(menu3);
		assertThrows(NoResultException.class, () -> menuDao.getMenuById("3"));
	}
	
	@Test
	void testExists() {
		assertTrue(menuDao.existsMenu("1"));
		assertFalse(menuDao.existsMenu("3"));
	}
	
}

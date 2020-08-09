package hibernate.menu;

public class MenuMain {

	public static void main(String[] args) {

		MenuDao menuDao = new MenuDao();

		Menu menu1 = new Menu("1", "Milanesa clasica", 500.0,
				"una delicada milanesa con crocantes papas fritas finamente seleccionadas");

		menuDao.createMenu(menu1);

		Menu menu2 = new Menu("2", "Lomo al piedra", 750.0,
				"un curioso plato donde se utilizan piedras calentadas al rojo vivo para cocinar el lomo junto a especias orientales y sudamericanas "
						+ "logrando un elixir entre la textura y el sabor.");

		menuDao.createMenu(menu2);

		System.out.println(menuDao.getMenus());

		menu1.setPrecio(600.0);

		menuDao.updateMenu(menu1);

		System.out.println("Actualizando precio menu1...");
		System.out.println(menuDao.getMenu("Milanesa clasica", 600.0,
				"una delicada milanesa con crocantes papas fritas finamente seleccionadas"));

		System.out.println("Buscando menu por id = 2...");
		System.out.println(menuDao.getMenuById("2"));

		menuDao.removeMenu(menu1);
		System.out.println("Eliminando menu1..");
		System.out.println(menuDao.getMenus());

		if (menuDao.existsMenu("3")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		HibernateConfig.getSessionFactory().close();

	}
}

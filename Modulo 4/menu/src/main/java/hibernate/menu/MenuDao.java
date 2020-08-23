package hibernate.menu;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class MenuDao {

	public void createPlato(Plato plato) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.save(plato);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}

			e.printStackTrace();
		}

	}
	
	
	public List<Plato> getPlatos() {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			return session.createQuery("from Plato", Plato.class).list();

		}
	}
	
	public void createMenu(Menu menu) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.save(menu);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}

			e.printStackTrace();
		}

	}

	
	public List<Menu> getMenus() {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			return session.createQuery("from Menu", Menu.class).list();
		}
	}

	public List<Menu> getMenu(String nombre, Double precio, String descripcion) {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			return session
					.createQuery(
							"from Menu m where m.nombre=:nombre and m.precio=:precio and m.descripcion=:descripcion",
							Menu.class)
					.setParameter("nombre", nombre).setParameter("precio", precio)
					.setParameter("descripcion", descripcion).list();
		}

	}

	public Menu getMenuById(String id) {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			return session.createQuery("from Menu m where m.id=:id ", Menu.class).setParameter("id", id)
					.getSingleResult();
		}

	}
	
	public Plato getPlatoById(String id) {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			return session.createQuery("from Plato m where m.id=:id ", Plato.class).setParameter("id", id).getSingleResult();
		}

	}

	public void updateMenu(Menu menu) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.update(menu);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}

			e.getStackTrace();
		}

	}

	public void removeMenu(Menu menu) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.remove(menu);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}

			e.printStackTrace();
		}

	}

	
	
	public void removePlato(Plato plato) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.remove(plato);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}

			e.printStackTrace();
		}

	}
	
	public boolean existsMenu(String id) {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			if (session.createQuery("from Menu m where m.id=:id ", Menu.class).setParameter("id", id)
					.getSingleResult() != null) {

				return true;

			} else {

				return false;
			}

		} catch (NoResultException e) {

			return false;

		}
	}
	
	

}

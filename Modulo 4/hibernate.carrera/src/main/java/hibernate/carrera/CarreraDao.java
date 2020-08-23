package hibernate.carrera;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CarreraDao {

	public void createCompetidor(Competidor competidor) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.save(competidor);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}

			e.printStackTrace();
		}
	}

	public List<Competidor> getCompetidores() {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			return session.createQuery("from competidor", Competidor.class).list();

		}
	}

	public void updateCompetidor(Competidor competidor) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.update(competidor);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}

			e.printStackTrace();

		}

	}

	public void removeCompetidor(Competidor competidor) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.remove(competidor);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();
			}

			e.printStackTrace();

		}
	}

	public void createCarrera(Carrera carrera) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.save(carrera);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}
		}
	}

	public List<Carrera> getCarreras() {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			List<Carrera> carrera = session.createQuery("from Carrera", Carrera.class).list();
			
			return carrera;

		}
	}

	public Carrera getCarrera(Date fecha, String nombre) {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			return session.createQuery("from Carrera c where c.fecha=:fecha and c.nombre=:nombre", Carrera.class)
					.setParameter("fecha", fecha).setParameter("nombre", nombre).getSingleResult();

		}

	}

	public void updateCarrera(Carrera carrera) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.update(carrera);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();

			}

			e.printStackTrace();

		}

	}

	public void removeCarrera(Carrera carrera) {

		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.remove(carrera);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {

				transaction.rollback();
			}

			e.printStackTrace();

		}
	}
}

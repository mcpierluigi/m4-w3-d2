package application;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dao.EventsDAO;
import entities.Evento;
import utils.JpaUtil;

public class Application {
	private static Logger logger = LoggerFactory.getLogger(Application.class);
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
	
	public static void main(String[] args) {
		logger.info("CIAO");
		EntityManager em = emf.createEntityManager();
		EventsDAO ed = new EventsDAO(em);
		
		Evento riunione = new Evento("riunione", "wow", 25, LocalDate.now());
		ed.save(riunione);
		em.close();
		emf.close();
	}

}

package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Evento;

public class EventsDAO {
	private final EntityManager em;
	
	public EventsDAO(EntityManager em) {
		this.em = em;
	}
	
	public void save(Evento e) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(e);
		transaction.commit();
		System.out.println("Evento salvato");
	}
	
	public Evento findById(long id) {
		Evento found = em.find(Evento.class, id);
		return found;
	}
	
	public void findByIdAndDelete(long id) {
		Evento found = em.find(Evento.class, id);
		if (found != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.remove(found);
			transaction.commit();
			System.out.println("Evento con id " + id + " eliminato!");
		}
	}
	
/*	public void refresh(long id, String titolo) {
		Evento found = em.find(Evento.class, id);
		found.setTitolo(titolo);
		System.out.println("PRE REFRESH");
		System.out.println(found);
		em.refresh(found);
		System.out.println("POST REFRESH");
		System.out.println(found);
	} */
}

package entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Evento {
	@Id
	@GeneratedValue
	private long id;
	private String titolo;
	private String descrizione;
	private Integer numeroMassimoPartecipanti;
	private LocalDate dataEvento;
	
	public Evento () {}
	
	public Evento (String t, String d, Integer mP, LocalDate date) {
		super();
		this.titolo = t;
		this.descrizione = d;
		this.numeroMassimoPartecipanti = mP;
		this.dataEvento = date;
	}
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Integer getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}

	public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	@Override
	public String toString() {
		return "Evento [titolo = " + titolo + ", descrizione = " + descrizione
				+ ", numeroMassimoPartecipanti = " + numeroMassimoPartecipanti + ", dataEvento = " + dataEvento + "]";
	}

}

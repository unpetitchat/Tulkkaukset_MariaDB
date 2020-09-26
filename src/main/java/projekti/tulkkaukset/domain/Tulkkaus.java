package projekti.tulkkaukset.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




@Entity
public class Tulkkaus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String tilaaja;
	private String aihe;
	private String tulkkauspaikka;
	private String osoite;
	private String pvm;
	
	@ManyToOne
	@JoinColumn(name = "tulkkauskieli_id")
	private Tulkkauskieli tulkkauskieli;
	
	@ManyToOne
	@JoinColumn(name = "tulkkaustyyppi_id")
	private Tulkkaustyyppi tulkkaustyyppi;

	

	public Tulkkaus(String tilaaja, String aihe, String tulkkauspaikka, String osoite, String pvm,
			Tulkkauskieli tulkkauskieli, Tulkkaustyyppi tulkkaustyyppi) {
		super();
		this.tilaaja = tilaaja;
		this.aihe = aihe;
		this.tulkkauspaikka = tulkkauspaikka;
		this.osoite = osoite;
		this.pvm = pvm;
		this.tulkkauskieli = tulkkauskieli;
		this.tulkkaustyyppi = tulkkaustyyppi;
	}
	


	public Tulkkaus() {
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTilaaja() {
		return tilaaja;
	}



	public void setTilaaja(String tilaaja) {
		this.tilaaja = tilaaja;
	}



	public String getAihe() {
		return aihe;
	}



	public void setAihe(String aihe) {
		this.aihe = aihe;
	}



	public String getTulkkauspaikka() {
		return tulkkauspaikka;
	}



	public void setTulkkauspaikka(String tulkkauspaikka) {
		this.tulkkauspaikka = tulkkauspaikka;
	}



	public String getOsoite() {
		return osoite;
	}



	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}



	public String getPvm() {
		return pvm;
	}



	public void setPvm(String pvm) {
		this.pvm = pvm;
	}



	public Tulkkauskieli getTulkkauskieli() {
		return tulkkauskieli;
	}



	public void setTulkkauskieli(Tulkkauskieli tulkkauskieli) {
		this.tulkkauskieli = tulkkauskieli;
	}



	public Tulkkaustyyppi getTulkkaustyyppi() {
		return tulkkaustyyppi;
	}



	public void setTulkkaustyyppi(Tulkkaustyyppi tulkkaustyyppi) {
		this.tulkkaustyyppi = tulkkaustyyppi;
	}



	@Override
	public String toString() {
		return "Tulkkaus [id=" + id + ", tilaaja=" + tilaaja + ", aihe=" + aihe + ", tulkkauspaikka=" + tulkkauspaikka
				+ ", osoite=" + osoite + ", pvm=" + pvm + ", tulkkaustyyppi"+ this.getTulkkaustyyppi() + ", tulkkauskieli" + this.getTulkkauskieli()+ "]";
	}



	
	
	
	
}

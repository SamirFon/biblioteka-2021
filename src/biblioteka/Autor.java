package biblioteka;

/**
 * Klasa koja prestavlja autora knjige
 * 
 * @version 0.1
 * @author Korisnik
 *
 */

public class Autor {
	
	/**
	 * ime autora kao String
	 * 
	 */
	
	private String ime;
	
	/**
	 * 
	 * prezime autora kao String
	 */
	private String prezime;
	
	
	/**
	 * 
	 * Konstuktor koji inicijalizuje objekat i postavlja vrednosti za ime i prezime autora
	 * @param ime  Ime autora kao String
	 * @param prezime  Prezime autora kao String
	 */
	
	public Autor(String ime, String prezime) {
		super();
		setIme(ime);
		setPrezime(prezime);
	}
	
	
/**
 * 
 * konstruktor koji inicijalizuje objekat i nista vise
 */
	public Autor() {
		super();
		
	}

/**
 * 
 * Vraca ime autora
 * @return ime autora kao String
 */

	public String getIme() {
		return ime;
	}
	
	/**
	 * 
	 * postavlja ime autora na novu vrednost
	 * @param ime  ime autora kao String
	 * 
	 * @throws java.lang.NullPointerException ako je uneto ime null
	 * 
	 *  @throws java.lang.RuntimeException ako je uneto ime koje ima manje od dva znaka
	 */
	
	public void setIme(String ime) {
		if (ime==null)
			throw new NullPointerException("Ime ne sme biti null");
		if (ime.length()<2)
			throw new RuntimeException("Ime mora imati vise od dva znaka");
		this.ime = ime;
	}
	
	/**
	 * 
	 * Vraca prezime autora
	 * @return prezime autora kao String
	 */
	
	public String getPrezime() {
		return prezime;
	}
	
	/**
	 * 
	 * postavlja prezime autora na novu vrednost
	 * @param prezime prezime autora kao String
	 * 
	 * @throws java.lang.NullPointerException ako je uneto prezime null
	 * 
	 *  @throws java.lang.RuntimeException ako je uneto prezime koje ima manje od dva znaka
	 */
	
	public void setPrezime(String prezime) {
		if (prezime==null)
			throw new NullPointerException("Prezime ne sme biti null");
		if (prezime.length()<2)
			throw new RuntimeException("Prezime mora imati vise od dva znaka");
		this.prezime = prezime;
	}
/**
 * 
 * vraca String sa svim podacima o autoru
 * @return vraca String sa svim podacima o autoru
 */
	@Override
	public String toString() {
		return "Autor [ime=" + ime + ", prezime=" + prezime + "]";
	}

	/**
	 * 
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
		return result;
	}
	/**
	 * poredi dva autora i vraca true ako su isti i false ako su razliciti
	 * autori se porede po imenu i prezimenu i oba moraju da budu ista
	 * @return 
	 * <ul>
	 * 		<li>vraca true ako su oba objekata klase autor i imaju ista imrena i prezimena </li>
	 *  <li>vraca false u svim ostalim slucajevima</li>
	 *  <ul>
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Autor))
			return false;
		Autor other = (Autor) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (prezime == null) {
			if (other.prezime != null)
				return false;
		} else if (!prezime.equals(other.prezime))
			return false;
		return true;
	}
	
	

}

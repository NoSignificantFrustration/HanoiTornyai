package Hanoi;

public class Felhasznalo {

	private String nev;
	private int legjobb;
	private int lepesSzam;
	
	public Felhasznalo(String nev) {
		super();
		this.nev = nev;
		legjobb = 0;
		lepesSzam = 0;
	}
	
	public void lepesNoveles() {
		lepesSzam++;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getLegjobb() {
		return legjobb;
	}

	public void setLegjobb(int legjobb) {
		this.legjobb = legjobb;
	}

	public int getLepesSzam() {
		return lepesSzam;
	}

	public void setLepesSzam(int lepesSzam) {
		this.lepesSzam = lepesSzam;
	}
	
	
}

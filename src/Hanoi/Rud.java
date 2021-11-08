package Hanoi;

import java.util.ArrayList;
import java.util.Vector;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Rud {

	private Color szin;
	private Double szelesseg;
	private Double magassag;
	private ArrayList<Korong> korongok;
	private Rectangle tlap;
	
	
	public Rud(Color szin, Double szelesseg, Double magassag) {
		super();
		this.szin = szin;
		this.szelesseg = szelesseg;
		this.magassag = magassag;
	}


	public Rud(Rectangle tlap) {
		super();
		this.tlap = tlap;
		this.szin = (Color)tlap.getFill();
		this.szelesseg = tlap.getWidth();
		this.magassag = tlap.getHeight();
		korongok = new ArrayList<Korong>();
	}
	
	public void  addKorong(Korong k) {
		//TODO: Ellenõrizni hony ne legyen nagyobb a korong a legfelsõnél
		korongok.add(k);
	}
	

	public ArrayList<Korong> getKorongok() {
		return korongok;
	}


	public Color getSzin() {
		return szin;
	}


	public void setSzin(Color szin) {
		this.szin = szin;
	}


	public Double getSzelesseg() {
		return szelesseg;
	}


	public void setSzelesseg(Double szelesseg) {
		this.szelesseg = szelesseg;
	}


	public Double getMagassag() {
		return magassag;
	}


	public void setMagassag(Double magassag) {
		this.magassag = magassag;
	}
	
	public boolean isEmpty() {
		return korongok.isEmpty();
	}
	
	public Korong elveszKorong() {
		if (!korongok.isEmpty()) {
			Korong legfelso = korongok.remove(korongok.size() - 1);
			return legfelso;
		}
		return null;
		
	}
	
	
}

package Hanoi;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Korong {

	private Color szin;
	private double szelesseg;
	private double magassag;
	private Rectangle tlap;
	
	public Korong(Color szin, double szelesseg, double magassag) {
		super();
		this.szin = szin;
		this.szelesseg = szelesseg;
		this.magassag = magassag;
		tlap = new Rectangle(szelesseg, magassag, szin);
		tlap.setArcHeight(magassag / 2);
		tlap.setArcWidth(magassag / 2);
		tlap.setStroke(Color.BLACK);
		tlap.setStrokeWidth(1.5);
	}

	public Color getSzin() {
		return szin;
	}

	public void setSzin(Color szin) {
		this.szin = szin;
	}

	public double getSzelesseg() {
		return szelesseg;
	}

	public void setSzelesseg(double szelesseg) {
		this.szelesseg = szelesseg;
	}

	public double getMagassag() {
		return magassag;
	}

	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}

	public Rectangle getTlap() {
		return tlap;
	}
	
	
	
}

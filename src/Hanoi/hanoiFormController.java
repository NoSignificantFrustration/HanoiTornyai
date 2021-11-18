package Hanoi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class hanoiFormController {

    @FXML
    private AnchorPane jatekTerület;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Rectangle elsoRudRect;

    @FXML
    private Rectangle masodikRudRect;

    @FXML
    private Rectangle harmadikRudRect;

    @FXML
    private Pane felvettPane;
    
    

    @FXML
    void elsoRudClick(MouseEvent event) {
    	System.out.println("Elsõ rúd click");
    	korongMozgatas(r1);
    }


    @FXML
    void masodikRudClick(MouseEvent event) {
    	System.out.println("Második rúd click");
    	korongMozgatas(r2);
    }
    
    @FXML
    void harmadikRudClick(MouseEvent event) {
    	System.out.println("Harmadik rúd click");
    	korongMozgatas(r3);
    }

    @FXML
    void initialize() {
        assert elsoRudRect != null : "fx:id=\"elsoRudRect\" was not injected: check your FXML file 'hanoi_form2.fxml'.";
        assert masodikRudRect != null : "fx:id=\"masodikRudRect\" was not injected: check your FXML file 'hanoi_form2.fxml'.";
        assert harmadikRudRect != null : "fx:id=\"harmadikRudRect\" was not injected: check your FXML file 'hanoi_form2.fxml'.";
        assert felvettPane != null : "fx:id=\"felvettPane\" was not injected: check your FXML file 'hanoi_form2.fxml'.";
        //System.out.println(fh.getNev());
        
        r1 = new Rud(elsoRudRect);
        r2 = new Rud(masodikRudRect);
        r3 = new Rud(harmadikRudRect);
        
        

    }
    
    private Rud r1;
    private Rud r2;
    private Rud r3;
    private Felhasznalo fh;
    private int korongokSzama;
    private Double korongSzelMax;
    final private Double KDIFF = 14.0; 
    private Double korongMag = 20.0;
    private Color[] szinek = {
    		Color.AQUA,
    		Color.DARKGRAY,
    		Color.BEIGE,
    		Color.RED,
    		Color.GREEN,
    		Color.YELLOW,
    		Color.BLACK,
    		Color.BLUE,
    		Color.PINK,
    		Color.WHITE
    };
    private Korong kezbeKorong;



	public void setKorongokSzama(int korongokSzama) {
		this.korongokSzama = korongokSzama;
		korongGeneralas();
	}

	public void setFh(Felhasznalo fh) {
		this.fh = fh;
	}
    
	private void korongGeneralas() {
		korongSzelMax = jatekTerület.getWidth() / 3 - 3 * KDIFF;
		for (int i = 0; i < korongokSzama; i++) {
			Korong k = new Korong(szinek[i], korongSzelMax - i * KDIFF, korongMag);
			/*
			Rectangle tlap = k.getTlap();
			tlap.setLayoutX(0);
			tlap.setLayoutY(i * 30 + 100);
			jatekTerület.getChildren().add(tlap);
			*/
			r1.addKorong(k);
		}
		rudRajzolas();
	}
	
	private void rudRajzolas() {
		double x = jatekTerület.getWidth();
		double y = jatekTerület.getHeight();
		double w = x * 0.02;
		double rx1 = KDIFF + korongSzelMax / 2 - w / 2;
		double ry1 = y / 3;
		double rx2 = x / 2 - w / 2;
		double ry2 = ry1;
		double rx3 = x - (KDIFF + korongSzelMax / 2 + w / 2);
		double ry3 = ry1;
		
		elsoRudRect.setLayoutX(rx1);
		elsoRudRect.setLayoutY(ry1);
		elsoRudRect.setWidth(w);
		masodikRudRect.setLayoutX(rx2);
		masodikRudRect.setLayoutY(ry2);
		masodikRudRect.setWidth(w);
		harmadikRudRect.setLayoutX(rx3);
		harmadikRudRect.setLayoutY(ry3);
		harmadikRudRect.setWidth(w);
		
		double rh = y - 15 - ry1;
		elsoRudRect.setHeight(rh);
		masodikRudRect.setHeight(rh);
		harmadikRudRect.setHeight(rh);
		
		
		egyRudRajzolas(r1);
		egyRudRajzolas(r2);
		egyRudRajzolas(r3);
		
		
		
	}
	
	private void korongMozgatas(Rud r ) {
		if (kezbeKorong == null) {
			if (!r.isEmpty()) {
				kezbeKorong = r.elveszKorong();
				jatekTerület.getChildren().remove(kezbeKorong.getTlap());
				kezbeKorong.getTlap().setLayoutX(120);
				kezbeKorong.getTlap().setLayoutY(5);
				felvettPane.getChildren().add(kezbeKorong.getTlap());
				
			}
			
		} else {
			if (r.addKorong(kezbeKorong)) {
				kezbeKorong = null;
				egyRudRajzolas(r);
			}
		}
	}


	private void egyRudRajzolas(Rud r) {
		
		double y = jatekTerület.getHeight();
		double rx1 = r.getTlap().getLayoutX();
		double w = r.getSzelesseg();
		
		for (int kix = 0; kix < r.getKorongok().size(); kix++) {
			Korong k = r.getKorongok().get(kix);
			double kx = rx1 - (k.getSzelesseg() / 2 - w / 2);
			double ky = (y - 15) - ((kix + 1) * k.getMagassag());
			Rectangle tlap = k.getTlap();
			tlap.setLayoutX(kx);
			tlap.setLayoutY(ky);
			if (!jatekTerület.getChildren().contains(tlap)) {
				jatekTerület.getChildren().add(tlap);
			}
			
		}
		
	}

}

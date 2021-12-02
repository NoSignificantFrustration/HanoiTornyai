package Hanoi;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class hanoiFormController {

	@FXML
    private MenuItem ujItem;

    @FXML
    private MenuItem beallItem;

    @FXML
    private MenuItem kilepItem;

    @FXML
    private MenuItem helpItem;
	
    @FXML
    private Label lepesCimke;
	
    @FXML
    private AnchorPane jatekTer�let;
    
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
    	System.out.println("Els� r�d click");
    	korongMozgatas(r1);
    }


    @FXML
    void masodikRudClick(MouseEvent event) {
    	System.out.println("M�sodik r�d click");
    	korongMozgatas(r2);
    }
    
    @FXML
    void harmadikRudClick(MouseEvent event) {
    	System.out.println("Harmadik r�d click");
    	korongMozgatas(r3);
    }
    
    @FXML
    void helpKattintas(ActionEvent event) {

    }
    
    @FXML
    void kilepKattintas(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Kil�p�s meger�s�t�se");
    	alert.setHeaderText("�n a kil�p�s men�pontra kattintott");
    	alert.setContentText("Val�ban ki akar l�pni a programb�l?");

    	Optional<ButtonType> result = alert.showAndWait();
    	if (result.get() == ButtonType.OK){
    			Stage st = (Stage)jatekTer�let.getScene().getWindow();
    			st.close();
    			//Platform.exit();
    			//System.exit(0);
    	} 

    }
    

    @FXML
    void ujKattintas(ActionEvent event) {
    	Stage st = (Stage) jatekTer�let.getScene().getWindow();
    	if (foablak != null) {
    		st.setScene(foablak);
    		st.show();
		}
    }
    
    @FXML
    void beallKattintas(ActionEvent event) {

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
    private Scene foablak;



	public void setFoablak(Scene foablak) {
		this.foablak = foablak;
	}


	public void setKorongokSzama(int korongokSzama) {
		this.korongokSzama = korongokSzama;
		korongGeneralas();
	}

	public void setFh(Felhasznalo fh) {
		this.fh = fh;
	}
    
	private void korongGeneralas() {
		korongSzelMax = jatekTer�let.getWidth() / 3 - 3 * KDIFF;
		for (int i = 0; i < korongokSzama; i++) {
			Korong k = new Korong(szinek[i], korongSzelMax - i * KDIFF, korongMag);
			/*
			Rectangle tlap = k.getTlap();
			tlap.setLayoutX(0);
			tlap.setLayoutY(i * 30 + 100);
			jatekTer�let.getChildren().add(tlap);
			*/
			r1.addKorong(k);
		}
		rudRajzolas();
	}
	
	private void rudRajzolas() {
		double x = jatekTer�let.getWidth();
		double y = jatekTer�let.getHeight();
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
				jatekTer�let.getChildren().remove(kezbeKorong.getTlap());
				kezbeKorong.getTlap().setLayoutX(120);
				kezbeKorong.getTlap().setLayoutY(5);
				felvettPane.getChildren().add(kezbeKorong.getTlap());
				
			}
			
		} else {
			if (r.addKorong(kezbeKorong)) {
				kezbeKorong = null;
				egyRudRajzolas(r);
				
				fh.lepesNoveles();
				lepesCimke.setText("L�p�sek sz�ma: " + fh.getLepesSzam());
			}
		}
	}


	private void egyRudRajzolas(Rud r) {
		
		double y = jatekTer�let.getHeight();
		double rx1 = r.getTlap().getLayoutX();
		double w = r.getSzelesseg();
		
		for (int kix = 0; kix < r.getKorongok().size(); kix++) {
			Korong k = r.getKorongok().get(kix);
			double kx = rx1 - (k.getSzelesseg() / 2 - w / 2);
			double ky = (y - 15) - ((kix + 1) * k.getMagassag());
			Rectangle tlap = k.getTlap();
			tlap.setLayoutX(kx);
			tlap.setLayoutY(ky);
			if (!jatekTer�let.getChildren().contains(tlap)) {
				jatekTer�let.getChildren().add(tlap);
			}
			
		}
		
		
	}

}

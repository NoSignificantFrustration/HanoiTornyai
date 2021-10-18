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
    }


    @FXML
    void masodikRudClick(MouseEvent event) {
    	System.out.println("Második rúd click");
    }
    
    @FXML
    void harmadikRudClick(MouseEvent event) {
    	System.out.println("Harmadik rúd click");
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
    final private Double KDIFF = 30.0; 
    private Color[] szinek = {};



	public void setKorongokSzama(int korongokSzama) {
		this.korongokSzama = korongokSzama;
		korongGeneralas();
	}

	public void setFh(Felhasznalo fh) {
		this.fh = fh;
	}
    
	private void korongGeneralas() {
		korongSzelMax = jatekTerület.getWidth() / 3 - 2 * KDIFF;
		for (int i = 0; i < korongokSzama; i++) {
			Korong k = new Korong();
		}
	}

}

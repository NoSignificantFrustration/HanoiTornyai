package Hanoi;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FoablakController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nevMezo;

    @FXML
    private Spinner<Integer> kSpin;

    @FXML
    private Button playGomb;

    @FXML
    void PlayGombAction(ActionEvent event) throws IOException {
    	
    	String fnev = (nevMezo.getText() == null || nevMezo.getText().isEmpty())? "Anonymous" : nevMezo.getText();
    	Felhasznalo felhasznalo = new Felhasznalo(fnev);
    	
    	FXMLLoader fl = new FXMLLoader(getClass().getResource("hanoi_form2.fxml"));
    	VBox root = (VBox)fl.load();
    	// A felhasználó átadása a hanoi ablaknak
    	hanoiFormController hfc = fl.getController();
    	hfc.setFh(felhasznalo);
    	// A korongok számának a hanoi ablaknak
    	hfc.setKorongokSzama(kSpin.getValue());
    	
    	Scene sc = new Scene(root);
    	Node n = (Node)event.getSource();
    	Stage st = (Stage)n.getScene().getWindow();
    	st.setScene(sc);
    	st.show();
    	
    	
    	
    }

    @FXML
    void initialize() {
        assert nevMezo != null : "fx:id=\"nevMezo\" was not injected: check your FXML file 'Foablak.fxml'.";
        assert kSpin != null : "fx:id=\"kSpin\" was not injected: check your FXML file 'Foablak.fxml'.";
        assert playGomb != null : "fx:id=\"playGomb\" was not injected: check your FXML file 'Foablak.fxml'.";
        nevMezo.setText("Névtelen");
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(4, 10, 6);
        kSpin.setValueFactory(valueFactory);

    }
}

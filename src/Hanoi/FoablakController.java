package Hanoi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

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
    void PlayGombAction(ActionEvent event) {

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

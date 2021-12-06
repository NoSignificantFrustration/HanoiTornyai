package Hanoi;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BeallitasController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button mentGomb;

    @FXML
    private Spinner<Integer> defaultKSzamSpin;

    @FXML
    private Spinner<Integer> stemMaxSpin;

    @FXML
    void mentGombAction(ActionEvent event) throws IOException {
    	
    }

    @FXML
    void initialize() {
        assert mentGomb != null : "fx:id=\"mentGomb\" was not injected: check your FXML file 'Beallitas.fxml'.";
        assert defaultKSzamSpin != null : "fx:id=\"defaultKSzamSpin\" was not injected: check your FXML file 'Beallitas.fxml'.";
        assert stemMaxSpin != null : "fx:id=\"stemMaxSpin\" was not injected: check your FXML file 'Beallitas.fxml'.";
        
        SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(4, 10, 6);
        defaultKSzamSpin.setValueFactory(valueFactory1);
        SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(4, 10, 6);
        stemMaxSpin.setValueFactory(valueFactory2);
    }
}

package Hanoi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class hanoiFormController {

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

    }

    @FXML
    void harmadikRudClick(MouseEvent event) {

    }

    @FXML
    void masodikRudClick(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert elsoRudRect != null : "fx:id=\"elsoRudRect\" was not injected: check your FXML file 'hanoi_form2.fxml'.";
        assert masodikRudRect != null : "fx:id=\"masodikRudRect\" was not injected: check your FXML file 'hanoi_form2.fxml'.";
        assert harmadikRudRect != null : "fx:id=\"harmadikRudRect\" was not injected: check your FXML file 'hanoi_form2.fxml'.";
        assert felvettPane != null : "fx:id=\"felvettPane\" was not injected: check your FXML file 'hanoi_form2.fxml'.";

    }
}

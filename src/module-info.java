module HanoiTornyai {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens Hanoi to javafx.graphics, javafx.fxml;
}

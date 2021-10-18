module HanoiTornyai {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens Hanoi to javafx.graphics, javafx.fxml;
}

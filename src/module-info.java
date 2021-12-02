module HanoiTornyai {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens Hanoi to javafx.graphics, javafx.fxml;
}

package hw8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RandomCards extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new HBox();
		pane.setPadding(new Insets(10, 10, 10, 10));

		for(int i = 0; i < 5; i++) {
			ImageView image = new ImageView (
					new Image("file:src/hw9/pictures/troll/"+ (int)(Math.random()*50 + 1) + ".jpg"));
			pane.getChildren().add(image);
		}
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Random Cards");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}

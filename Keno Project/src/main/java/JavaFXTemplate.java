import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Box;
import javafx.geometry.Pos;

import java.util.Scanner;

public class JavaFXTemplate extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Welcome to JavaFX");

		/** Menu Scene **/

		Scene menu = new Scene(new VBox(), 1000, 1000);
		primaryStage.setScene(menu);
		primaryStage.show();


		/** Game Scene **/

		GridPane grid = new GridPane();

		for(int i=0; i<8; i++){
			for(int j=0; j<10; j++){
				Box box = new Box();
				box.setDepth(1000);
				box.setHeight(100);
				box.setWidth(100);
				grid.addColumn(j, box);
			}
		}

		grid.setHgap(14);
		grid.setVgap(14);
		grid.setAlignment(Pos.CENTER);
		//grid.setGridLinesVisible(true);

		Scene game = new Scene(grid, 1000,1000);
		primaryStage.setScene(game);
		primaryStage.show();



	}

}

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class KenoRunner extends Application {

	public static String IDLE_BUTTON_STYLE = "-fx-font-size : 32px; -fx-font-family : 'Apple Chancery'; -fx-border-width: 4px; -fx-border-color: darkred;" +
			"-fx-background-color: #fffaec;";
	public static String HOVERED_BUTTON_STYLE = "-fx-font-size : 32px; -fx-font-family : 'Apple Chancery'; -fx-border-width: 4px; -fx-border-color: darkred;" +
			"-fx-background-color: #e5e1d4;";
	public static String CLICKED_BUTTON_STYLE = "-fx-font-size : 32px; -fx-font-family : 'Apple Chancery'; -fx-border-width: 4px; -fx-border-color: darkred;" +
			"-fx-background-color: #b2afa5;";

	public static String GENERAL_TEXT_BUTTON_STYLE = "-fx-font-size : 16px; -fx-font-family : 'Apple Chancery'; -fx-border-width: 4px; -fx-border-color: darkred;" +
			"-fx-background-color: #fffaec;";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	public static void setButton(Button b){
		b.setOnMouseEntered(e -> {
			if(b.getStyle() != CLICKED_BUTTON_STYLE)
				b.setStyle(HOVERED_BUTTON_STYLE);
		});
		b.setOnMouseExited(e -> {
			if(b.getStyle() != CLICKED_BUTTON_STYLE)
				b.setStyle(IDLE_BUTTON_STYLE);
		});
		b.setOnMouseClicked(e -> {
			if(b.getStyle() != CLICKED_BUTTON_STYLE)
				b.setStyle(CLICKED_BUTTON_STYLE);
			else
				b.setStyle(HOVERED_BUTTON_STYLE);
		});
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Keno");

		/** Menu Scene **/

		BackgroundFill background_fill = new BackgroundFill(Color.MINTCREAM, CornerRadii.EMPTY, Insets.EMPTY);

		Background background = new Background(background_fill);

		GridPane menuGrid = new GridPane();

		menuGrid.setBackground(background);

		Button rules = new Button("RULES");
		rules.setMinWidth(400);
		rules.setMinHeight(100);
		rules.setStyle(IDLE_BUTTON_STYLE);
		setButton(rules);


		Button odds = new Button("ODDS");
		odds.setMinWidth(400);
		odds.setMinHeight(100);
		odds.setStyle(IDLE_BUTTON_STYLE);
		setButton(odds);

		Button play = new Button("PLAY");
		play.setMinWidth(400);
		play.setMinHeight(100);
		play.setStyle(IDLE_BUTTON_STYLE);
		setButton(play);

		Button exit = new Button("EXIT");
		exit.setMinWidth(400);
		exit.setMinHeight(100);
		exit.setStyle(IDLE_BUTTON_STYLE);
		setButton(exit);

		//Override click for exit
		exit.setOnMouseClicked(e -> {
			exit.setStyle(CLICKED_BUTTON_STYLE);
			System.exit(0);
		});

		menuGrid.add(play, 0, 0);
		menuGrid.add(rules, 0, 1);
		menuGrid.add(odds, 0, 2);
		menuGrid.add(exit, 0, 3);
		menuGrid.setMinHeight(900);

		menuGrid.setAlignment(Pos.CENTER);
		menuGrid.setVgap(40);
		KenoMenuBar ourMenuBar = new KenoMenuBar();
		VBox mainVbox = new VBox(ourMenuBar.getMenuBar(), menuGrid);
		Scene menu = new Scene(mainVbox, 1000, 1000);
		primaryStage.setScene(menu);
		primaryStage.show();

		/** Rules Scene **/
		KenoRulesScene ourRulesPage = new KenoRulesScene(primaryStage, menu);
		Scene rulesScene = ourRulesPage.getRulesScene();
		//rules override
		rules.setOnMouseClicked(e -> {
			rules.setStyle(CLICKED_BUTTON_STYLE);
			primaryStage.setScene(rulesScene);
		});
		//rules MenuItem Override
		ourMenuBar.setRulesMenuItem(primaryStage, rulesScene);

		/** Odds Scene **/
		KenoOddsScene ourOddsScene = new KenoOddsScene(primaryStage, menu);
		//rules override
		odds.setOnMouseClicked(e -> {
			primaryStage.setScene(ourOddsScene.getOddsScene());
		});
		//odds MenuItem override
		ourMenuBar.setOddsMenuItem(primaryStage, ourOddsScene.getOddsScene());

		/** Game Scene **/
		KenoGameScene ourGameScene = new KenoGameScene(primaryStage, menu);
		//play override
		play.setOnMouseClicked(e -> {
			primaryStage.setScene(ourGameScene.getGameScene());
		});

	}

}

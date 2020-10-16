import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Box;
import javafx.geometry.Pos;

import java.util.Scanner;

public class JavaFXTemplate extends Application {

	private static final String IDLE_BUTTON_STYLE = "-fx-font-size : 32px; -fx-font-family : 'Apple Chancery'; -fx-border-width: 4px; -fx-border-color: darkred;" +
			"-fx-background-color: #fffaec;";
	private static final String HOVERED_BUTTON_STYLE = "-fx-font-size : 32px; -fx-font-family : 'Apple Chancery'; -fx-border-width: 4px; -fx-border-color: darkred;" +
			"-fx-background-color: #e5e1d4;";
	private static final String CLICKED_BUTTON_STYLE = "-fx-font-size : 32px; -fx-font-family : 'Apple Chancery'; -fx-border-width: 4px; -fx-border-color: darkred;" +
			"-fx-background-color: #b2afa5;";

	private static final String GENERAL_TEXT_BUTTON_STYLE = "-fx-font-size : 16px; -fx-font-family : 'Apple Chancery'; -fx-border-width: 4px; -fx-border-color: darkred;" +
			"-fx-background-color: #fffaec;";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	public void setButton(Button b){
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

		/** Menu Bar **/
		Menu menuBarMenu = new Menu("Menu");
		MenuItem rulesMenuItem = new MenuItem("Rules");

		MenuItem oddsMenuItem = new MenuItem("Odds");
		MenuItem exitMenuItem = new MenuItem("Exit");
		exitMenuItem.setOnAction(e -> {
			exitMenuItem.setStyle(CLICKED_BUTTON_STYLE);
			System.exit(0);
		});
		menuBarMenu.getItems().add(rulesMenuItem);
		menuBarMenu.getItems().add(oddsMenuItem);
		menuBarMenu.getItems().add(exitMenuItem);
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menuBarMenu);

		BackgroundFill background_fill = new BackgroundFill(Color.NAVY, CornerRadii.EMPTY, Insets.EMPTY);

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
		menuGrid.add(rules, 0, 0);
		menuGrid.add(odds, 0, 1);
		menuGrid.add(exit, 0, 2);
		menuGrid.setMinHeight(900);

		menuGrid.setAlignment(Pos.CENTER);
		menuGrid.setVgap(40);
		VBox mainVbox = new VBox(menuBar, menuGrid);
		Scene menu = new Scene(mainVbox, 1000, 1000);
		primaryStage.setScene(menu);
		primaryStage.show();

		/** Rules Page **/

		Button bRet = new Button("RETURN");

		Button rule1 = new Button("CHOOSE THE AMOUNT OF NUMBERS TO SELECT");
		rule1.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		rule1.setMinWidth(700);
		rule1.setMinHeight(100);
		Button rule2 = new Button("SELECT THOSE NUMBERS FROM A RANGE OF 1 TO 80");
		rule2.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		rule2.setMinWidth(700);
		rule2.setMinHeight(100);
		Button rule3 = new Button("CLICK A SELECTED NUMBER TO UNSELECT");
		rule3.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		rule3.setMinWidth(700);
		rule3.setMinHeight(100);
		Button rule4 = new Button("CLICK BET TO HAVE COMPUTER DRAW WINNING NUMBERS");
		rule4.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		rule4.setMinWidth(700);
		rule4.setMinHeight(100);

		bRet.setMinWidth(700);
		bRet.setMinHeight(100);
		bRet.setStyle(IDLE_BUTTON_STYLE);
		setButton(bRet);

		//bRet override
		bRet.setOnMouseClicked(e -> {
			primaryStage.setScene(menu);
		});

		GridPane rulesPageGrid = new GridPane();


		rulesPageGrid.add(rule1, 0, 0);
		rulesPageGrid.add(rule2, 0, 1);
		rulesPageGrid.add(rule3, 0, 2);
		rulesPageGrid.add(rule4, 0, 3);

		rulesPageGrid.add(bRet, 0, 4);


		rulesPageGrid.setAlignment(Pos.CENTER);
		rulesPageGrid.setVgap(40);

		Scene rulesScene = new Scene(rulesPageGrid, 1000, 1000);

		//rules override
		rules.setOnMouseClicked(e -> {
			rules.setStyle(CLICKED_BUTTON_STYLE);
			primaryStage.setScene(rulesScene);
		});

		//rules MenuItem Override
		rulesMenuItem.setOnAction(e -> {
			rulesMenuItem.setStyle(CLICKED_BUTTON_STYLE);
			primaryStage.setScene(rulesScene);
		});

		/** Odds Scene **/

		Button oddRet = new Button("RETURN");

		Button odd1 = new Button("1 SPOT GAME");
		odd1.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd1.setMinWidth(200);
		odd1.setMinHeight(75);

		Button odd1_1 = new Button("MATCH 1 WIN $2");
		odd1_1.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd1_1.setMinWidth(200);
		odd1_1.setMinHeight(75);


		Button odd2 = new Button("4 SPOT GAME");
		odd2.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd2.setMinWidth(200);
		odd2.setMinHeight(75);

		Button odd2_1 = new Button("MATCH 4 WIN $75");
		odd2_1.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd2_1.setMinWidth(200);
		odd2_1.setMinHeight(75);

		Button odd2_2 = new Button("MATCH 3 WIN $5");
		odd2_2.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd2_2.setMinWidth(200);
		odd2_2.setMinHeight(75);

		Button odd2_3 = new Button("MATCH 2 WIN $1");
		odd2_3.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd2_3.setMinWidth(200);
		odd2_3.setMinHeight(75);

		Button odd3 = new Button("8 SPOT GAME");
		odd3.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd3.setMinWidth(200);
		odd3.setMinHeight(75);

		Button odd3_1 = new Button("MATCH 8 WIN $10,000");
		odd3_1.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd3_1.setMinWidth(200);
		odd3_1.setMinHeight(75);

		Button odd3_2 = new Button("MATCH 7 WIN $750");
		odd3_2.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd3_2.setMinWidth(200);
		odd3_2.setMinHeight(75);

		Button odd3_3 = new Button("MATCH 6 WIN $50");
		odd3_3.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd3_3.setMinWidth(200);
		odd3_3.setMinHeight(75);

		Button odd3_4 = new Button("MATCH 5 WIN $12");
		odd3_4.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd3_4.setMinWidth(200);
		odd3_4.setMinHeight(75);

		Button odd3_5 = new Button("MATCH 4 WIN $2");
		odd3_5.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd3_5.setMinWidth(200);
		odd3_5.setMinHeight(75);


		Button odd4 = new Button("10 SPOT GAME");
		odd4.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd4.setMinWidth(200);
		odd4.setMinHeight(75);

		Button odd4_1 = new Button("MATCH 10 WIN $100,000");
		odd4_1.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd4_1.setMinWidth(200);
		odd4_1.setMinHeight(75);

		Button odd4_2 = new Button("MATCH 9 WIN $4250");
		odd4_2.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd4_2.setMinWidth(200);
		odd4_2.setMinHeight(75);

		Button odd4_3 = new Button("MATCH 8 WIN $450");
		odd4_3.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd4_3.setMinWidth(200);
		odd4_3.setMinHeight(75);

		Button odd4_4 = new Button("MATCH 7 WIN $150");
		odd4_4.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd4_4.setMinWidth(200);
		odd4_4.setMinHeight(75);

		Button odd4_5 = new Button("MATCH 6 WIN $15");
		odd4_5.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd4_5.setMinWidth(200);
		odd4_5.setMinHeight(75);

		Button odd4_6 = new Button("MATCH 5 WIN $2");
		odd4_6.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd4_6.setMinWidth(200);
		odd4_6.setMinHeight(75);

		Button odd4_7 = new Button("MATCH 0 WIN $5");
		odd4_7.setStyle(GENERAL_TEXT_BUTTON_STYLE);
		odd4_7.setMinWidth(200);
		odd4_7.setMinHeight(75);

		oddRet.setMinWidth(200);
		oddRet.setMinHeight(75);
		oddRet.setStyle(IDLE_BUTTON_STYLE);
		setButton(oddRet);

		//bRet override
		oddRet.setOnMouseClicked(e -> {
			primaryStage.setScene(menu);
		});

		GridPane oddsPageGrid = new GridPane();


		oddsPageGrid.add(odd1, 0, 0);
		oddsPageGrid.add(odd1_1, 0, 1);

		oddsPageGrid.add(odd2, 1, 0);
		oddsPageGrid.add(odd2_1, 1, 1);
		oddsPageGrid.add(odd2_2, 1, 2);
		oddsPageGrid.add(odd2_3, 1, 3);

		oddsPageGrid.add(odd3, 2, 0);
		oddsPageGrid.add(odd3_1, 2, 1);
		oddsPageGrid.add(odd3_2, 2, 2);
		oddsPageGrid.add(odd3_3, 2, 3);
		oddsPageGrid.add(odd3_4, 2, 4);
		oddsPageGrid.add(odd3_5, 2, 5);

		oddsPageGrid.add(odd4, 3, 0);
		oddsPageGrid.add(odd4_1, 3, 1);
		oddsPageGrid.add(odd4_2, 3, 2);
		oddsPageGrid.add(odd4_3, 3, 3);
		oddsPageGrid.add(odd4_4, 3, 4);
		oddsPageGrid.add(odd4_5, 3, 5);
		oddsPageGrid.add(odd4_6, 3, 6);
		oddsPageGrid.add(odd4_7, 3, 7);

		oddsPageGrid.add(oddRet, 0, 7);


		oddsPageGrid.setAlignment(Pos.CENTER);
		oddsPageGrid.setVgap(40);
		oddsPageGrid.setHgap(20);

		Scene oddsScene = new Scene(oddsPageGrid, 1000, 1000);

		//rules override
		odds.setOnMouseClicked(e -> {
			primaryStage.setScene(oddsScene);
		});
		//odds MenuItem overide
		oddsMenuItem.setOnAction(e -> {
			primaryStage.setScene(oddsScene);
		});

		/** Game Scene **/

		GridPane grid = new GridPane();

		for(int i=0; i<8; i++){
			for(int j=0; j<10; j++){
				Button b1 = new Button(Integer.toString(i*10 + j + 1));
				b1.setMinHeight(40);
				b1.setMinWidth(40);
				grid.add(b1, j, i);
				/**Box box = new Box();
				box.setDepth(1000);
				box.setHeight(100);
				box.setWidth(100);
				grid.addColumn(j, box);*/
			}
		}

		grid.setHgap(14);
		grid.setVgap(14);
		grid.setAlignment(Pos.CENTER);
		//grid.setGridLinesVisible(true);

		//Scene game = new Scene(grid, 1000,1000);
		//primaryStage.setScene(game);
		//primaryStage.show();



	}

}

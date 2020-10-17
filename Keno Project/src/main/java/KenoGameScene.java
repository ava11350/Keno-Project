import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.Vector;


public class KenoGameScene {
    private Scene gameScene;

    private static String GEN_TEXT;
    private static String IDLE_TEXT;
    private static String HOVER_TEXT;
    private static String CLICK_TEXT;
    private static String background;
    private static String accent;

    private KenoColoring one = new KenoColoring();

    private void initColor(){
        Vector<String> temp = one.newColors();
        GEN_TEXT = temp.get(0);
        IDLE_TEXT = temp.get(1);
        HOVER_TEXT = temp.get(2);
        CLICK_TEXT = temp.get(3);
        background = temp.get(4);
        accent = temp.get(5);
    }

    public static void setButton(Button b){
        b.setOnMouseEntered(e -> {
            if(b.getStyle() != CLICK_TEXT)
                b.setStyle(HOVER_TEXT);
        });
        b.setOnMouseExited(e -> {
            if(b.getStyle() != CLICK_TEXT)
                b.setStyle(IDLE_TEXT);
        });
        b.setOnMouseClicked(e -> {
            if(b.getStyle() != CLICK_TEXT)
                b.setStyle(CLICK_TEXT);
            else
                b.setStyle(HOVER_TEXT);
        });
    }

    public KenoGameScene(Stage primaryStage, Scene mainMenu){
        initColor();
        Button newLookButton = new Button("NEW LOOK");
        newLookButton.setStyle(IDLE_TEXT);
        newLookButton.setMinWidth(200);
        newLookButton.setMinHeight(75);
        setButton(newLookButton);
        Button rulesButton = new Button("RULES");
        rulesButton.setStyle(IDLE_TEXT);
        rulesButton.setMinWidth(200);
        rulesButton.setMinHeight(75);
        setButton(rulesButton);
        Button oddsButton = new Button("ODDS");
        oddsButton.setStyle(IDLE_TEXT);
        oddsButton.setMinWidth(200);
        oddsButton.setMinHeight(75);
        setButton(oddsButton);
        Button exitButton = new Button("EXIT");
        exitButton.setStyle(IDLE_TEXT);
        exitButton.setMinWidth(200);
        exitButton.setMinHeight(75);
        setButton(exitButton);

        Button botTest1 = new Button("Test spot");
        botTest1.setStyle(GEN_TEXT);
        botTest1.setMinWidth(100);
        botTest1.setMinHeight(100);
        Button botTest2 = new Button("Test spot");
        botTest2.setStyle(GEN_TEXT);
        botTest2.setMinWidth(100);
        botTest2.setMinHeight(100);
        Button botTest3 = new Button("Test spot");
        botTest3.setStyle(GEN_TEXT);
        botTest3.setMinWidth(100);
        botTest3.setMinHeight(100);


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

        // Game Board
        grid.setStyle("-fx-background-color: " + background + ";");
        grid.setHgap(14);
        grid.setVgap(14);
        grid.setAlignment(Pos.CENTER);

        grid.setPadding(new Insets(40,40,60,40));
//        grid.setGridLinesVisible(true);

        //Left Side panel
        VBox leftVbox = new VBox(newLookButton, rulesButton, oddsButton, exitButton);
        leftVbox.setStyle("-fx-background-color: " + accent + ";");
        leftVbox.setAlignment(Pos.CENTER);
        leftVbox.setSpacing(20);
        leftVbox.setPadding(new Insets(0,40,0,40));

        //Bottom button panel
        HBox innerRight = new HBox(botTest1,botTest2,botTest3);
        innerRight.setStyle("-fx-background-color: " + accent + ";");
        innerRight.setAlignment(Pos.BOTTOM_CENTER);
        innerRight.setSpacing(20);
        innerRight.setPadding(new Insets(100,20,40,20));

        //main screen
        VBox rightVbox = new VBox(grid, innerRight);
        rightVbox.setStyle("-fx-background-color: " + background + ";");
        rightVbox.setAlignment(Pos.CENTER);
        rightVbox.setPadding(new Insets(0,55,0,60));

        HBox mainHbox = new HBox(leftVbox, rightVbox);
        gameScene = new Scene(mainHbox, 1000,1000);
        //primaryStage.setScene(game);
        //primaryStage.show();

        //rules screen
        KenoRulesScene rulesSceneObj = new KenoRulesScene(primaryStage, gameScene);
        Scene rulesScene = rulesSceneObj.getRulesScene();

        //odds screen
        KenoOddsScene kOddsScene = new KenoOddsScene(primaryStage, gameScene);
        Scene oddsScene = kOddsScene.getOddsScene();

        /** LEFT PANEL BUTTON HANDLING **/
        /** Overwriting all the set button **/

        newLookButton.setOnMouseClicked(e -> {
            initColor();
            grid.setStyle("-fx-background-color: " + background + ";");
            leftVbox.setStyle("-fx-background-color: " + accent + ";");
            innerRight.setStyle("-fx-background-color: " + accent + ";");
            rightVbox.setStyle("-fx-background-color: " + background + ";");
            newLookButton.setStyle(IDLE_TEXT);
            rulesButton.setStyle(IDLE_TEXT);
            oddsButton.setStyle(IDLE_TEXT);
            exitButton.setStyle(IDLE_TEXT);
        });

        rulesButton.setOnMouseClicked(e -> {
            primaryStage.setScene(rulesScene);
        });

        oddsButton.setOnMouseClicked(e -> {
           primaryStage.setScene(oddsScene);
        });

        exitButton.setOnMouseClicked(e -> {
            System.exit(0);
        });





    }

    public Scene getGameScene(){
        return gameScene;
    }
}

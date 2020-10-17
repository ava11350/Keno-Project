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

    private int numSpot;

    public int getNumSpot(){
        return numSpot;
    }

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

        Button oneSpot = new Button("1 SPOT");
        oneSpot.setStyle(IDLE_TEXT);
        oneSpot.setMinWidth(150);
        oneSpot.setMinHeight(150);
        //setButton(oneSpot);
        Button fourSpot = new Button("4 SPOT");
        fourSpot.setStyle(IDLE_TEXT);
        fourSpot.setMinWidth(150);
        fourSpot.setMinHeight(150);
        //setButton(fourSpot);
        Button eightSpot = new Button("8 SPOT");
        eightSpot.setStyle(IDLE_TEXT);
        eightSpot.setMinWidth(150);
        eightSpot.setMinHeight(150);
        //setButton(eightSpot);
        Button tenSpot = new Button("10 SPOT");
        tenSpot.setStyle(IDLE_TEXT);
        tenSpot.setMinWidth(150);
        tenSpot.setMinHeight(150);
        //setButton(tenSpot);


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
        innerRight.setAlignment(Pos.CENTER);
        innerRight.setSpacing(20);
        innerRight.setPadding(new Insets(40,20,40,20));

        //Upper button panel
        HBox upperRight = new HBox(oneSpot,fourSpot,eightSpot,tenSpot);
        upperRight.setStyle("-fx-background-color: " + accent + ";");
        upperRight.setAlignment(Pos.CENTER);
        upperRight.setSpacing(20);
        upperRight.setPadding(new Insets(20, 20, 20,20));

        //main screen
        VBox rightVbox = new VBox(upperRight, grid, innerRight);
        rightVbox.setStyle("-fx-background-color: " + background + ";");
        rightVbox.setAlignment(Pos.CENTER);
        rightVbox.setPadding(new Insets(0,55,0,60));

        HBox mainHbox = new HBox(leftVbox, rightVbox);
        gameScene = new Scene(mainHbox, 1095,1000);
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
            String OLD_IDLE = IDLE_TEXT;
            initColor();
            grid.setStyle("-fx-background-color: " + background + ";");
            leftVbox.setStyle("-fx-background-color: " + accent + ";");
            innerRight.setStyle("-fx-background-color: " + accent + ";");
            rightVbox.setStyle("-fx-background-color: " + background + ";");
            upperRight.setStyle("-fx-background-color: " + accent + ";");
            newLookButton.setStyle(IDLE_TEXT);
            rulesButton.setStyle(IDLE_TEXT);
            oddsButton.setStyle(IDLE_TEXT);
            exitButton.setStyle(IDLE_TEXT);

            if(oneSpot.getStyle() == OLD_IDLE)
                oneSpot.setStyle(IDLE_TEXT);
            else
                oneSpot.setStyle(CLICK_TEXT);
            if(fourSpot.getStyle() == OLD_IDLE)
                fourSpot.setStyle(IDLE_TEXT);
            else
                fourSpot.setStyle(CLICK_TEXT);
            if(eightSpot.getStyle() == OLD_IDLE)
                eightSpot.setStyle(IDLE_TEXT);
            else
                eightSpot.setStyle(CLICK_TEXT);
            if(tenSpot.getStyle() == OLD_IDLE)
                tenSpot.setStyle(IDLE_TEXT);
            else
                tenSpot.setStyle(CLICK_TEXT);
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


        /** TOP PANEL BUTTON HANDLING **/

        oneSpot.setOnMouseClicked(e -> {
            if(oneSpot.getStyle() == IDLE_TEXT){
                numSpot = 1;
                oneSpot.setStyle(CLICK_TEXT);
                fourSpot.setStyle(IDLE_TEXT);
                eightSpot.setStyle(IDLE_TEXT);
                tenSpot.setStyle(IDLE_TEXT);
            }else{
                numSpot = 0;
                oneSpot.setStyle(IDLE_TEXT);
            }
        });

        fourSpot.setOnMouseClicked(e -> {
            if(fourSpot.getStyle() == IDLE_TEXT){
                numSpot = 4;
                fourSpot.setStyle(CLICK_TEXT);
                oneSpot.setStyle(IDLE_TEXT);
                eightSpot.setStyle(IDLE_TEXT);
                tenSpot.setStyle(IDLE_TEXT);
            }else{
                numSpot = 0;
                fourSpot.setStyle(IDLE_TEXT);
            }
        });

        eightSpot.setOnMouseClicked(e -> {
            if(eightSpot.getStyle() == IDLE_TEXT){
                numSpot = 8;
                eightSpot.setStyle(CLICK_TEXT);
                oneSpot.setStyle(IDLE_TEXT);
                fourSpot.setStyle(IDLE_TEXT);
                tenSpot.setStyle(IDLE_TEXT);
            }else{
                numSpot = 0;
                eightSpot.setStyle(IDLE_TEXT);
            }
        });

        tenSpot.setOnMouseClicked(e -> {
            if(tenSpot.getStyle() == IDLE_TEXT){
                numSpot = 10;
                tenSpot.setStyle(CLICK_TEXT);
                oneSpot.setStyle(IDLE_TEXT);
                fourSpot.setStyle(IDLE_TEXT);
                eightSpot.setStyle(IDLE_TEXT);
            }else{
                numSpot = 0;
                tenSpot.setStyle(IDLE_TEXT);
            }
        });



    }

    public Scene getGameScene(){
        return gameScene;
    }
}

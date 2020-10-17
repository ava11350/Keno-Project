import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class KenoGameScene {
    private Scene gameScene;
    public KenoGameScene(Stage primaryStage, Scene mainMenu){
        Button test = new Button("Test spot");
        test.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        test.setMinWidth(200);
        test.setMinHeight(75);
        Button test2 = new Button("Test2 spot");
        test2.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        test2.setMinWidth(200);
        test2.setMinHeight(75);
        Button test3 = new Button("Test3 spot");
        test3.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        test3.setMinWidth(200);
        test3.setMinHeight(75);

        Button botTest1 = new Button("Test spot");
        botTest1.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        botTest1.setMinWidth(100);
        botTest1.setMinHeight(100);
        Button botTest2 = new Button("Test spot");
        botTest2.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        botTest2.setMinWidth(100);
        botTest2.setMinHeight(100);
        Button botTest3 = new Button("Test spot");
        botTest3.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
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

        grid.setHgap(14);
        grid.setVgap(14);
        grid.setAlignment(Pos.CENTER);
        grid.setBackground(new Background(new BackgroundFill(Color.DEEPPINK, CornerRadii.EMPTY, Insets.EMPTY)));
        grid.setPadding(new Insets(40,40,60,40));
//        grid.setGridLinesVisible(true);

        VBox leftVbox = new VBox(test, test2,test3);
        leftVbox.setAlignment(Pos.CENTER);
        leftVbox.setSpacing(20);
        leftVbox.setPadding(new Insets(0,40,0,40));
        leftVbox.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));


        HBox innerRight = new HBox(botTest1,botTest2,botTest3);
        innerRight.setAlignment(Pos.BOTTOM_CENTER);
        innerRight.setSpacing(20);
        innerRight.setPadding(new Insets(100,20,40,20));
        innerRight.setBackground(new Background(new BackgroundFill(Color.PURPLE, CornerRadii.EMPTY, Insets.EMPTY)));

        VBox rightVbox = new VBox(grid, innerRight);
        rightVbox.setAlignment(Pos.CENTER);
        rightVbox.setPadding(new Insets(0,55,0,60));
        rightVbox.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));

        HBox mainHbox = new HBox(leftVbox, rightVbox);
        mainHbox.setBackground(new Background(new BackgroundFill(Color.NAVY, CornerRadii.EMPTY, Insets.EMPTY)));
        gameScene= new Scene(mainHbox, 1000,1000);
        //primaryStage.setScene(game);
        //primaryStage.show();
    }

    public Scene getGameScene(){
        return gameScene;
    }
}

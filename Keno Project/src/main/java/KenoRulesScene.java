import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class KenoRulesScene {
    private Scene rulesScene;
    public KenoRulesScene(Stage primaryStage, Scene mainMenu){
        Button bRet = new Button("RETURN");

        Button rule1 = new Button("CHOOSE THE AMOUNT OF NUMBERS TO SELECT");
        rule1.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        rule1.setMinWidth(700);
        rule1.setMinHeight(100);
        Button rule2 = new Button("SELECT THOSE NUMBERS FROM A RANGE OF 1 TO 80");
        rule2.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        rule2.setMinWidth(700);
        rule2.setMinHeight(100);
        Button rule3 = new Button("CLICK A SELECTED NUMBER TO UNSELECT");
        rule3.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        rule3.setMinWidth(700);
        rule3.setMinHeight(100);
        Button rule4 = new Button("CLICK BET TO HAVE COMPUTER DRAW WINNING NUMBERS");
        rule4.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        rule4.setMinWidth(700);
        rule4.setMinHeight(100);

        bRet.setMinWidth(700);
        bRet.setMinHeight(100);
        bRet.setStyle(KenoRunner.IDLE_BUTTON_STYLE);
        KenoRunner.setButton(bRet);

        //bRet override
        bRet.setOnMouseClicked(e -> {
            primaryStage.setScene(mainMenu);
        });

        GridPane rulesPageGrid = new GridPane();


        rulesPageGrid.add(rule1, 0, 0);
        rulesPageGrid.add(rule2, 0, 1);
        rulesPageGrid.add(rule3, 0, 2);
        rulesPageGrid.add(rule4, 0, 3);

        rulesPageGrid.add(bRet, 0, 4);


        rulesPageGrid.setAlignment(Pos.CENTER);
        rulesPageGrid.setVgap(40);

        rulesScene = new Scene(rulesPageGrid, 1000, 1000);

    }
    public Scene getRulesScene (){
        return rulesScene;
    }
}

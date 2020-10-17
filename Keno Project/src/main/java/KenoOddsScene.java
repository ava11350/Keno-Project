import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class KenoOddsScene {
    private Scene oddsScene;
    public  KenoOddsScene (Stage primaryStage, Scene mainMenu) {
        Button oddRet = new Button("RETURN");

        Button odd1 = new Button("1 SPOT GAME");
        odd1.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd1.setMinWidth(200);
        odd1.setMinHeight(75);

        Button odd1_1 = new Button("MATCH 1 WIN $2");
        odd1_1.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd1_1.setMinWidth(200);
        odd1_1.setMinHeight(75);


        Button odd2 = new Button("4 SPOT GAME");
        odd2.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd2.setMinWidth(200);
        odd2.setMinHeight(75);

        Button odd2_1 = new Button("MATCH 4 WIN $75");
        odd2_1.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd2_1.setMinWidth(200);
        odd2_1.setMinHeight(75);

        Button odd2_2 = new Button("MATCH 3 WIN $5");
        odd2_2.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd2_2.setMinWidth(200);
        odd2_2.setMinHeight(75);

        Button odd2_3 = new Button("MATCH 2 WIN $1");
        odd2_3.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd2_3.setMinWidth(200);
        odd2_3.setMinHeight(75);

        Button odd3 = new Button("8 SPOT GAME");
        odd3.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd3.setMinWidth(200);
        odd3.setMinHeight(75);

        Button odd3_1 = new Button("MATCH 8 WIN $10,000");
        odd3_1.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd3_1.setMinWidth(200);
        odd3_1.setMinHeight(75);

        Button odd3_2 = new Button("MATCH 7 WIN $750");
        odd3_2.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd3_2.setMinWidth(200);
        odd3_2.setMinHeight(75);

        Button odd3_3 = new Button("MATCH 6 WIN $50");
        odd3_3.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd3_3.setMinWidth(200);
        odd3_3.setMinHeight(75);

        Button odd3_4 = new Button("MATCH 5 WIN $12");
        odd3_4.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd3_4.setMinWidth(200);
        odd3_4.setMinHeight(75);

        Button odd3_5 = new Button("MATCH 4 WIN $2");
        odd3_5.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd3_5.setMinWidth(200);
        odd3_5.setMinHeight(75);


        Button odd4 = new Button("10 SPOT GAME");
        odd4.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd4.setMinWidth(200);
        odd4.setMinHeight(75);

        Button odd4_1 = new Button("MATCH 10 WIN $100,000");
        odd4_1.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd4_1.setMinWidth(200);
        odd4_1.setMinHeight(75);

        Button odd4_2 = new Button("MATCH 9 WIN $4250");
        odd4_2.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd4_2.setMinWidth(200);
        odd4_2.setMinHeight(75);

        Button odd4_3 = new Button("MATCH 8 WIN $450");
        odd4_3.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd4_3.setMinWidth(200);
        odd4_3.setMinHeight(75);

        Button odd4_4 = new Button("MATCH 7 WIN $150");
        odd4_4.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd4_4.setMinWidth(200);
        odd4_4.setMinHeight(75);

        Button odd4_5 = new Button("MATCH 6 WIN $15");
        odd4_5.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd4_5.setMinWidth(200);
        odd4_5.setMinHeight(75);

        Button odd4_6 = new Button("MATCH 5 WIN $2");
        odd4_6.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd4_6.setMinWidth(200);
        odd4_6.setMinHeight(75);

        Button odd4_7 = new Button("MATCH 0 WIN $5");
        odd4_7.setStyle(KenoRunner.GENERAL_TEXT_BUTTON_STYLE);
        odd4_7.setMinWidth(200);
        odd4_7.setMinHeight(75);

        oddRet.setMinWidth(200);
        oddRet.setMinHeight(75);
        oddRet.setStyle(KenoRunner.IDLE_BUTTON_STYLE);
        KenoRunner.setButton(oddRet);

        //bRet override
        oddRet.setOnMouseClicked(e -> {
            primaryStage.setScene(mainMenu);
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
        oddsPageGrid.setVgap(20);
        oddsPageGrid.setHgap(20);

        oddsScene = new Scene(oddsPageGrid, 1000, 1000);
    }
    public Scene getOddsScene (){
        return oddsScene;
    }
}

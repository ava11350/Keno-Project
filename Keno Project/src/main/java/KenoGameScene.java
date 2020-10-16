import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class KenoGameScene {
    private Scene gameScene;
    public KenoGameScene(Stage primaryStage, Scene mainMenu){
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
//        grid.setGridLinesVisible(true);

        gameScene= new Scene(grid, 1000,1000);
        //primaryStage.setScene(game);
        //primaryStage.show();
    }

    public Scene getGameScene(){
        return gameScene;
    }
}

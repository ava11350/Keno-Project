import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class KenoMenuBar {
    private Menu menuBarMenu;
    private MenuItem rulesMenuItem;
    private MenuItem oddsMenuItem;
    private MenuItem exitMenuItem;
    private MenuBar menuBar;

    private String menuFONT = "-fx-font-size : 12px; -fx-font-family : 'Arial';";

    public KenoMenuBar(){
        menuBarMenu = new Menu("Menu");
        rulesMenuItem = new MenuItem("Rules");
        oddsMenuItem = new MenuItem("Odds");
        exitMenuItem = new MenuItem("Exit");
        exitMenuItem.setOnAction(e -> {
            exitMenuItem.setStyle(menuFONT);
            System.exit(0);
        });
        menuBarMenu.getItems().add(rulesMenuItem);
        menuBarMenu.getItems().add(oddsMenuItem);
        menuBarMenu.getItems().add(exitMenuItem);
        menuBar = new MenuBar();
        menuBar.getMenus().add(menuBarMenu);

    }
    public MenuBar getMenuBar(){
        return menuBar;
    }
    public void setRulesMenuItem(Stage primaryStage, Scene rulesScene){
        rulesMenuItem.setOnAction(e -> {
            rulesMenuItem.setStyle(menuFONT);
            primaryStage.setScene(rulesScene);
        });
    }
    public void setOddsMenuItem(Stage primaryStage, Scene oddsScene){
        oddsMenuItem.setOnAction(e -> {
            oddsMenuItem.setStyle(menuFONT);
            primaryStage.setScene(oddsScene);
        });
    }

    public void addNewLookMenuItem(){
        MenuItem newLook = new MenuItem("New Look");
        menuBarMenu.getItems().add(newLook);
    }

}

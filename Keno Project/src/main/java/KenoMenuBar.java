import javafx.scene.Scene;
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

    public KenoMenuBar(){
        menuBarMenu = new Menu("Menu");
        rulesMenuItem = new MenuItem("Rules");
        oddsMenuItem = new MenuItem("Odds");
        exitMenuItem = new MenuItem("Exit");
        exitMenuItem.setOnAction(e -> {
            exitMenuItem.setStyle(KenoRunner.CLICKED_BUTTON_STYLE);
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
            rulesMenuItem.setStyle(KenoRunner.CLICKED_BUTTON_STYLE);
            primaryStage.setScene(rulesScene);
        });
    }
    public void setOddsMenuItem(Stage primaryStage, Scene oddsScene){
        oddsMenuItem.setOnAction(e -> {
            oddsMenuItem.setStyle(KenoRunner.CLICKED_BUTTON_STYLE);
            primaryStage.setScene(oddsScene);
        });
    }

}


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class InvoiceManager extends Application{
//    private Invoice invoice;
    private static Stage window, alert;
    private Scene mainScene;
//    private GridPane mainLayout;
//    private Label headerLabel, itemsLabel, menuLabel;
//
//    private ArrayList<Item> items;
//    private ArrayList<Invoice> invoices;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent mainLayout = FXMLLoader.load(getClass().getResource("manager.fxml"));
        //Window settings
        window = primaryStage;
        window.setTitle("Invoice Manager");
        window.setMinWidth(625);
        window.setWidth(650);

        window.setOnCloseRequest(e -> {
            e.consume();
            Controller.closeProgram();
        });
/*
        menuLabel = new Label("Menu:\n\n");
        headerLabel = new Label("New Invoice:\n\n");
        itemsLabel = new Label("Item details:\n\n");

        MenuPane.menuSettings();
        MenuPane.menuGrid();
        HeaderPane.headerSettings();
        HeaderPane.headerGrid();
        ItemsPane.itemSettings();
        ItemsPane.itemsGrid();
        EndPane.endOptionSettings(window);
        EndPane.endGrid();
        gridSettings();*/

        mainScene = new Scene(mainLayout, 800, 600);
        window.setScene(mainScene);
        window.show();
    }
/*
    private void gridSettings() {
        mainLayout = new GridPane();
        mainLayout.setPadding(new Insets(10, 10, 10, 10));
        mainLayout.setVgap(20);
        mainLayout.setHgap(60);

        GridPane.setConstraints(menuLabel, 0, 0);
        GridPane.setConstraints(MenuPane.getMenuLayout(), 0, 1);
        GridPane.setConstraints(headerLabel, 1, 0);
        GridPane.setConstraints(HeaderPane.getHeaderLayout(), 1, 1);
        GridPane.setConstraints(itemsLabel, 1, 2);
        GridPane.setConstraints(ItemsPane.getItemLayout(), 1, 3);
        GridPane.setConstraints(EndPane.getEndLayout(), 1, 4);

        mainLayout.getChildren().addAll(menuLabel, MenuPane.getMenuLayout(), headerLabel, HeaderPane.getHeaderLayout(), itemsLabel, ItemsPane.getItemLayout(), EndPane.getEndLayout());
    }

*/
    static Stage getWindow() {
        return window;
    }

    private void preset() {
//        items = new ArrayList<>();
//        parties = new ArrayList<>();
//
//        readItems();
    }

    private void readItems() {
//        Scanner readFile = new Scanner(new FileReader("ItemList.txt"));
//
//        while(readFile.hasNext()) {
//            items.add(readFile.nextLine());
//        }
    }

    private void addItems() {
    }
}

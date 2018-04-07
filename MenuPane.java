
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class MenuPane {
    private static Button addItems, editItems, purchaseRegister;
    private static GridPane menuLayout;

    static void menuSettings() {
        addItems = new Button("Add Items");
        editItems = new Button("Edit Items");
        purchaseRegister = new Button("Purchase Register");
    }

    static void menuGrid() {
        menuLayout = new GridPane();
        menuLayout.setVgap(8);
        menuLayout.setHgap(10);

        GridPane.setConstraints(addItems, 0, 0);
        GridPane.setConstraints(editItems, 0, 1);
        GridPane.setConstraints(purchaseRegister, 0, 2);

        menuLayout.getChildren().addAll(addItems, editItems, purchaseRegister);
    }

    static GridPane getMenuLayout() {
        return menuLayout;
    }

}

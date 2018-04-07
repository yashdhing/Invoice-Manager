
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class ItemsPane {
    private static Label itemLabel, markaLabel, chaapLabel, bagLabel, bagFillLabel, kattaLabel, kattaFillLabel, weightLabel, rateLabel, amountLabel;
    private static TextField markaField, chaapField, bagField, bagFillField, kattaField, kattaFillField, rateField;
    private static ChoiceBox<String> itemField;
    private static GridPane itemLayout;

    static void itemSettings() {
        itemLabel = new Label("Item:");
        itemField = new ChoiceBox<>();
        setItems();
        markaLabel = new Label("Marka:");
        markaField = new TextField();
        chaapLabel = new Label("\tChaap:");
        chaapField = new TextField();
        bagLabel = new Label("Bag:");
        bagField = new TextField();
        bagFillLabel = new Label("\tFill:");
        bagFillField = new TextField();
        kattaLabel = new Label("Katta:");
        kattaField = new TextField();
        kattaFillLabel = new Label("\tFill:");
        kattaFillField = new TextField();
        weightLabel = new Label("Weight:");

        rateLabel = new Label("Rate:");
        rateField = new TextField();
        amountLabel = new Label("Amount:");
    }

    static void itemsGrid() {
        itemLayout = new GridPane();
        itemLayout.setVgap(5);
        itemLayout.setHgap(10);

        GridPane.setConstraints(itemLabel,0,0);
        GridPane.setConstraints(itemField,1,0);
        GridPane.setConstraints(markaLabel, 0, 1);
        GridPane.setConstraints(markaField, 1, 1);
        GridPane.setConstraints(chaapLabel, 2, 1);
        GridPane.setConstraints(chaapField, 3, 1);
        GridPane.setConstraints(bagLabel, 0, 2);
        GridPane.setConstraints(bagField, 1, 2);
        GridPane.setConstraints(bagFillLabel, 2, 2);
        GridPane.setConstraints(bagFillField, 3, 2);
        GridPane.setConstraints(kattaLabel, 0, 3);
        GridPane.setConstraints(kattaField, 1, 3);
        GridPane.setConstraints(kattaFillLabel, 2, 3);
        GridPane.setConstraints(kattaFillField, 3, 3);
        GridPane.setConstraints(weightLabel, 0, 4);
        GridPane.setConstraints(rateLabel, 0, 5);
        GridPane.setConstraints(rateField, 1, 5);
        GridPane.setConstraints(amountLabel, 0, 6);

        itemLayout.getChildren().addAll(itemLabel, itemField, markaLabel, chaapLabel, bagLabel, bagFillLabel, kattaLabel, kattaFillLabel, weightLabel, rateLabel, amountLabel, markaField, chaapField, bagField, bagFillField, kattaField, kattaFillField, rateField);
    }

    static private void setItems() {
        ArrayList<String> items = new ArrayList<>();
        items.add("Garlic");
        items.add("Methi");
        items.add("Opium");

        for(String item: items) {
            itemField.getItems().add(item);
        }
        itemField.setValue(items.get(0));
    }

    static GridPane getItemLayout() {
        return itemLayout;
    }
}

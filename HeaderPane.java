
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class HeaderPane {
    private static Label dateLabel, partyLabel, nameLabel, billNoLabel;
    private static TextField nameField, billNoField;
    private static ChoiceBox<String> partyField;
    private static GridPane headerLayout;

    static void headerSettings() {
        dateLabel = new Label("Date:");
        partyLabel = new Label("Party:");
        partyField = new ChoiceBox<>();
        setParties();
        nameLabel = new Label("Name:");
        nameField = new TextField();
        billNoLabel = new Label("\tBill No.:");
        billNoField = new TextField();
    }

    static void headerGrid() {
        headerLayout = new GridPane();
        headerLayout.setVgap(5);
        headerLayout.setHgap(10);

        GridPane.setConstraints(dateLabel, 0, 0);
        GridPane.setConstraints(billNoLabel, 2, 0);
        GridPane.setConstraints(billNoField, 3, 0);
        GridPane.setConstraints(partyLabel, 0, 1);
        GridPane.setConstraints(partyField, 1, 1);
        GridPane.setConstraints(nameLabel, 0, 2);
        GridPane.setConstraints(nameField, 1, 2);

        headerLayout.getChildren().addAll(dateLabel, partyLabel, partyField, nameLabel, nameField, billNoLabel, billNoField);
    }

    static private void setParties() {
        ArrayList<String> parties = new ArrayList<>();
        parties.add("Aditya");
        parties.add("Agarwal");

        for(String party: parties) {
            partyField.getItems().add(party);
        }
        partyField.setValue(parties.get(0));
    }

    static GridPane getHeaderLayout() {
        return headerLayout;
    }
}

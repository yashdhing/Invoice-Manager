import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Controller {
    @FXML
    private static Button saveButton, clearButton, closeButton;
    private static Button addItems, editItems, purchaseRegister;
    private static Label dateLabel, partyLabel, nameLabel, billNoLabel;
    private static TextField nameField, billNoField;
    private static Label itemLabel, markaLabel, chaapLabel, bagLabel, bagFillLabel, kattaLabel, kattaFillLabel, weightLabel, rateLabel, amountLabel;
    private static TextField markaField, chaapField, bagField, bagFillField, kattaField, kattaFillField, rateField;
    private static ChoiceBox<String> itemField;
    private static ChoiceBox<String> partyField;

//    public void initialize() {
//        setParties();
//        setItems();
//    }

    static private void setParties() {
        ArrayList<String> parties = new ArrayList<>();
        parties.add("Aditya");
        parties.add("Agarwal");

        for(String party: parties) {
            partyField.getItems().add(party);
        }
        partyField.setValue(parties.get(0));
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

    public void closeAction() {
        closeProgram();
    }

    public void saveAction() {
        NotificationBox.display("Saved", "Your invoice entry has been saved");
    }

    public void clearAction() {
        boolean choice;
        choice = ConfirmationBox.display("Alert!", "Clear entry?");
        if(choice)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void closeProgram() {
        boolean choice = ConfirmationBox.display("Close Application", "Do you want to exit?");
        if(choice)
            InvoiceManager.getWindow().close();
    }
}

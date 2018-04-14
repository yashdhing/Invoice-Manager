
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

import java.net.URL;
import java.util.ResourceBundle;

public class ConfirmationBox{
    static Button yesButton;
    static Button noButton;
    static Label label;
    static boolean choice = false;

    public static boolean display(String title, String message) {
        Stage confirmationWindow = new Stage();

        confirmationWindow.initModality(Modality.APPLICATION_MODAL);
        confirmationWindow.setTitle(title);
        confirmationWindow.setMinWidth(400);
        confirmationWindow.setMinHeight(150);

        Label label = new Label();
        label.setText("Are you sure?");

        Button yes = new Button("Yes");
        Button no = new Button("No");

        yes.setOnAction(e -> {
            choice = true;
            confirmationWindow.close();
        });

        no.setOnAction(e -> {
            choice = false;
            confirmationWindow.close();
        });

        HBox layout = new HBox(15);
        layout.getChildren().addAll(yes, no);
        layout.setAlignment(Pos.BOTTOM_CENTER);

        Scene scene = new Scene(layout);

        confirmationWindow.setScene(scene);
        confirmationWindow.showAndWait();

        return choice;
    }
}
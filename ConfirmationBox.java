
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class ConfirmationBox {
    static boolean choice;

    public static boolean display(String title, String message) {
        //boolean choice = false;
        Stage confirmationWindow = new Stage();

        confirmationWindow.initModality(Modality.APPLICATION_MODAL);
        confirmationWindow.setTitle(title);
        confirmationWindow.setMinWidth(400);
        confirmationWindow.setMinHeight(150);

        Label label = new Label();
        label.setText(message);

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
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);

        confirmationWindow.setScene(scene);
        confirmationWindow.showAndWait();

        return choice;
    }
}

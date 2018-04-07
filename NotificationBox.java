
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class NotificationBox {
    private static Button okayButton;

    public static void display(String title, String message) {
        //boolean choice = false;
        Stage notificationWindow = new Stage();

        notificationWindow.initModality(Modality.APPLICATION_MODAL);
        notificationWindow.setTitle(title);
        notificationWindow.setMinWidth(400);
        notificationWindow.setMinHeight(150);

        Label label = new Label();
        label.setText(message);

        okayButton = new Button("Okay");

        okayButton.setOnAction(e -> {
            notificationWindow.close();
        });

        HBox layout = new HBox(15);
        layout.getChildren().addAll(okayButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);

        notificationWindow.setScene(scene);
        notificationWindow.showAndWait();
    }
}

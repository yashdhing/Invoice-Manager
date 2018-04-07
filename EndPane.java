
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EndPane {
    private static Button saveButton, clearButton, closeButton;
    private static GridPane endLayout;

    static void endOptionSettings(Stage window) {
        saveButton = new Button("Save");
        clearButton = new Button("Clear Entry");
        closeButton = new Button("Close");

        saveButton.setOnAction(e -> {
            //realAction
            NotificationBox.display("Saved", "Your invoice entry has been saved");
        });

        clearButton.setOnAction(e -> {
            boolean choice;
            choice = ConfirmationBox.display("Alert!", "Clear entry?");
            if(choice)
                System.out.println("Yes");
            else
                System.out.println("No");
        });

        closeButton.setOnAction(e -> closeProgram(window));
    }

    static void endGrid() {
        endLayout = new GridPane();
        endLayout.setPadding(new Insets(10, 10, 10, 10));
        endLayout.setHgap(10);

        GridPane.setConstraints(saveButton, 0, 0);
        GridPane.setConstraints(clearButton, 1, 0);
        GridPane.setConstraints(closeButton, 2, 0);

        endLayout.getChildren().addAll(saveButton, clearButton, closeButton);
        endLayout.setAlignment(Pos.CENTER_RIGHT);
    }

    static void closeProgram(Stage window) {
        boolean choice = ConfirmationBox.display("Close Application", "Do you want to exit?");
        if(choice)
            window.close();
    }

    static GridPane getEndLayout() {
        return endLayout;
    }
}

package University;

import Database.Conection;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MainContent {

    /**
     * Builds the main content layout with the primary action buttons.
     */
    public VBox getContent() {
        VBox mainContent = new VBox(10);
        mainContent.setStyle("-fx-padding: 20;");

        Button btnShowProfessors = new Button("Show professors");
        btnShowProfessors.setOnAction(actionEvent -> Conection.printAllProfessors());

        int professorCount = Conection.getTableCount("Professor"); // Example usage
        Label lblProfessorsCount = new Label("Professors: " + professorCount);

        mainContent.getChildren().add(btnShowProfessors);
        mainContent.getChildren().add(lblProfessorsCount);
        return mainContent;
    }
}

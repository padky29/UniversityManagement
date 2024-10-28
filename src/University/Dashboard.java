package University;

import Database.Conection;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Objects;

public class Dashboard extends Application {

    public static void main(String[] args) {
        Conection.connect();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Font.loadFont(getClass().getResourceAsStream("/Assets/Poppins/Poppins-Regular.ttf"), 16); // Adjust the size as needed


        // Instantiate and add components
        NavBar navBar = new NavBar();
        MainContent mainContent = new MainContent();

        root.setTop(navBar.getNavBar());         // Add navigation bar to top
        root.setCenter(mainContent.getContent()); // Set main content in center

        // Set up the scene with CSS
        Scene scene = new Scene(root, 1080, 600);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("styles.css")).toExternalForm());

        // Configure and show stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Nom nom");
        primaryStage.show();
    }
}

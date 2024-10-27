package University;

import Database.Conection;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dashboard extends Application {
    public static void main(String[] args){
        Conection.connect();
        Conection.printAllProfessors();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Dashboard");
        Button btn = new Button();
        btn.setText("Professors");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                System.out.println("Hello");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

    }
}

package University;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class NavBar {

    /**
     * Builds the navigation bar layout with a bottom shadow effect.
     */
    public VBox getNavBar() {
        // Create navigation bar (HBox)
        HBox navBar = new HBox(10);
        navBar.setId("navBar");

        Label heading = new Label("Dashboard");
        heading.setId("heading");

        navBar.getChildren().add(heading);

        // Create a thin rectangle as the "bottom shadow"
        Rectangle bottomBorderShadow = new Rectangle(1080, 2); // Adjust width and height as needed
        bottomBorderShadow.setFill(Color.rgb(0, 0, 0, 0.25)); // Semi-transparent shadow color

        // Stack the navbar and shadow
        VBox navContainer = new VBox(navBar, bottomBorderShadow);
        return navContainer;
    }
}

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ChooseNotation {

    @FXML VBox vbox_notes;
    @FXML VBox vbox_intervals;
    @FXML VBox vbox_chords;

    @FXML
    public void goToChooseKeySignature() {
        /* sets stage as choose_notation.fxml   */

        Stage stage = (Stage) vbox_chords.getScene().getWindow();
        Parent game_param_screen = null;
        System.out.println(System.getProperty("user.dir"));
        try {
            URL url = new File("src/main/resources/fxml/choose_key_signature.fxml").toURI().toURL();
            game_param_screen = FXMLLoader.load(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setScene(new Scene(game_param_screen, Main.WINDOW_WIDTH, Main.WINDOW_HEIGHT));
        stage.show();
    }

    @FXML
    public void navBack() {
        Stage stage = (Stage) vbox_notes.getScene().getWindow();
        Parent game_param_screen = null;
        System.out.println(System.getProperty("user.dir"));
        try {
            URL url = new File("src/main/resources/fxml/main.fxml").toURI().toURL();
            game_param_screen = FXMLLoader.load(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setScene(new Scene(game_param_screen, Main.WINDOW_WIDTH, Main.WINDOW_HEIGHT));
        stage.show();
    }

    @FXML
    public void setNotationChoice() {

    }

    @FXML
    public void highlight() {

    }

    @FXML
    public void unHighlight() {
        // todo
    }

}

package unipar.br.trabalho9atividades.Central;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class ScreenController {

    private static BorderPane mainPane;

    public static void setMainPane(BorderPane pane) {
        mainPane = pane;
    }

    public static void setScreen(String fxmlName) {
        try {
            Node screen = FXMLLoader.load(ScreenController.class.getResource("/unipar/br/trabalho9atividades/" + fxmlName));
            mainPane.setCenter(screen);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

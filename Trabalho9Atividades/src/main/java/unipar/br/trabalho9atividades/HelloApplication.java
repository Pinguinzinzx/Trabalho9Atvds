package unipar.br.trabalho9atividades;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import unipar.br.trabalho9atividades.Central.ScreenController;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/unipar/br/trabalho9atividades/home-view.fxml"));
        BorderPane root = loader.load();

        ScreenController.setMainPane(root);

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/unipar/br/trabalho9atividades/style.css").toExternalForm());

        stage.setScene(scene);
        stage.setTitle("Central de Atividades - JavaFX");
        stage.setWidth(900);
        stage.setHeight(600);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

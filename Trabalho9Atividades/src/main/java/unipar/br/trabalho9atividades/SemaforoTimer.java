package unipar.br.trabalho9atividades;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import unipar.br.trabalho9atividades.Central.ScreenController;

public class SemaforoTimer {

    @FXML private Circle cRed;
    @FXML private Circle cYellow;
    @FXML private Circle cGreen;

    private Timeline timeline;
    private int estado = 0;

    @FXML
    public void initialize() {

        cRed.setFill(Paint.valueOf("#555"));
        cYellow.setFill(Paint.valueOf("#555"));
        cGreen.setFill(Paint.valueOf("#555"));

        timeline = new Timeline(
                new KeyFrame(Duration.seconds(2), e -> mudarEstado())
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
    }

    private void mudarEstado() {

        switch (estado) {
            case 0 -> { // Vermelho
                cRed.setFill(Paint.valueOf("RED"));
                cYellow.setFill(Paint.valueOf("#555"));
                cGreen.setFill(Paint.valueOf("#555"));
                estado = 1;
            }

            case 1 -> { // Verde
                cRed.setFill(Paint.valueOf("#555"));
                cYellow.setFill(Paint.valueOf("#555"));
                cGreen.setFill(Paint.valueOf("GREEN"));
                estado = 2;
            }

            case 2 -> { // Amarelo
                cRed.setFill(Paint.valueOf("#555"));
                cYellow.setFill(Paint.valueOf("YELLOW"));
                cGreen.setFill(Paint.valueOf("#555"));
                estado = 0;
            }
        }
    }

    @FXML
    private void iniciar() {
        timeline.playFromStart();
    }

    @FXML
    private void parar() {
        timeline.stop();
    }

    @FXML
    private void voltar() {
        ScreenController.setScreen("home-view.fxml");
    }
}

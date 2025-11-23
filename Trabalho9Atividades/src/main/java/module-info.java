module unipar.br.trabalho9atividades {
    requires javafx.controls;
    requires javafx.fxml;


    opens unipar.br.trabalho9atividades to javafx.fxml;
    exports unipar.br.trabalho9atividades;
    exports unipar.br.trabalho9atividades.Central;
    opens unipar.br.trabalho9atividades.Central to javafx.fxml;
}
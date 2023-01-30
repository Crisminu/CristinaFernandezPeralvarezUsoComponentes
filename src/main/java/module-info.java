module es.cristina.cristinafernandezperalvarezusocomponentes {
    requires javafx.controls;
    requires javafx.fxml;

    opens usoComponentes to javafx.fxml;
    exports usoComponentes;
    exports componentes;
    opens componentes to javafx.fxml;
}
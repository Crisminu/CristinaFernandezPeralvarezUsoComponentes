package componentes;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControladorNombre {
    @FXML
    private Label txtDepartamento;
    @FXML
    private Label lblEmpresa;



    public void setTxtDepartamento(String nombre) {
        txtDepartamento.setText(nombre);
    }

    public void setLblEmpresa(String empresa) {
        lblEmpresa.setText(empresa);
    }
}

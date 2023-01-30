package usoComponentes;

import componentes.ControladorImagen;
import componentes.ControladorNombre;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;


public class ControladorPrincipal{

    @FXML
    private ControladorImagen compImagenController;
    @FXML
    private ControladorNombre compNombreController;
    @FXML
    private RadioButton rMark;
    @FXML
    private RadioButton rVentas;
    @FXML
    private RadioButton rProd;

    @FXML
    public Label txtFormacion;
    @FXML
    public Label txtExperiencia;
    @FXML
    public Label txtDescripcion;

    @FXML
    private String empresa = "Celia Viñas";


    public void initialize(){
        marketing();
    }
    private void marketing() {
        Image marketing = new Image(getClass().getResourceAsStream("Marketing.jpg"));

        compImagenController.setImagen(marketing);
        compNombreController.setLblEmpresa(empresa);
        compNombreController.setTxtDepartamento("Departamento de Marketing");

        txtFormacion.setText("MBA en marketing digital de alto rendimiento");
        txtDescripcion.setText("Planificación y desarrollo de estrategias de marketing");
        txtExperiencia.setText("4 años en Karma Box como especialista de marketing");
    }
    private void produccion() {
        Image produccion = new Image(getClass().getResourceAsStream("Producción.jpg"));
        compImagenController.setImagen(produccion);
        compNombreController.setLblEmpresa(empresa);
        compNombreController.setTxtDepartamento("Departamento de Producción");

        txtFormacion.setText("Grado en Ingeniería Informática en la Universidad de Almería");
        txtDescripcion.setText("Creación, diseño, despliegue y compatibilidad de software");
        txtExperiencia.setText("3 años de Desarrollo de software en Indra");
    }

    private void ventas() {
        Image ventas = new Image(getClass().getResourceAsStream("Ventas.jpg"));
        compImagenController.setImagen(ventas);
        compNombreController.setLblEmpresa(empresa);
        compNombreController.setTxtDepartamento("Departamento de Ventas");

        txtFormacion.setText("Master en Dirección Comercial y Ventas en EAE");
        txtDescripcion.setText("Competencias y habilidades en desarrollo comercial y ventas");
        txtExperiencia.setText("4 años en Celia Viñas");
    }

    public void getInfo(ActionEvent event){
        if(rMark.isSelected()){
            marketing();
        }else if(rProd.isSelected()){
            produccion();
        }else if(rVentas.isSelected()){
            ventas();
        }
    }


}
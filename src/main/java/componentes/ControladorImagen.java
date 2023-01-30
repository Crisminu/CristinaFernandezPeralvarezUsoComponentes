package componentes;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ControladorImagen {

    @FXML
    private ImageView idImagen;

    public void setImagen(Image imagen) {
        idImagen.setImage(imagen);
    }
}

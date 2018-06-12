package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Controller {
    @FXML private Label label;

    public void initialize(){

    }

    public void handleMouseEnter(){
        label.setScaleX(2.0);
        label.setScaleY(2.0);
    }

    public  void handleMouseExit(){
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }
}

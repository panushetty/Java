package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;



public class Controller {
    @FXML private TextField nameField;
    @FXML private Button helloButton;
    @FXML private Button byeButton;
    @FXML private CheckBox ourCheckBox;
    @FXML private Label ourLabel;

    @FXML
    public void onButtonClicked(ActionEvent e) {
       if(e.getSource().equals(helloButton)){
           System.out.println("Hello ,"+nameField.getText());
       }
       if(e.getSource().equals(byeButton)){
           System.out.println("Bye ,"+nameField.getText());

       }

       Runnable task = () -> {
           try{
               String s=Platform.isFxApplicationThread()?"UI Thread":"Background Thread";
               System.out.println("I am going to sleep"+s);
               Thread.sleep(10000);
               Platform.runLater(() -> {
                   String h=Platform.isFxApplicationThread()?"UI Thread":"Background Thread";
                   ourLabel.setText("You have done something");
               });

           }catch(InterruptedException event){

           }
       };


        new Thread(task).start();
       /*try{
           Thread.sleep(10000);

       }catch(InterruptedException event){

       }*/
        if(ourCheckBox.isSelected()){
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }

    @FXML
    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }



    @FXML
    public void handleKeyRelease(){
        String text=nameField.getText();
        boolean disableButtons= text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }

    @FXML
    public void  handleChange(){
        System.out.println("The checkBox is "+(ourCheckBox.isSelected()? "checked":"not checked"));

    }


}

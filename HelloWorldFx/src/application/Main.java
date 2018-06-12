package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root=FXMLLoader.load(getClass().getResource("/sample.fxml"));
//		GridPane root=new GridPane();
//		root.setAlignment(Pos.CENTER);
//		root.setVgap(10);
//		root.setHgap(10);
		primaryStage.setTitle("Hello Java Effects");
		primaryStage.setScene(new Scene(root,600,275));
//		Label greeting=new Label("hello");
//		greeting.setTextFill(Color.GREEN);
//		greeting.setFont(Font.font("Times New Roman",FontWeight.BOLD,70));
//		root.getChildren().add(greeting);
		primaryStage.show();		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

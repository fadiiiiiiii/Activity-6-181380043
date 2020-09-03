package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    VBox root;
    Label outputL;
    HBox numberFieldHbox,buttonHbox;
    TextField number1TF,number2TF;
    Button addBtn,subtractBtn;
    int sum;
    int subtract;
    HBox output;
    @Override
    public void start(Stage primaryStage) throws Exception{
      number1TF=new TextField();
      number1TF.setPromptText("Number 1");
      number2TF=new TextField();
      number2TF.setPromptText("Number 2");
      addBtn=new Button("ADD");
      subtractBtn=new Button("Subtract");
        addBtn.setOnAction(e-> setAddBtn());
        subtractBtn.setOnAction(e-> setSubtractBtn());

      outputL=new Label();
      outputL.setStyle("-fx-font:24px Arial");
      numberFieldHbox=new HBox(30,number1TF,number2TF);
      numberFieldHbox.setPadding(new Insets(30,10,10,10));
      buttonHbox=new HBox(20,addBtn,subtractBtn);
      buttonHbox.setPadding(new Insets(10,20,10,120));
        output=new HBox(outputL);
        output.setPadding(new Insets(10,10,20,10));
        root=new VBox(30,numberFieldHbox,buttonHbox,output);




        primaryStage.setTitle("Activity6");
        Scene screen =new Scene(root);
        primaryStage.setScene(screen);
        primaryStage.show();

    }

    public void setAddBtn() {
        sum = Integer.parseInt(number1TF.getText())+Integer.parseInt(number2TF.getText());
        outputL.setText("The sum is "+sum);
    }

    public void setSubtractBtn() {
        subtract = Integer.parseInt(number1TF.getText())-Integer.parseInt(number2TF.getText());
        outputL.setText("The Subtract is "+subtract);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

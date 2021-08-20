/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package children.s_home_registration_system;

import java.sql.Connection;
import java.sql.DriverManager;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Maria Gichomo
 */
public class ChildrenS_Home_Registration_System extends Application {
   @Override
    public void start(Stage primaryStage) {
       Text text1 = new Text("First Name");
       TextField textfield1 = new TextField();
       Text txt1=new Text();
       
       Text text2 = new Text("Second Name");
       TextField textfield2 = new TextField();
       
       Text text3 = new Text("Gender");
       Button add_btn= new Button("Register");
       
       ChoiceBox titles = new ChoiceBox();
       titles.getItems().addAll("Male","Female");
       
       
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600,400);
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);
        
        gridPane.add(text1,0,1);
        gridPane.add(textfield1,1,1);
        gridPane.add(txt1, 0, 0);
        
        gridPane.add(text2,0,2);
        gridPane.add(textfield2,1,2);
        
        gridPane.add(text3,0,3);
        gridPane.add(titles,1,3);
        
        gridPane.add(add_btn,0,4);
        
        add_btn.setStyle("-fx-background-color: cyan; -fx-text-fill: black; -fx-font-size:13pt;");
        
        text1.setStyle("-fx-font: normal bold 20px 'Monospaced'");
        text2.setStyle("-fx-font: normal bold 20px 'Monospaced'");
        text3.setStyle("-fx-font: normal bold 20px 'Monospaced'");
        
        gridPane.setStyle("-fx-background-color:gray;");
        
        
        
        
        primaryStage.setTitle("Children Registration System");
        Scene scene = new Scene (gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        add_btn.setOnMouseClicked((new EventHandler<MouseEvent>(){
             @Override
             public void handle(MouseEvent event) { 
                 
             try{
                final String first_name = textfield1.getText();
                final String second_name = textfield2.getText();
                final String title_option = (String)titles.getValue();
                
                Class.forName("com.mysql.jdbc.Driver"); //step one
                
                
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/child?autoReconnect=true&useSSL=false","root","");//step two
                
                java.sql.Statement st =con.createStatement();//step three
                
                String sts = "INSERT INTO `register`(`First Name`,`Second Name`,`Gender`)VALUES("+"'"+first_name+"'"+", "+"'"+second_name+"'"+","+"'"+title_option+"'"+")";
                
                  st.executeUpdate(sts);//step four
                  txt1.setText("Successfully inserted");
                
                con.close();//step five
            }
                catch(Exception ee){System.out.println(ee);txt1.setText("Not Inserted");}
            
       
                
                 
                GridPane secondGridPane=new GridPane();
                Button add_btn1= new Button("Add a new child");
                Button add_btn5= new Button("Make Donation");

                

                
                
                secondGridPane.setMinSize(400,200);
                secondGridPane.setVgap(10);
                secondGridPane.setHgap(20);
                secondGridPane.setAlignment(Pos.CENTER);
                
                
                secondGridPane.add(add_btn1, 0, 1);
                secondGridPane.add(add_btn5,1,1);
               
                add_btn1.setStyle("-fx-background-color: cyan; -fx-text-fill: black; -fx-font-size:13pt;");
                add_btn5.setStyle("-fx-background-color: cyan; -fx-text-fill: black; -fx-font-size:13pt;");
      
        
                secondGridPane.setStyle("-fx-background-color:gray;");

               
                
                
                Stage newWindow = new Stage();
                newWindow.setTitle("Buttons");
                Scene scene_two=new Scene(secondGridPane);
                newWindow.setScene(scene_two);
                newWindow.show();
                                   
  
        
         add_btn1.setOnMouseClicked((new EventHandler<MouseEvent>(){
             @Override
             public void handle(MouseEvent event) { 
                 
                 
                //You can opt to put the code to send data to the DB here 
                 
                GridPane thirdGridPane=new GridPane();
                
                Text name_lbl = new Text("Name");
                TextField name_tf = new TextField();
                Text txt2=new Text();
                
                Text gen_lbl = new Text("Gender");
                
                ChoiceBox titles = new ChoiceBox();
                titles.getItems().addAll("Male","Female");
                
                Text age_lbl = new Text("Age");
                TextField age_tf = new TextField();
                
                Text loc_lbl = new Text("Location");
                
                
                ChoiceBox titles1 = new ChoiceBox();
                titles1.getItems().addAll("Nairobi","Mombasa","Naivasha","Nakuru","Kisumu");
                
                Button add_btn2 = new Button("Add Child");
                                

                
                
                thirdGridPane.setMinSize(600,400);
                thirdGridPane.setVgap(10);
                thirdGridPane.setHgap(20);
                thirdGridPane.setAlignment(Pos.CENTER);
                
                
                thirdGridPane.add(name_lbl, 0,1);
                thirdGridPane.add(name_tf, 1,1);
                
                thirdGridPane.add(gen_lbl,0,2);
                thirdGridPane.add(titles,1,2);
                
                thirdGridPane.add(age_lbl,0,3);
                thirdGridPane.add(age_tf,1,3);
                
                thirdGridPane.add(loc_lbl,0,4);
                thirdGridPane.add(titles1,1,4);
               
                thirdGridPane.add(add_btn2,1,5);
                
                thirdGridPane.add(txt2,0, 0);
                
                 add_btn2.setStyle("-fx-background-color: cyan; -fx-text-fill: black; -fx-font-size:13pt;");
        
        name_lbl.setStyle("-fx-font: normal bold 20px 'Monospaced'");
        gen_lbl.setStyle("-fx-font: normal bold 20px 'Monospaced'");
        age_lbl.setStyle("-fx-font: normal bold 20px 'Monospaced'");
        loc_lbl.setStyle("-fx-font: normal bold 20px 'Monospaced'");
        
        thirdGridPane.setStyle("-fx-background-color:gray;");
        
                
                
                Stage newWindow = new Stage();
                newWindow.setTitle("Added Children");
                Scene scene_three=new Scene(thirdGridPane);
                newWindow.setScene(scene_three);
                newWindow.show();
                
                
             add_btn2.setOnMouseClicked((new EventHandler<MouseEvent>(){
             @Override
             public void handle(MouseEvent event) { 
                 
             try{
                final String name1= name_tf.getText();
                final String gender1= (String)titles.getValue();
                final String age1= age_tf.getText();
                final String location1 = (String)titles1.getValue();
            
                
                Class.forName("com.mysql.jdbc.Driver"); //step one
                
                
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/child?autoReconnect=true&useSSL=false","root","");//step two
                
                java.sql.Statement st =con.createStatement();//step three
                
                String sts = "INSERT INTO `occupants`(`Name`,`Gender`,`Age`,`Location`)VALUES("+"'"+name1+"'"+", "+"'"+gender1+"'"+","+"'"+age1+"'"+","+"'"+location1+"'"+")";
                
                  st.executeUpdate(sts);//step four
                  txt2.setText("Successfully inserted");
                
                con.close();//step five
            }
                catch(Exception ee){System.out.println(ee);txt2.setText("Not Inserted");}
             
                
             
             
             add_btn5.setOnMouseClicked((new EventHandler<MouseEvent>(){
             @Override
             public void handle(MouseEvent event) { 
                 
                 
                 
                //You can opt to put the code to send data to the DB here 
                
                 
                GridPane fourthGridPane=new GridPane();
                
                Text name1_lbl = new Text("First Name");
                TextField name1_tf = new TextField();
                Text txt3=new Text();
                
                Text sname_lbl = new Text("Surname");
                TextField sname_tf = new TextField();
                
                Text mail_lbl = new Text("Email");
                TextField mail_tf = new TextField();
                
                Text tel_lbl = new Text("Telephone number");
                TextField tel_tf= new TextField();
                
                Text donation_lbl = new Text("Donation");
                TextField donation_tf = new TextField();
                
                Text quant_lbl = new Text("Quantity");
                TextField quant_tf = new TextField();
                
                 
                Button add_btn6 = new Button("Add Donation");
         
                fourthGridPane.setMinSize(600,400);
                fourthGridPane.setVgap(20);
                fourthGridPane.setHgap(50);
                fourthGridPane.setAlignment(Pos.CENTER);
               
                
                fourthGridPane.add(name1_lbl,0,1);
                fourthGridPane.add(name1_tf,1,1);
                
                fourthGridPane.add(sname_lbl,0,2);
                fourthGridPane.add(sname_tf,1,2);
                
                fourthGridPane.add(mail_lbl,0,3);
                fourthGridPane.add(mail_tf,1,3);
                
                fourthGridPane.add(tel_lbl,0,4);
                fourthGridPane.add(tel_tf,1,4);
               
                fourthGridPane.add(donation_lbl,0,5);
                fourthGridPane.add(donation_tf,1,5);
                
                fourthGridPane.add(quant_lbl,0,6);
                fourthGridPane.add(quant_tf,1,6);
               
                
                fourthGridPane.add(add_btn6,1,8);
                
                fourthGridPane.add(txt3,0,0);
                
                  add_btn6.setStyle("-fx-background-color: cyan; -fx-text-fill: black; -fx-font-size:13pt;");
        
        name1_lbl.setStyle("-fx-font: normal bold 20px 'Monospaced'");
        sname_lbl.setStyle("-fx-font: normal bold 20px 'Monospaced'");
        mail_lbl.setStyle("-fx-font: normal bold 20px 'Monospaced'");
        tel_lbl.setStyle("-fx-font: normal bold 20px 'Monospaced'");
        donation_lbl.setStyle("-fx-font: normal bold 20px 'Monospaced'");
        quant_lbl.setStyle("-fx-font: normal bold 20px 'Monospaced'");
        
        fourthGridPane.setStyle("-fx-background-color:gray;");
                
                
                Stage newWindow = new Stage();
                newWindow.setTitle("Donations");
                Scene scene_four=new Scene(fourthGridPane);
                newWindow.setScene(scene_four);
                newWindow.show();
                
                
             add_btn6.setOnMouseClicked((new EventHandler<MouseEvent>(){
             @Override
             public void handle(MouseEvent event) { 
                 
             try{
                final String fname= name1_tf.getText();
                final String suname= sname_tf.getText();
                final String address= mail_tf .getText();
                final String phone= tel_tf .getText();
                final String money= donation_tf .getText();
                final String amount= quant_tf.getText();
            
                
                Class.forName("com.mysql.jdbc.Driver"); //step one
                
                
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/child?autoReconnect=true&useSSL=false","root","");//step two
                
                java.sql.Statement st =con.createStatement();//step three
                
                String sts = "INSERT INTO `donation`(`First Name`,`Surname`,`Email`,`Telephone`,`Donation`,`Quantity`)VALUES("+"'"+fname+"'"+","+"'"+suname+"'"+","+"'"+address+"'"+","+"'"+phone+"'"+","+"'"+money+"'"+","+"'"+amount+"'"+")";
                
                  st.executeUpdate(sts);//step four
                  txt3.setText("Saving Successfully");
                
                con.close();//step five
            }
                catch(Exception ee){System.out.println(ee);txt3.setText("Not Inserted");}
             
                
                
                
                
   
                
                
              }
             
          }));
         
        
        
        
         }
             
          }));
        
        
         }
             
          }));
              }
             
          }));
             
         }
             
          }));
        
        
       
   }    
    public static void main(String[] args) {
        launch(args);
    }
    
}

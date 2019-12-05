package controllers;

import java.sql.SQLException;
import java.sql.Statement;

import application.Main;
import dao.DBConnect;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class AdminController {

	@FXML
    private Pane pane1;
    @FXML
    private Pane pane2;
    @FXML
    private Pane pane3;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtAddress;

    // Declare DB objects
    DBConnect conn = null;
    Statement stmt = null;

    public AdminController() {
              conn = new DBConnect();
    }

    public void viewAccounts() {         }

    public void updateRec() {
              pane3.setVisible(false);
              pane2.setVisible(false);
              pane1.setVisible(true);
    }
    public void deleteRec() {
              pane1.setVisible(false);
              pane2.setVisible(true);
              pane3.setVisible(false);
    }

    public void addBankRec() {
              pane1.setVisible(false);
              pane2.setVisible(false);
              pane3.setVisible(true);
    }


    public void submitBank() {

              // INSERT INTO BANK TABLE
              try {
              // Execute a query
            	  System.out.println("Inserting records into the table...");
            	  stmt = conn.getConnection().createStatement();
            	  String sql = null;

              // Include all object data to the database table

              sql = "insert into jpapa_bank(name,address) values ('"+txtName.getText()+ "','" +txtAddress.getText()+"')";
              stmt.executeUpdate(sql);
              System.out.println("Bank Record created");

              conn.getConnection().close();
              } catch (SQLException se) {
              se.printStackTrace();
              }
    }

    public void submitUpdate() {

    System.out.println("Update Submit button pressed");

    }

    public void submitDelete() {

              System.out.println("Delete Submit button pressed");

    }
    
    @SuppressWarnings("unchecked")
	@FXML
	public void adminpost() {
		
		try {
			   AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("/views/AdminPostView.fxml"));
			   Scene scene = new Scene(root);
			   ChoiceBox<String>l = (ChoiceBox<String>)scene.lookup("#loc");			   
			   l.getItems().add("Bridge Port");
			   l.getItems().add("Eden Commons");
			   l.getItems().add("Lake Medows");
			   l.getItems().add("Prairie Shores");
			   ChoiceBox<String>type = (ChoiceBox<String>)scene.lookup("#type");
			   type.getItems().add("Apartment");
			   type.getItems().add("Individual House");
			   ChoiceBox<String>bed = (ChoiceBox<String>)scene.lookup("#bed");
			   bed.getItems().add("Shared");
			   bed.getItems().add("Private");
			   ChoiceBox<String>wash = (ChoiceBox<String>)scene.lookup("#wash");
			   wash.getItems().add("Shared");
			   wash.getItems().add("Private");
			   ChoiceBox<String>bedy = (ChoiceBox<String>)scene.lookup("#bedy");
			   bedy.getItems().add("1");
			   bedy.getItems().add("2");
			   bedy.getItems().add("3");
			   ChoiceBox<String>washy = (ChoiceBox<String>)scene.lookup("#washy");
			   washy.getItems().add("1");
			   washy.getItems().add("2");
			   washy.getItems().add("3");
			   ChoiceBox<String>ac = (ChoiceBox<String>)scene.lookup("#ac");
			   ac.getItems().add("Yes");
			   ac.getItems().add("No");
			   ChoiceBox<String>heat = (ChoiceBox<String>)scene.lookup("#heat");
			   heat.getItems().add("Yes");
			   heat.getItems().add("No");
			   ChoiceBox<String>gym = (ChoiceBox<String>)scene.lookup("#gym");
			   gym.getItems().add("Yes");
			   gym.getItems().add("No");
			   ChoiceBox<String>ele = (ChoiceBox<String>)scene.lookup("#ele");
			   ele.getItems().add("Inc Rent");
			   ele.getItems().add("Exc Rent");
			   ChoiceBox<String>laun = (ChoiceBox<String>)scene.lookup("#laundry");
			   laun.getItems().add("Available");
			   laun.getItems().add("Not available");
			   ChoiceBox<String>bal = (ChoiceBox<String>)scene.lookup("#balcony");
			   bal.getItems().add("Available");
			   bal.getItems().add("Not available");
			   ChoiceBox<String>park = (ChoiceBox<String>)scene.lookup("#parking");
			   park.getItems().add("Yes");
			   park.getItems().add("No");
			   ChoiceBox<String>wifi = (ChoiceBox<String>)scene.lookup("#wifi");
			   wifi.getItems().add("Inc Rent");
			   wifi.getItems().add("Exc Rent");
			   ChoiceBox<String>water = (ChoiceBox<String>)scene.lookup("#water");
			   water.getItems().add("Yes");
			   water.getItems().add("No");
			   ChoiceBox<String>gas = (ChoiceBox<String>)scene.lookup("#gas");
			   gas.getItems().add("Free");
			   gas.getItems().add("Charged");
//			   TextField rent = (TextField)scene.lookup("#rent");
//			   rent.getText();
//			   TextField deposit = (TextField)scene.lookup("#deposit");
//			   deposit.getText();
//			   DatePicker d=(DatePicker)scene.lookup("#date");
//			   d.getValue().toString();
			   Main.stage.setScene(scene);
			   Main.stage.setTitle("Amin");
			   
			  } catch (Exception e) {
			  System.out.println("Error occured while inflating POST view: " +e.getMessage());
			  }
	}
public void admincancelPost() {
		
		try {
			   AnchorPane root = (AnchorPane) 
			   FXMLLoader.load(getClass().getResource("/views/AdminView.fxml"));
			   Scene scene = new Scene(root);	  
			   Main.stage.setScene(scene);
			   Main.stage.setTitle("Admin");
			  } catch (Exception e) {
			  System.out.println("Error occured while inflating LOGOUT view: " +e.getMessage());
			  }
	}
public void logout() {
	 // System.exit(0);
	 try {
	   AnchorPane root = (AnchorPane) 
	   FXMLLoader.load(getClass().getResource("/views/LoginView.fxml"));
	   Scene scene = new Scene(root);	  
	   Main.stage.setScene(scene);
	   Main.stage.setTitle("Login");
	  } catch (Exception e) {
	  System.out.println("Error occured while inflating LOGOUT view: " +e.getMessage());
	  }
	 }
}

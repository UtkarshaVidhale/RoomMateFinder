package controllers;
import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import models.UserModel;

public class UserController{
	AnchorPane root;
	 
//	public void populateChoice()
//	{
//		
//		 
//	}
		
	public UserController()
	{
		
		um = new UserModel();
//		populateChoice();
	}
	static int userid;
	UserModel um;
	public static int getUserid() {
		return userid;
	}

	public static void setUserid(int userid) {
		UserController.userid = userid;
	}
	@FXML
	public void logout() {
		 // System.exit(0);
		 try {
		   AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("/views/LoginView.fxml"));
		   Scene scene = new Scene(root);	  
		   Main.stage.setScene(scene);
		   Main.stage.setTitle("Login");
		  } catch (Exception e) {
		  System.out.println("Error occured while inflating LOGOUT view: " +e.getMessage());
		  }
		 }
	@SuppressWarnings("unchecked")
	@FXML
	public void post() {
		
		try {
			   AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("/views/PostView.fxml"));
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
			   Main.stage.setTitle("User");
			   
			  } catch (Exception e) {
			  System.out.println("Error occured while inflating POST view: " +e.getMessage());
			  }
	}


	
	public void createPost() {	
		
		
		System.out.println(userid);
		
	}
	
	public void cancelPost() {
		 // System.exit(0);
		 try {
		   AnchorPane root = (AnchorPane) 
		   FXMLLoader.load(getClass().getResource("/views/UserView.fxml"));
		   Scene scene = new Scene(root);	  
		   Main.stage.setScene(scene);
		   Main.stage.setTitle("User");
		  } catch (Exception e) {
		  System.out.println("Error occured while inflating LOGOUT view: " +e.getMessage());
		  }
		 }
	@SuppressWarnings("unchecked")
public void search() {
		
		try {
			   AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("/views/SearchView.fxml"));
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
			   Main.stage.setTitle("User");
			   
			  } catch (Exception e) {
			  System.out.println("Error occured while inflating POST view: " +e.getMessage());
			  }
	}
	
	public void myaccount() {
		 // System.exit(0);
		 try {
		   AnchorPane root = (AnchorPane) 
		   FXMLLoader.load(getClass().getResource("/views/MyAccount.fxml"));
		   Scene scene = new Scene(root);	  
		   Main.stage.setScene(scene);
		   Main.stage.setTitle("Login");
		  } catch (Exception e) {
		  System.out.println("Error occured while inflating LOGOUT view: " +e.getMessage());
		  }
		 }

//	@SuppressWarnings("unchecked")
//	public void getlocation() {
//		try {
//			root = (AnchorPane) FXMLLoader.load(getClass().getResource("/views/PostView.fxml"));
//			Scene scene = new Scene(root);	
//			 ChoiceBox<String> loc;
//			 loc = (ChoiceBox<String>) scene.lookup("#loc");
//			 System.out.print(loc);
//			 System.out.println(loc.getValue());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}

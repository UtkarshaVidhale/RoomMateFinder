package controllers;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import application.Main;
import dao.DBConnect;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController extends DBConnect{
	
	@FXML 
	private TextField txtFirstname;
	
	@FXML 
	private TextField txtLastname;
	
	@FXML 
	private TextField txtEmailID;
	
	@FXML
	private PasswordField txtPassword;
	
	@FXML 
	private TextField txtAge;
	
	@FXML 
	private TextField txtGender;
	
	@FXML 
	private TextField txtDept;
	
	@FXML 
	private TextField txtDegree;
	
	@FXML 
	private TextField txtMajor;
	
	@SuppressWarnings("unused")
	public void register() throws SQLException {

	String fname=this.txtFirstname.getText();
	String lname=this.txtLastname.getText();
	String email=this.txtEmailID.getText();
	String pass=this.txtPassword.getText();
	String age=this.txtAge.getText();
	String gender=this.txtGender.getText();
	String dep=this.txtDept.getText();
	String deg=this.txtDegree.getText();
	String maj=this.txtMajor.getText();
	AddUser(fname,lname,email,pass,age,gender,dep,deg,maj);
	}
	
	@SuppressWarnings("unused")
	private boolean AddUser(String fname, String lname, String email, String pass, String age, String gender, String dep,String deg, String maj) {
	// TODO Auto-generated method stub
	String query = "INSERT INTO r_users_reg (admin,fname,lname,email,passwd,age,gender,dept,degree,major)" +"VALUES(?,?,?,?,?,?,?,?,?,?)";
	        try(PreparedStatement stmt = connection.prepareStatement(query)) {
	           stmt.setInt(1, 0);
	           stmt.setString(2, fname);
	           stmt.setString(3, lname);          
	           stmt.setString(4, email);
	           stmt.setString(5, pass);
	           stmt.setString(6, age);
	           stmt.setString(7, gender);
	           stmt.setString(8, dep);          
	           stmt.setString(9, deg);
	           stmt.setString(10, maj);
	           boolean rs = stmt.execute();
	           Alert alert = new Alert(AlertType.INFORMATION);
	           alert.setTitle("Welcome!!!");
	           alert.setHeaderText("Congrats, You are registered");
	           alert.setContentText("!!!");
	           alert.showAndWait();
	           return true;            
	         }catch (SQLException e) {
	        e.printStackTrace();  
	         }
	       return false;
	}
	
	public void cancelRegister() {
		
		try {
			   AnchorPane root = (AnchorPane) 
			   FXMLLoader.load(getClass().getResource("/views/LoginView.fxml"));
			   Scene scene = new Scene(root);	  
			   Main.stage.setScene(scene);
			   Main.stage.setTitle("Login View");
			  } catch (Exception e) {
			  System.out.println("Error occured while inflating register view: " +e.getMessage());
			  }
	}

}

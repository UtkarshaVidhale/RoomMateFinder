package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dao.DBConnect;

public class LoginModel extends DBConnect{

	private Boolean admin;
	 
	public Boolean isAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	public int uid;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Boolean getCredentials(String username, String password){
           
           String query = "SELECT * FROM r_users_reg WHERE uname = ? and passwd = ?;";
            try(PreparedStatement stmt = connection.prepareStatement(query)) {
               stmt.setString(1, username);
               stmt.setString(2, password);
               ResultSet rs = stmt.executeQuery();
                if(rs.next()) { 
                	setAdmin(rs.getBoolean("admin"));
                	setUid(rs.getInt("uid"));
                	return true;
               	}
             }catch (SQLException e) {
            	e.printStackTrace();   
             }
	       return false;
    }
}

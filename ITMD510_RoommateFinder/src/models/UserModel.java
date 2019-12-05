package models;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import dao.DBConnect;
import javafx.fxml.FXML;

public class UserModel extends DBConnect{
	@FXML
	private String loc,type,bedy,washy,ac,heating,gym,ele,laundry,balcony,parking,wifi,gas,water;
	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBedy() {
		return bedy;
	}

	public void setBedy(String bedy) {
		this.bedy = bedy;
	}

	public String getWashy() {
		return washy;
	}

	public void setWashy(String washy) {
		this.washy = washy;
	}

	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getHeating() {
		return heating;
	}

	public void setHeating(String heating) {
		this.heating = heating;
	}

	public String getGym() {
		return gym;
	}

	public void setGym(String gym) {
		this.gym = gym;
	}

	public String getEle() {
		return ele;
	}

	public void setEle(String ele) {
		this.ele = ele;
	}

	public String getLaundry() {
		return laundry;
	}

	public void setLaundry(String laundry) {
		this.laundry = laundry;
	}

	public String getBalcony() {
		return balcony;
	}

	public void setBalcony(String balcony) {
		this.balcony = balcony;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getWifi() {
		return wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public String getGas() {
		return gas;
	}

	public void setGas(String gas) {
		this.gas = gas;
	}

	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}

	public int getBed() {
		return bed;
	}

	public void setBed(int bed) {
		this.bed = bed;
	}

	public int getWash() {
		return wash;
	}

	public void setWash(int wash) {
		this.wash = wash;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public Date getMoveindate() {
		return moveindate;
	}

	public void setMoveindate(Date moveindate) {
		this.moveindate = moveindate;
	}
	@FXML
	private int bed,wash;
	@FXML
	private double rent,deposit;
	@FXML
	private Date moveindate;
	DBConnect conn = null;
	Statement stmt = null;
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserModel() { conn = new DBConnect(); }
	
	
	protected void insertPost(int uid,String loc,String type,String bed,String bedy,String wash,String washy,String ac,String heating,String gym,String ele,
			String laundry,String balcony,String parking,String wifi,String water,String gas,String rent,String deposit,Date moveindate) {
		
		try {
			setId(uid);
			setLoc(loc);
			setType(type);
			
			// Execute a query
			System.out.println("Inserting record into the table...");
			stmt = conn.getConnection().createStatement();
			String sql = null;

			// Include data to the database table

			sql = " insert into r_post(uid, location, type, beds, bedyes, wash, washyes, AC, HEATING, GYM, ELECITY, LAUNDRY, BALCONY, PARKING, WIFI, WATER, GAS, PET, RET, DEPOSIT,date) "
					+ "values( '" + id + "','" + loc + "' ,'" + type + "','" + bed + "','" + bedy + "','" + wash + "','" + washy + "','" + ac + "','" 
					+ heating + "','" + gym + "', '" + ele + "','" + laundry + "','" + balcony + "', '" + parking + "','" + wifi + "','" + water 
					+ "','" + gas + "','" + rent + "','" + deposit + "','" + moveindate + "')";
//			PreparedStatement read

			stmt.executeUpdate(sql);
			conn.getConnection().close();

		} catch (SQLException se) {
			se.printStackTrace();
		}

		
	}
}
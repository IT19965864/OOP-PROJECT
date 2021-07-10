package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBConnection.DataBaseConnect;
import Entity.AdminInformation;

public class adminDButill {
	private static Connection c2=null;
	private static Statement s2=null;
	private static ResultSet r2=null;
	
	
	public static List<AdminInformation> verify(String username,String password){
		ArrayList<AdminInformation> by=new ArrayList<>();
		
		//validate user
		try {
		
	
		 
		 c2=DataBaseConnect.getDBConnect();
		 s2=c2.createStatement();
		 String sqla="select * from admin where NIC='"+username+"'and Password='"+password+"'";
		 r2=s2.executeQuery(sqla);
		
			
		 if(r2.next()) {
			 int uid=r2.getInt(1);
			 String ufirstname = r2.getString(2);
			 String ulastname = r2.getString(3);
			 String unic = r2.getString(4);
			 
			AdminInformation a1=new AdminInformation(uid,ufirstname,ulastname,unic);
			by.add(a1);
		
		 
		}
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		return by;
	}
}

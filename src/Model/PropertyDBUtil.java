package Model;

import java.sql.Connection;



import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import DBConnection.DataBaseConnect;

import Entity.Property;
import Entity.SoldReservedProperty;

public class PropertyDBUtil {
	
	
	private static boolean isSuccess;
	public static List<Property> Display(){
		
		ArrayList<Property> pr = new ArrayList<>();
		
		try {
			
			Connection cons=DataBaseConnect.getDBConnect();
			Statement sts=cons.createStatement();
			String sqls="select * from property ";
			ResultSet res=sts.executeQuery(sqls);
			
			
			while(res.next()) {
				int propertyID = res.getInt(1);
				String ownerID = res.getString(2);
				String location = res.getNString(3);
				int area = res.getInt(4);
				int value  = res.getInt(5);
				String category = res.getNString(6);
				String type = res.getNString(7);
				
				Property p = new Property(propertyID,ownerID,location,area,value,category,type);
				pr.add(p);
				
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return pr;
	}
	
	public static List<Property> DisplayDetails(String propertyid){
		
		ArrayList<Property> pr = new ArrayList<>();
		
		try {
			
			Connection cons=DataBaseConnect.getDBConnect();
			Statement sts=cons.createStatement();
			String sqls="select * from property where PropertyID = '"+propertyid+"' ";
			ResultSet res=sts.executeQuery(sqls);
			
			
			if(res.next()) {
				int propertyID = res.getInt(1);
				String ownerID = res.getString(2);
				String location = res.getNString(3);
				int area = res.getInt(4);
				int value  = res.getInt(5);
				String category = res.getNString(6);
				String type = res.getNString(7);
				
				Property p = new Property(propertyID,ownerID,location,area,value,category,type);
				pr.add(p);
				
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return pr;
	}
	public static boolean UpdateReservedProperty(String propertyid,String buyernic) {
		
		String Type = "Reserved";
		String sold = "Sold";
		
		try {
			Connection cons=DataBaseConnect.getDBConnect();
			Statement sts=cons.createStatement();
			String sql = "select Type from property where PropertyID = '"+propertyid+"'";
			//String sqlss ="select NIC from buyer where NIC = '"+buyernic+"'";
			ResultSet res = sts.executeQuery(sql);
			//ResultSet ress = sts.executeQuery(sqlss);
			
			
				
				if(res.next()) {
					
					String type = res.getString(1);
					if((type.equals(sold)) ||(type.equals(Type))) {
						isSuccess = false;
					}
					else
					{
						Connection con=DataBaseConnect.getDBConnect();
						Statement stmt=con.createStatement();
						String sqls ="update property set Type ='"+Type+"' where PropertyID = '"+propertyid+"'";
						int rs = stmt.executeUpdate(sqls);
					
						if(rs> 0) {
							isSuccess = true;
						}
					}
				}
				else 
				{
					isSuccess = false;	
				}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return isSuccess;
	}
	public static boolean UpdatePurchasedProperty(String propertyid,String buyernic) {
		
		String Type = "Sold";
		String reserved = "Reserved";
		
		try {
			Connection cons=DataBaseConnect.getDBConnect();
			Statement sts=cons.createStatement();
			String sql = "select Type from property where PropertyID = '"+propertyid+"'";
			//String sqlss ="select NIC from buyer where NIC = '"+buyernic+"'";
			ResultSet res = sts.executeQuery(sql);
			//ResultSet ress = sts.executeQuery(sqlss);
			
			if(res.next()) {
				String type = res.getString(1);
				if((type.equals(reserved)) ||(type.equals(Type))) {
					isSuccess = false;
				}
				else 
				{
					Connection con=DataBaseConnect.getDBConnect();
					Statement stmt=con.createStatement();
					String sqls ="update property set Type = '"+Type+"' where PropertyID = '"+propertyid+"'";
					int rs = stmt.executeUpdate(sqls);
				
					if(rs> 0) {
						isSuccess = true;
					}
				}
			}
			else
			{
				isSuccess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return isSuccess;
	}
	public static boolean InsertReservedProperty(int propertyid, String buyernic) {
		
		
		String Type = "Reserved";
		
		

		 try {
				Connection con=DataBaseConnect.getDBConnect();
				Statement stmt=con.createStatement();
				String sqls ="insert into sold_reserved_property values ('"+propertyid+"','"+buyernic+"','"+Type+"')";
				int rs = stmt.executeUpdate(sqls);
					
				if(rs> 0) {
					isSuccess = true;
				}
				else
				{
					isSuccess = false;
				}
		 }
		catch(Exception e){
			e.printStackTrace();
		}
		return isSuccess;
	}
	public static boolean InsertPurchasedProperty(int propertyid,String buyernic) {
		
		
		String Type = "Sold";
		

		try {
			
				Connection con=DataBaseConnect.getDBConnect();
				Statement stmt=con.createStatement();
				String sqls ="insert into sold_reserved_property values ('"+propertyid+"','"+buyernic+"','"+Type+"')";
				int rs = stmt.executeUpdate(sqls);
					
				if(rs> 0) {
					isSuccess = true;
				}
				else
				{
					isSuccess = false;
				}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return isSuccess;
	}
	public static List<Property> DisplayDeleteProperty(String propertyid){
		
		ArrayList<Property> pr = new ArrayList<>();
		
		try {
			
			Connection cons=DataBaseConnect.getDBConnect();
			Statement sts=cons.createStatement();
			String sqls="select * from property where PropertyID = '"+propertyid+"'";
			ResultSet res=sts.executeQuery(sqls);
		
			
			if(res.next()) {
				int propertyID = res.getInt(1);
				String ownerID = res.getString(2);
				String location = res.getNString(3);
				int area = res.getInt(4);
				int value  = res.getInt(5);
				String category = res.getNString(6);
				String type = res.getNString(7);
				
				Property p = new Property(propertyID,ownerID,location,area,value,category,type);
				pr.add(p);
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				
		return pr;
	}
	public static boolean DeleteProperty(String propertyid) {
		
		int id = Integer.parseInt(propertyid);
		 try {
			 	Connection con=DataBaseConnect.getDBConnect();
				Statement stmt=con.createStatement();
				String sql = "delete from property where PropertyID = '"+id+"'";
				int r = stmt.executeUpdate(sql);
				
				if(r > 0) {
					isSuccess = true;
				}
				else
				{
					isSuccess = false;
				}
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		return isSuccess;
	}
	public static List<SoldReservedProperty> DisplaySoldReservedProperty(){
		
		ArrayList<SoldReservedProperty> sr = new ArrayList<>();
		
		try {
				Connection cons=DataBaseConnect.getDBConnect();
				Statement sts=cons.createStatement();
				String sqls="select * from sold_reserved_property ";
				ResultSet res=sts.executeQuery(sqls);
				
				while(res.next()) {
					int propertyID = res.getInt(1);
					String buyerNIC= res.getString(2);
					String Type= res.getNString(3);
					
					SoldReservedProperty p = new SoldReservedProperty(propertyID,buyerNIC,Type);
					sr.add(p);
					
					
				}
		}
		catch(Exception e) {
				e.printStackTrace();
		}
		
		return sr;
		
	}




}


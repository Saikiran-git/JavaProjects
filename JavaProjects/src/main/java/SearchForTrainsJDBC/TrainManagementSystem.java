package SearchForTrainsJDBC;


import java.util.ArrayList;
import java.sql.*;

public class TrainManagementSystem {
	
	public ArrayList <Train> viewTrain (String coachType, String source, String destination){
		
		// Fill your code here	
		ArrayList<Train> al = new ArrayList<>();
		try{
		    Connection con = DB.getConnection();
		    PreparedStatement ps = con.prepareStatement("select * from train where (source=? && destination=? && "+coachType+">0) order by 'train_number';");
		    ps.setString(1, source);
		    ps.setString(2, destination);
		    
		    ResultSet rs  = ps.executeQuery();
		    while(rs.next()){
		        Train train = new Train(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9));
		        al.add(train);
		    }
		    
		    return al;
		}
		catch(Exception e){
		    System.out.println();
		}
		return al;
		//return null;
		
	}

}

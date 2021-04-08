package PlayerSelectionSystemJDBC;

import java.util.List;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;

public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		
		ArrayList<String> al = new ArrayList<String>();
		String sqlquery = "select playerName from player where height>="+minHeight+" and weight<="+maxWeight+" order by playerName";
		try{
		    Connection con = DB.getConnection();
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(sqlquery);
		    while(rs.next()){
		        al.add(rs.getString("playerName"));
		    }
		    return al;
		}
		catch(Exception e){
		    System.out.println();
		}
		
		return null;
	}
}

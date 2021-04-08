package AddFlightUsingJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FlightManagementSystem{
    public  boolean addFlight(Flight flightObj){
        
        try{
            Connection con = DB.getConnection();
            String sqlquery = "insert into Flight(flightId, source, destination, noofseats, flightfare) values (?, ?, ?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(sqlquery);
            ps.setInt(1, flightObj.getFlightId());
            ps.setString(2, flightObj.getSource());
            ps.setString(3, flightObj.getDestination());
            ps.setInt(4, flightObj.getNoOfSeats());
            ps.setDouble(5, flightObj.getFlightFare());
            ps.execute();
            return true;
        }
        
        catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
}
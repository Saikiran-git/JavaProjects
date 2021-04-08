package ContactDetailsOfHosteller;

public class Hosteller extends Student{
    
    private String hostelName;
    private int roomNumber;
    
    public Hosteller(){}
    
    public void setHostelName(String hname){
        hostelName = hname;
    }
    
    public void setRoomNumber(int rno){
        roomNumber = rno;
    }
    
    public String getHostelName(){
        return hostelName;
    }
    
    public int getRoomNumber(){
        return roomNumber;
    }
    
}
package ContactDetailsOfHosteller;

public class Student{
    
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;
    
    public void setStudentId(int sid){
        studentId = 1;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setDepartmentId(int did){
        departmentId = did;
    }
    
    public void setGender(String g){
        gender = g;
    }
    
    public void setPhone(String pno){
        phone = pno;
    }
    
    public int getStudentId(){
        return studentId;
    }
    
    public int getDepartmentId(){
        return departmentId;
    }
    
    public String getName(){
        return name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getPhone(){
        return phone;
    }
    
}
package VehicleLoanInsuranceUseInterface;
public class Main
{
    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle("TS1888", "Hornett", "2 wheeler", 150000.00);
        System.out.println(vehicle.issueLoan());
        System.out.println(vehicle.takeInsurance());
    }
}

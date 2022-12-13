
/**
 * Write a description of class FuelCar here.
 *
 * @author (21039823 Tuk Bahadur Kumhal)
 * @version (1.0.0)
 */
public class FuelCar extends Car
{
    //attributes of FuelCar Class
    private String distributorName;
    private String fuelType;
    private int numberOfSeats;
    private String bookedDate;
    private String purchaseDate;
    private int mileage;
    private String transmissionType;
    private boolean isPurchased;
    //creating constructor with seven parameters
    public FuelCar(int carId, String carName, String carBrand, String carPrice,String fuelType, int numberOfSeats, int mileage){
        //calling parent constructor with four parameters
        super(carId, carName, carBrand, carPrice);
        //initializing parameter with values;
        this.distributorName = distributorName;
        this.fuelType = fuelType;
        this.numberOfSeats = numberOfSeats;
        this.mileage = mileage;
        this.bookedDate = bookedDate;
        this.purchaseDate = purchaseDate;
        this.transmissionType = "";
        this.isPurchased = false;
    }
    //8 respective accessor or getter method
    public String getDistributorName(){
        return this.distributorName;
    }

    public String getFuelType(){
        return this.fuelType;
    }

    public int getNumberOfSeats(){
        return this.numberOfSeats;
    }

    public String getBookedDate(){
        return this.bookedDate;
    }

    public String getPurchaseDate(){
        return this.purchaseDate;
    }

    public int getMileage(){
        return this.mileage;
    }

    public String getTransmissionType(){
        return this.transmissionType;
    }

    public boolean getIsPurchased(){
        return this.isPurchased;
    }
    //setter method (distributorName)
    public void setDistributorName(String distributorName){
        this.distributorName = distributorName;
    }
    //setter method(transmissionType)
    public void setTransmissionType(String transmissionType){
        this.transmissionType = transmissionType;
    }
    //purchase method with two parameters
    public void purchase(String purchaseDate, String bookedDate){
        this.purchaseDate = purchaseDate;
        this.bookedDate = bookedDate;
        if(isPurchased == true){
            //calling setCarColor method of parent to set carColor value
            super.setCarColor("Red");
            //calling parent display method
            super.display();
            System.out.println("Distributor Name of the car " + distributorName);
        }
        else{
            setDistributorName("HAWK motor Company");
            setTransmissionType("Automatic");
            isPurchased = true;

        }
    }
    //display method to display output
    public void display(){
        //calling parent display method
        System.out.println("--------------->ArrayList FuelCar<-----------------");
        super.display();
        if(isPurchased == true){
            System.out.println("--------------->Start_Fuel_Car<-----------------");
            System.out.println("Distributor name of the Car :" + distributorName);
            System.out.println("Fuel Type in Car :" + fuelType);
            System.out.println("Purchase Date of Car :" + purchaseDate);
            System.out.println("Booked Date of Car :" + bookedDate);
            System.out.println("Car Mileage :" + mileage);
            System.out.println("Number of Seats in Car :" + numberOfSeats);
            System.out.println("Transmission Type of the Car :" + transmissionType);
            System.out.println("--------------->End_Fuel_Car<-----------------");
        }
    }
}

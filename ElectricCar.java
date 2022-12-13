
/**
 * Write a description of class ElectricCar here.
 *
 * @author (21039823 Tuk Bahadur Kumhal)
 * @version (1.0.0)
 */
public class ElectricCar extends Car
{
    //attributes of ElectricCar Class
    private String customerName;
    private int batteryCapacity;
    private int batteryWarranty;
    private String purchaseDate;
    private String range;
    private int rechargeTime;
    private boolean isBought;
    private boolean isSold;
    //Creating Constructor with five parameters
    public ElectricCar(int carId, String carName, String carBrand, String carPrice, int batteryCapacity){
        //calling parent constructor with four parameters
        super(carId, carName, carBrand, carPrice);
        //initializing parameter with values
        this.batteryCapacity = batteryCapacity;
        this.customerName = customerName;
        this.batteryWarranty = batteryWarranty;
        this.purchaseDate = purchaseDate;
        this.range = range;
        this.rechargeTime = 0;
        this.isBought = false;
        this.isSold = false;
    }
    //8 respective accessor or getter method
    public String getCustomerName(){
        return this.customerName;
    }

    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }

    public int getBatteryWarranty(){
        return this.batteryWarranty;
    }

    public String getPurchaseDate(){
        return this.purchaseDate;
    }

    public String getRange(){
        return this.range;
    }

    public int getRechargeTime(){
        return this.rechargeTime;
    }

    public boolean getIsBought(){
        return this.isBought;
    }

    public boolean getIsSold(){
        return this.isSold;
    }
    //setter method (customerName)
    public void setCustomerName(String customerName){
        if(isBought == false){
            this.customerName = customerName;
        }
        else{
            System.out.println("Car is bought so, there is no possibility to change the customer Name");
        }
    }
    //method (buy) with five parameters
    public void buy(String customerName,int batteryWarranty, String purchaseDate, String range, int rechargeTime){
        this.customerName = customerName;
        this.batteryWarranty = batteryWarranty;
        this.purchaseDate = purchaseDate;
        this.range = range;
        if(isBought == false){
            //setting value of customerName
            setCustomerName(customerName);
            this.isBought = true;
        }
        else{
            System.out.println("The electric car is already bought");
        }
    }
    //method (sell) with customerName parameter
    public void sell(String customerName){
        //setting customerName value
        this.customerName = customerName;
        if(isSold == false){
            this.batteryCapacity = batteryCapacity; 
            this.batteryWarranty = batteryWarranty;
            this.purchaseDate = purchaseDate;
            this.range = range;
            this.rechargeTime = 0 ;
            this.isSold = true;
            this.isBought = false;
        }
        else{
            System.out.println("The car is already Sold");
        }
    }
    //display method to display output to the user
    public void display(){
        //calling parent car class to display carId,carName,carBrand,carColor,carPrice
        System.out.println("--------------->ArrayList ElectricCar<-----------------");
        super.display();
        if(isBought == true){
            System.out.println("--------------->Start_Electric_Car<-----------------");
            System.out.println("The name of Customer who bought the car is " + customerName);
            System.out.println("Battery Capacity of the car is " + batteryCapacity);
            System.out.println("warranty of the battery is " + batteryWarranty);
            System.out.println("Purchase date of car is " + purchaseDate);
            System.out.println("distance travel is " + range);
            System.out.println("recharge time of battery is " + rechargeTime);
            System.out.println("--------------->End_Electric_Car<-----------------");
        }
    }
}

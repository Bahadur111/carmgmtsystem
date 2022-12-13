
/**
 * Write a description of class Car here.
 *
 * @author (21039823 Tuk Bahadur Kumhal)
 * @version (1.0.0)
 */
public class Car
{
    //attributes of the Car class
    private int carId;
    private String carName;
    private String carBrand;
    private String carColor;
    private String carPrice;
    //creating constructor(same name as Class name) with five attributes
    public Car(int carId, String carName, String carBrand, String carPrice){
        //initializing parameter with values;
        this.carId = carId;
        this.carName = carName;
        this.carBrand = carBrand;
        this.carPrice = carPrice;
        this.carColor = "";
    }
    //5 respective accessor or getters method
    public int getCarId(){
        return this.carId;
    }

    public String getCarName(){
        return this.carName;
    }

    public String getCarBrand(){
        return this.carBrand;
    }

    public String getCarColor(){
        return this.carColor;
    }

    public String getCarPrice(){
        return this.carPrice;
    }
    //1 setter method (carColor)
    public void setCarColor(String carColor){
        this.carColor = carColor;
    }
    //display method to display output to the user
    public void display(){
        System.out.println("Car id: " + carId);
        System.out.println("Car Name: " + carName);
        System.out.println("Car brand: " + carBrand);
        System.out.println("Car color: " + carColor);
        System.out.println("Car price: " + carPrice);
    }

}

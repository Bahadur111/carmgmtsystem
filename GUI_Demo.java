
/**
 *GUI_Demo Class is the code for the GUI of Car System where different objects and action is peformed
 *
 * @author (21039823 Tuk Bahadur Kumhal)
 * @version (1.0.0)
 */
//importing packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class GUI_Demo {
    // ----->instance variables of Frame<-----
    private JFrame frame;
    private JMenuBar menubar;
    private JMenu carCatagory;
    private JMenuItem mFuelCar, mElectricCar;
    private CardLayout c1;
    private JPanel panelContainer, fuelCarPanel, electricCarPanel;
    private JLabel tFuelCar, tElectricCar;// title
    private JLabel fFuelCar, fElectricCar;// footer
    // --------->FuelCar<---------
    private JLabel fCarID, fCarName, fCarBrand, fCarPrice, fFuelType, fNoOfSeats, fMileage;
    private JLabel fCarID1, fCarName1, fCarBrand1, fCarColor, fTransmissionType, fDistributorName, fPurchaseDate,
    fBookedDate;

    private JTextField fCarIDTxt, fCarNameTxt, fCarBrandTxt, fCarPriceTxt, fFuelTypeTxt, fNoOfSeatsTxt, fMileageTxt;
    private JTextField fCarID1Txt, fCarName1Txt, fCarBrand1Txt, fCarColorTxt, fTransmissionTypeTxt, fDistributorNameTxt;

    private JComboBox fCarPurYear, fCarPurMonth, fCarPurDay;//combobox
    private JComboBox fCarBookYear, fCarBookMonth, fCarBookDay;//combobox

    private JButton fCarAdd, fCarPurchase, fCarDisplay, fCarClear; //buttons
    // --------->ElectricCar<------
    private JLabel eCarID, eCarName, eCarBrand, eCarPrice, eBatteryCapacity;
    private JLabel eCarID1, eCarName1, eCarBrand1, eCarPrice1, eCarColor, eCustomerName, eBatteryWarranty, eRange,
    eRechargeTime, ePurchaseDate;
    private JLabel eCarID2, eCustomerName1;

    private JTextField eCarIDTxt, eCarNameTxt, eCarBrandTxt, eCarPriceTxt, eBatteryCapacityTxt;
    private JTextField eCarID1Txt, eCarName1Txt, eCarBrand1Txt, eCarPrice1Txt, eCarColorTxt, eCustomerNameTxt,
    eBatteryWarrantyTxt, eRangeTxt, eRechargeTimeTxt;
    private JTextField eCarID2Txt, eCustomerName1Txt;

    private JComboBox eCarPurYear, eCarPurMonth, eCarPurDay; //combobox

    private JButton eCarAdd, eCarBuy, eCarSell, eCarDisplay, eCarClear; //buttons

    // ArrayList instance
    private ArrayList<Car> cars;

    // -----> Constructor for GUI_Demo Class<-----
    public GUI_Demo() {
        // ----->calling GUI method<-----
        gui();
    }

    public void gui() {
        // creating Objects

        // frame
        frame = new JFrame("GUI Project of Java");

        // MenuBar
        menubar = new JMenuBar();
        menubar.setBackground(new Color(66, 69, 90));//background color

        // Menu
        carCatagory = new JMenu("Car_Category");
        carCatagory.setFont(new Font("Arial", 1, 30));//Font-size
        carCatagory.setForeground(new Color(192, 192, 192));//Font-color

        // MenuItems
        mFuelCar = new JMenuItem("FuelCar");
        mFuelCar.setFont(new Font("Arial", 1, 20));
        mFuelCar.setBackground(new Color(66, 69, 90));
        mFuelCar.setForeground(Color.WHITE);

        mElectricCar = new JMenuItem("ElectricCar");
        mElectricCar.setFont(new Font("Arial", 1, 20));
        mElectricCar.setBackground(new Color(66, 69, 90));
        mElectricCar.setForeground(Color.WHITE);

        // CardLayout
        c1 = new CardLayout();

        // Panels
        panelContainer = new JPanel();
        panelContainer.setLayout(c1);
        c1.show(panelContainer, "1");

        // Panel for fuelCar
        fuelCarPanel = new JPanel();
        fuelCarPanel.setLayout(null);
        fuelCarPanel.setBackground(new Color(255, 213, 128));

        // Panel for electricCar
        electricCarPanel = new JPanel();
        electricCarPanel.setLayout(null);
        electricCarPanel.setBackground(new Color(255, 213, 128));

        // Title for FuelCar
        tFuelCar = new JLabel("FuelCar");
        tFuelCar.setBounds(575, 0, 100, 50);//setting positions(x-axis,y-axis,width,heigth)
        tFuelCar.setFont(new Font("Arial", 1, 24));

        // Footer for FuelCar
        fFuelCar = new JLabel("©Cr3ator Mr.Tuk");
        fFuelCar.setBounds(575, 650, 300, 50);
        fFuelCar.setFont(new Font("Arial", 1, 26));

        // Title for ElectricCar
        tElectricCar = new JLabel("ElectricCar");
        tElectricCar.setBounds(575, 0, 200, 50);
        tElectricCar.setFont(new Font("Arial", 1, 24));

        // Footer for ElectricCar
        fElectricCar = new JLabel("©Cr3ator Mr.Tuk");
        fElectricCar.setBounds(575, 700, 300, 50);
        fElectricCar.setFont(new Font("Arial", 1, 26));

        // FuelCar Labels
        // 1st row
        fCarID = new JLabel("CarID");
        fCarID.setBounds(275, 70, 200, 50);
        fCarID.setFont(new Font("Arial", 0, 20));

        fCarName = new JLabel("CarName");
        fCarName.setBounds(700, 70, 200, 50);
        fCarName.setFont(new Font("Arial", 0, 20));

        fCarBrand = new JLabel("CarBrand");
        fCarBrand.setBounds(275, 120, 200, 50);
        fCarBrand.setFont(new Font("Arial", 0, 20));

        fCarPrice = new JLabel("CarPrice");
        fCarPrice.setBounds(700, 120, 200, 50);
        fCarPrice.setFont(new Font("Arial", 0, 20));

        fFuelType = new JLabel("FuelType");
        fFuelType.setBounds(275, 170, 200, 50);
        fFuelType.setFont(new Font("Arial", 0, 20));

        fNoOfSeats = new JLabel("No. of Seats");
        fNoOfSeats.setBounds(700, 170, 200, 50);
        fNoOfSeats.setFont(new Font("Arial", 0, 20));

        fMileage = new JLabel("Mileage");
        fMileage.setBounds(275, 220, 200, 50);
        fMileage.setFont(new Font("Arial", 0, 20));

        // 2nd row
        fCarID1 = new JLabel("CarID");
        fCarID1.setBounds(275, 320, 200, 50);
        fCarID1.setFont(new Font("Arial", 0, 20));

        fCarName1 = new JLabel("CarName");
        fCarName1.setBounds(700, 320, 200, 50);
        fCarName1.setFont(new Font("Arial", 0, 20));

        fCarBrand1 = new JLabel("CarBrand");
        fCarBrand1.setBounds(275, 370, 200, 50);
        fCarBrand1.setFont(new Font("Arial", 0, 20));

        fCarColor = new JLabel("CarColor");
        fCarColor.setBounds(700, 370, 200, 50);
        fCarColor.setFont(new Font("Arial", 0, 20));

        fTransmissionType = new JLabel("Trans.Type");
        fTransmissionType.setBounds(275, 420, 200, 50);
        fTransmissionType.setFont(new Font("Arial", 0, 20));

        fDistributorName = new JLabel("DistributorName");
        fDistributorName.setBounds(700, 420, 200, 50);
        fDistributorName.setFont(new Font("Arial", 0, 20));

        fPurchaseDate = new JLabel("Purchase Date");
        fPurchaseDate.setBounds(275, 470, 200, 50);
        fPurchaseDate.setFont(new Font("Arial", 0, 20));

        fBookedDate = new JLabel("Booked Date");
        fBookedDate.setBounds(275, 520, 200, 50);
        fBookedDate.setFont(new Font("Arial", 0, 20));

        // FuelCar TextFields
        // 1st row
        fCarIDTxt = new JTextField();
        fCarIDTxt.setBounds(400, 80, 150, 25);
        fCarIDTxt.setFont(new Font("Arial", 0, 20));

        fCarNameTxt = new JTextField();
        fCarNameTxt.setBounds(865, 80, 150, 25);
        fCarNameTxt.setFont(new Font("Arial", 0, 20));

        fCarBrandTxt = new JTextField();
        fCarBrandTxt.setBounds(400, 135, 150, 25);
        fCarBrandTxt.setFont(new Font("Arial", 0, 20));

        fCarPriceTxt = new JTextField();
        fCarPriceTxt.setBounds(865, 135, 150, 25);
        fCarPriceTxt.setFont(new Font("Arial", 0, 20));

        fFuelTypeTxt = new JTextField();
        fFuelTypeTxt.setBounds(400, 185, 150, 25);
        fFuelTypeTxt.setFont(new Font("Arial", 0, 20));

        fNoOfSeatsTxt = new JTextField();
        fNoOfSeatsTxt.setBounds(865, 185, 150, 25);
        fNoOfSeatsTxt.setFont(new Font("Arial", 0, 20));

        fMileageTxt = new JTextField();
        fMileageTxt.setBounds(400, 235, 150, 25);
        fMileageTxt.setFont(new Font("Arial", 0, 20));

        // 2nd row
        fCarID1Txt = new JTextField();
        fCarID1Txt.setBounds(400, 330, 150, 25);
        fCarID1Txt.setFont(new Font("Arial", 0, 20));

        fCarName1Txt = new JTextField();
        fCarName1Txt.setBounds(865, 330, 150, 25);
        fCarName1Txt.setFont(new Font("Arial", 0, 20));

        fCarBrand1Txt = new JTextField();
        fCarBrand1Txt.setBounds(400, 385, 150, 25);
        fCarBrand1Txt.setFont(new Font("Arial", 0, 20));

        fCarColorTxt = new JTextField();
        fCarColorTxt.setBounds(865, 385, 150, 25);
        fCarColorTxt.setFont(new Font("Arial", 0, 20));

        fTransmissionTypeTxt = new JTextField();
        fTransmissionTypeTxt.setBounds(400, 430, 150, 25);
        fTransmissionTypeTxt.setFont(new Font("Arial", 0, 20));

        fDistributorNameTxt = new JTextField();
        fDistributorNameTxt.setBounds(865, 430, 150, 25);
        fDistributorNameTxt.setFont(new Font("Arial", 0, 20));

        // FuelCar ComboBox for purchase Date
        // Year
        String year[] = { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027" };
        fCarPurYear = new JComboBox(year);
        fCarPurYear.setBounds(430, 485, 60, 30);
        // Month
        String month[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
        fCarPurMonth = new JComboBox(month);
        fCarPurMonth.setBounds(500, 485, 40, 30);
        // day
        String day[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        fCarPurDay = new JComboBox(day);
        fCarPurDay.setBounds(550, 485, 40, 30);

        // FuelCar ComboBox for Booked Date
        String year1[] = { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027" };
        fCarBookYear = new JComboBox(year1);
        fCarBookYear.setBounds(430, 530, 60, 30);
        // Month
        String month1[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
        fCarBookMonth = new JComboBox(month1);
        fCarBookMonth.setBounds(500, 530, 40, 30);
        // day
        String day1[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        fCarBookDay = new JComboBox(day1);
        fCarBookDay.setBounds(550, 530, 40, 30);

        // FuelCar Buttons
        fCarAdd = new JButton("ADD");
        fCarAdd.setBounds(700, 230, 120, 40);
        fCarAdd.setFont(new Font("Arial", 1, 20));
        fCarAdd.setBackground(new Color(41, 96, 125));
        fCarAdd.setForeground(Color.WHITE);

        fCarPurchase = new JButton("Purchase");
        fCarPurchase.setBounds(700, 495, 125, 40);
        fCarPurchase.setFont(new Font("Arial", 1, 20));
        fCarPurchase.setBackground(new Color(159, 104, 181));
        fCarPurchase.setForeground(Color.WHITE);

        fCarDisplay = new JButton("Display");
        fCarDisplay.setBounds(850, 495, 120, 40);
        fCarDisplay.setFont(new Font("Arial", 1, 20));
        fCarDisplay.setBackground(new Color(143, 111, 141));
        fCarDisplay.setForeground(Color.WHITE);

        fCarClear = new JButton("Clear");
        fCarClear.setBounds(1100, 570, 115, 40);
        fCarClear.setFont(new Font("Arial", 1, 20));
        fCarClear.setBackground(new Color(237, 116, 161));
        fCarClear.setForeground(Color.WHITE);

        // ElectricCar Labels
        // 1st row
        eCarID = new JLabel("CarID");
        eCarID.setBounds(275, 50, 200, 50);
        eCarID.setFont(new Font("Arial", 0, 20));

        eCarName = new JLabel("CarName");
        eCarName.setBounds(700, 50, 200, 50);
        eCarName.setFont(new Font("Arial", 0, 20));

        eCarBrand = new JLabel("CarBrand");
        eCarBrand.setBounds(275, 100, 200, 50);
        eCarBrand.setFont(new Font("Arial", 0, 20));

        eCarPrice = new JLabel("CarPrice");
        eCarPrice.setBounds(700, 100, 200, 50);
        eCarPrice.setFont(new Font("Arial", 0, 20));

        eBatteryCapacity = new JLabel("BatteryCapacity");
        eBatteryCapacity.setBounds(275, 150, 200, 50);
        eBatteryCapacity.setFont(new Font("Arial", 0, 20));
        // 2nd row
        eCarID1 = new JLabel("CarID");
        eCarID1.setBounds(275, 250, 200, 50);
        eCarID1.setFont(new Font("Arial", 0, 20));

        eCarName1 = new JLabel("CarName");
        eCarName1.setBounds(700, 250, 200, 50);
        eCarName1.setFont(new Font("Arial", 0, 20));

        eCarBrand1 = new JLabel("CarBrand");
        eCarBrand1.setBounds(275, 300, 200, 50);
        eCarBrand1.setFont(new Font("Arial", 0, 20));

        eCarPrice1 = new JLabel("CarPrice");
        eCarPrice1.setBounds(700, 300, 200, 50);
        eCarPrice1.setFont(new Font("Arial", 0, 20));

        eCarColor = new JLabel("CarColor");
        eCarColor.setBounds(275, 350, 200, 50);
        eCarColor.setFont(new Font("Arial", 0, 20));

        eCustomerName = new JLabel("CustomerName");
        eCustomerName.setBounds(700, 350, 200, 50);
        eCustomerName.setFont(new Font("Arial", 0, 20));

        eBatteryWarranty = new JLabel("BatteryWarranty");
        eBatteryWarranty.setBounds(275, 400, 200, 50);
        eBatteryWarranty.setFont(new Font("Arial", 0, 20));

        eRange = new JLabel("Range");
        eRange.setBounds(700, 400, 200, 50);
        eRange.setFont(new Font("Arial", 0, 20));

        eRechargeTime = new JLabel("RechargeTime");
        eRechargeTime.setBounds(275, 450, 200, 50);
        eRechargeTime.setFont(new Font("Arial", 0, 20));

        ePurchaseDate = new JLabel("Purchase Date");
        ePurchaseDate.setBounds(700, 450, 200, 50);
        ePurchaseDate.setFont(new Font("Arial", 0, 20));
        // 3rd row
        eCarID2 = new JLabel("CarID");
        eCarID2.setBounds(275, 600, 200, 50);
        eCarID2.setFont(new Font("Arial", 0, 20));

        eCustomerName1 = new JLabel("CustomerName");
        eCustomerName1.setBounds(700, 600, 200, 50);
        eCustomerName1.setFont(new Font("Arial", 0, 20));

        // ElectricCar TextFields
        // 1st row
        eCarIDTxt = new JTextField();
        eCarIDTxt.setBounds(430, 60, 150, 25);
        eCarIDTxt.setFont(new Font("Arial", 0, 20));

        eCarNameTxt = new JTextField();
        eCarNameTxt.setBounds(865, 60, 150, 25);
        eCarNameTxt.setFont(new Font("Arial", 0, 20));

        eCarBrandTxt = new JTextField();
        eCarBrandTxt.setBounds(430, 115, 150, 25);
        eCarBrandTxt.setFont(new Font("Arial", 0, 20));

        eCarPriceTxt = new JTextField();
        eCarPriceTxt.setBounds(865, 115, 150, 25);
        eCarPriceTxt.setFont(new Font("Arial", 0, 20));

        eBatteryCapacityTxt = new JTextField();
        eBatteryCapacityTxt.setBounds(430, 165, 150, 25);
        eBatteryCapacityTxt.setFont(new Font("Arial", 0, 20));
        // 2nd row
        eCarID1Txt = new JTextField();
        eCarID1Txt.setBounds(430, 265, 150, 25);
        eCarID1Txt.setFont(new Font("Arial", 0, 20));

        eCarName1Txt = new JTextField();
        eCarName1Txt.setBounds(865, 265, 150, 25);
        eCarName1Txt.setFont(new Font("Arial", 0, 20));

        eCarBrand1Txt = new JTextField();
        eCarBrand1Txt.setBounds(430, 310, 150, 25);
        eCarBrand1Txt.setFont(new Font("Arial", 0, 20));

        eCarPrice1Txt = new JTextField();
        eCarPrice1Txt.setBounds(865, 310, 150, 25);
        eCarPrice1Txt.setFont(new Font("Arial", 0, 20));

        eCarColorTxt = new JTextField();
        eCarColorTxt.setBounds(430, 365, 150, 25);
        eCarColorTxt.setFont(new Font("Arial", 0, 20));

        eCustomerNameTxt = new JTextField();
        eCustomerNameTxt.setBounds(865, 365, 150, 25);
        eCustomerNameTxt.setFont(new Font("Arial", 0, 20));

        eBatteryWarrantyTxt = new JTextField();
        eBatteryWarrantyTxt.setBounds(430, 415, 150, 25);
        eBatteryWarrantyTxt.setFont(new Font("Arial", 0, 20));

        eRangeTxt = new JTextField();
        eRangeTxt.setBounds(865, 415, 150, 25);
        eRangeTxt.setFont(new Font("Arial", 0, 20));

        eRechargeTimeTxt = new JTextField();
        eRechargeTimeTxt.setBounds(430, 465, 150, 25);
        eRechargeTimeTxt.setFont(new Font("Arial", 0, 20));
        // 3rd row
        eCarID2Txt = new JTextField();
        eCarID2Txt.setBounds(430, 610, 150, 25);
        eCarID2Txt.setFont(new Font("Arial", 0, 20));

        eCustomerName1Txt = new JTextField();
        eCustomerName1Txt.setBounds(865, 610, 150, 25);
        eCustomerName1Txt.setFont(new Font("Arial", 0, 20));

        // ElectricCar ComboBox for purchase Date
        // Year
        String eyear[] = { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027" };
        eCarPurYear = new JComboBox(eyear);
        eCarPurYear.setBounds(865, 465, 60, 30);
        // Month
        String emonth[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
        eCarPurMonth = new JComboBox(emonth);
        eCarPurMonth.setBounds(940, 465, 40, 30);
        // day
        String eday[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        eCarPurDay = new JComboBox(eday);
        eCarPurDay.setBounds(990, 465, 40, 30);

        // ElectricCar Buttons
        eCarAdd = new JButton("ADD");
        eCarAdd.setBounds(700, 150, 100, 40);
        eCarAdd.setFont(new Font("Arial", 1, 20));
        eCarAdd.setBackground(new Color(41, 96, 125));
        eCarAdd.setForeground(Color.WHITE);

        eCarBuy = new JButton("Buy");
        eCarBuy.setBounds(700, 510, 100, 40);
        eCarBuy.setFont(new Font("Arial", 1, 20));
        eCarBuy.setBackground(new Color(159, 104, 181));
        eCarBuy.setForeground(Color.WHITE);

        eCarSell = new JButton("Sell");
        eCarSell.setBounds(700, 650, 100, 40);
        eCarSell.setFont(new Font("Arial", 1, 20));
        eCarSell.setBackground(new Color(184, 160, 154));
        eCarSell.setForeground(Color.WHITE);

        eCarDisplay = new JButton("Display");
        eCarDisplay.setBounds(850, 650, 120, 40);
        eCarDisplay.setFont(new Font("Arial", 1, 20));
        eCarDisplay.setBackground(new Color(143, 111, 141));
        eCarDisplay.setForeground(Color.WHITE);

        eCarClear = new JButton("Clear");
        eCarClear.setBounds(1100, 700, 115, 40);
        eCarClear.setFont(new Font("Arial", 1, 20));
        eCarClear.setBackground(new Color(237, 116, 161));
        eCarClear.setForeground(Color.WHITE);

        // Constructing ArrayList
        cars = new ArrayList<Car>();

        // Adding Menu,MenuBar,MenuItems in Frame
        frame.setJMenuBar(menubar);
        menubar.add(carCatagory);
        carCatagory.add(mFuelCar);
        carCatagory.add(mElectricCar);

        // Adding Layout in the Frame
        frame.add(panelContainer);
        panelContainer.add(fuelCarPanel, "1");
        panelContainer.add(electricCarPanel, "2");

        // adding title in fuelCarPanel
        fuelCarPanel.add(tFuelCar);

        // adding footer in fuelCarPanel
        fuelCarPanel.add(fFuelCar);

        // adding title in electricCarPanel
        electricCarPanel.add(tElectricCar);

        // adding footer in electricCarPanel
        electricCarPanel.add(fElectricCar);

        // adding FuelCar labels
        // 1st row
        fuelCarPanel.add(fCarID);
        fuelCarPanel.add(fCarName);
        fuelCarPanel.add(fCarBrand);
        fuelCarPanel.add(fCarPrice);
        fuelCarPanel.add(fFuelType);
        fuelCarPanel.add(fNoOfSeats);
        fuelCarPanel.add(fMileage);
        // 2nd row
        fuelCarPanel.add(fCarID1);
        fuelCarPanel.add(fCarName1);
        fuelCarPanel.add(fCarBrand1);
        fuelCarPanel.add(fCarColor);
        fuelCarPanel.add(fTransmissionType);
        fuelCarPanel.add(fDistributorName);
        fuelCarPanel.add(fPurchaseDate);
        fuelCarPanel.add(fBookedDate);

        // adding FuelCar TextFields
        // 1st row
        fuelCarPanel.add(fCarIDTxt);
        fuelCarPanel.add(fCarNameTxt);
        fuelCarPanel.add(fCarBrandTxt);
        fuelCarPanel.add(fCarPriceTxt);
        fuelCarPanel.add(fFuelTypeTxt);
        fuelCarPanel.add(fNoOfSeatsTxt);
        fuelCarPanel.add(fMileageTxt);
        // 2nd row
        fuelCarPanel.add(fCarID1Txt);
        fuelCarPanel.add(fCarName1Txt);
        fuelCarPanel.add(fCarBrand1Txt);
        fuelCarPanel.add(fCarColorTxt);
        fuelCarPanel.add(fTransmissionTypeTxt);
        fuelCarPanel.add(fDistributorNameTxt);

        // adding comboBox(Purcahase)
        fuelCarPanel.add(fCarPurYear);
        fuelCarPanel.add(fCarPurMonth);
        fuelCarPanel.add(fCarPurDay);

        // adding comboBox(Booked)
        fuelCarPanel.add(fCarBookYear);
        fuelCarPanel.add(fCarBookMonth);
        fuelCarPanel.add(fCarBookDay);

        // adding FuelCar Buttons
        fuelCarPanel.add(fCarAdd);
        fuelCarPanel.add(fCarPurchase);
        fuelCarPanel.add(fCarDisplay);
        fuelCarPanel.add(fCarClear);

        // adding ElectricCar labels
        // 1st row
        electricCarPanel.add(eCarID);
        electricCarPanel.add(eCarName);
        electricCarPanel.add(eCarBrand);
        electricCarPanel.add(eCarPrice);
        electricCarPanel.add(eBatteryCapacity);
        // 2nd row
        electricCarPanel.add(eCarID1);
        electricCarPanel.add(eCarName1);
        electricCarPanel.add(eCarBrand1);
        electricCarPanel.add(eCarPrice1);
        electricCarPanel.add(eCarColor);
        electricCarPanel.add(eCustomerName);
        electricCarPanel.add(eBatteryWarranty);
        electricCarPanel.add(eRange);
        electricCarPanel.add(eRechargeTime);
        electricCarPanel.add(ePurchaseDate);
        // 3rd row
        electricCarPanel.add(eCarID2);
        electricCarPanel.add(eCustomerName1);

        // adding ElectricCar TextFields
        // 1st row
        electricCarPanel.add(eCarIDTxt);
        electricCarPanel.add(eCarNameTxt);
        electricCarPanel.add(eCarBrandTxt);
        electricCarPanel.add(eCarPriceTxt);
        electricCarPanel.add(eBatteryCapacityTxt);
        // 2nd row
        electricCarPanel.add(eCarID1Txt);
        electricCarPanel.add(eCarName1Txt);
        electricCarPanel.add(eCarBrand1Txt);
        electricCarPanel.add(eCarPrice1Txt);
        electricCarPanel.add(eCarColorTxt);
        electricCarPanel.add(eCustomerNameTxt);
        electricCarPanel.add(eBatteryWarrantyTxt);
        electricCarPanel.add(eRangeTxt);
        electricCarPanel.add(eRechargeTimeTxt);
        // 3rd row
        electricCarPanel.add(eCarID2Txt);
        electricCarPanel.add(eCustomerName1Txt);

        // adding comboBox of ElectricCar (Purchase)
        electricCarPanel.add(eCarPurYear);
        electricCarPanel.add(eCarPurMonth);
        electricCarPanel.add(eCarPurDay);

        // adding Buttons of ElectricCar
        electricCarPanel.add(eCarAdd);
        electricCarPanel.add(eCarBuy);
        electricCarPanel.add(eCarSell);
        electricCarPanel.add(eCarDisplay);
        electricCarPanel.add(eCarClear);

        // EventHandling
        // swap panels
        mFuelCar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    c1.show(panelContainer, "1");
                }
            });

        mElectricCar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    c1.show(panelContainer, "2");
                }
            });
        //------------------->FuelCar<--------------------
        // add_Button(FuelCar)
        fCarAdd.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //checking empty fields
                    if(fCarIDTxt.getText().equals("") || fCarNameTxt.getText().equals("") || fCarBrandTxt.getText().equals("") || fCarPriceTxt.getText().equals("") || fFuelTypeTxt.getText().equals("") || fMileageTxt.getText().equals("")){
                        JOptionPane.showMessageDialog(frame, "Fill all the Empty fields", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    else{
                        try{
                            // geting values from the user in the textfield
                            int fcID = Integer.parseInt(fCarIDTxt.getText());//changing to the integer
                            String fcName = fCarNameTxt.getText();
                            String fcBrand = fCarBrandTxt.getText();
                            String fcPrice = fCarPriceTxt.getText();
                            String fcFuelType = fFuelTypeTxt.getText();
                            int fcNoOfSeats= Integer.parseInt(fNoOfSeatsTxt.getText());
                            int fcMileage = Integer.parseInt(fMileageTxt.getText());

                            //if ArrayList is Empty
                            if(cars.isEmpty()){
                                Car fc = new FuelCar(fcID,fcName,fcBrand,fcPrice,fcFuelType,fcNoOfSeats,fcMileage);
                                cars.add(fc);//adding elements to the arraylist
                                JOptionPane.showMessageDialog(frame, "Fuel car Items has been added","Info.",JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                            //checking if value is already exist or not
                            for(Car car: cars){
                                if(car instanceof FuelCar && fcID == car.getCarId()){
                                    JOptionPane.showMessageDialog(frame, "Already Exist","Info.",JOptionPane.INFORMATION_MESSAGE);
                                    return;
                                }
                            }

                            //if ArrayList is not Empty
                            Car fc = new FuelCar(fcID,fcName,fcBrand,fcPrice,fcFuelType,fcNoOfSeats,fcMileage);
                            cars.add(fc);//adding elements to the arraylist
                            JOptionPane.showMessageDialog(frame, "Fuel car Items has been added","Info.",JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame, "Input Valid CarID,No of Seats,Mileage", "Warning", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                    }

                }
            });

        //Purchase_Button(FuelCar)
        fCarPurchase.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    // checking Empty Fields
                    if(fCarID1Txt.getText().equals("") || fCarName1Txt.getText().equals("") || fCarBrand1Txt.getText().equals("") || fCarColorTxt.getText().equals("") || fTransmissionTypeTxt.getText().equals("") || fDistributorNameTxt.getText().equals("")){
                        JOptionPane.showMessageDialog(frame, "Fill all the Empty fields", "Warning", JOptionPane.WARNING_MESSAGE);
                        return; 
                    }
                    else{
                        try{
                            // geting values from the user in the textfield
                            int fcID = Integer.parseInt(fCarID1Txt.getText());//changing to the integer
                            String fcName = fCarName1Txt.getText();
                            String fcBrand = fCarBrand1Txt.getText();
                            String fcColor = fCarColorTxt.getText();
                            String fcTransmissionType = fTransmissionTypeTxt.getText();
                            String fcDistributorName = fDistributorNameTxt.getText();
                            String fcPY = fCarPurYear.getSelectedItem().toString();
                            String fcPM = fCarPurMonth.getSelectedItem().toString();
                            String fcPD = fCarPurDay.getSelectedItem().toString();
                            String fcBY = fCarBookYear.getSelectedItem().toString();
                            String fcBM = fCarBookMonth.getSelectedItem().toString();
                            String fcBD = fCarBookDay.getSelectedItem().toString();
                            String purchase = fcPY + "-" + fcPM + "-" + fcPD;//concating
                            String book = fcBY + "-" + fcBM + "-" + fcBD;
                            //checking if ArrayList is Empty or Not
                            if(cars.isEmpty()){
                                JOptionPane.showMessageDialog(frame, "Car is not available in the Stock", "Info.", JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                            else{
                                //iterating from the arraylist
                                for(Car car:cars){
                                    if(car instanceof FuelCar){
                                        boolean isPurchased = ((FuelCar)car).getIsPurchased();//getting boolean
                                        if(fcID == car.getCarId() && isPurchased == false){
                                            FuelCar obj = (FuelCar)car;//Downcasting
                                            obj.purchase(purchase,book);//passing parameters 
                                            JOptionPane.showMessageDialog(frame, "FuelCar has been purchased","Info.",JOptionPane.INFORMATION_MESSAGE);
                                            return;
                                        }

                                        if(fcID == car.getCarId() && isPurchased == true)//checking carid and boolean value
                                        {
                                            FuelCar obj = (FuelCar)car;//Downcasting
                                            obj.purchase(purchase,book);//passing parameters
                                            JOptionPane.showMessageDialog(frame, "FuelCar has been Already Purchased","Info.",JOptionPane.INFORMATION_MESSAGE);
                                            return;
                                        }

                                    }
                                }
                            }

                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame, "Input Valid CarID", "Warning", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                    }
                }
            });
        //Display button(FuelCar)
        fCarDisplay.addActionListener(new ActionListener(){
                //checking ArrayList  Empty or not
                public void actionPerformed(ActionEvent e){
                    if(cars.isEmpty()){
                        JOptionPane.showMessageDialog(frame, "Please purchase the FuelCar", "Info.", JOptionPane.INFORMATION_MESSAGE);
                        return; 
                    }
                    else{
                        //iterating the arraylist
                        for(Car car: cars){
                            if(car instanceof FuelCar){
                                //downcasting
                                FuelCar obj = (FuelCar)car;
                                //calling FuelCar display method
                                obj.display(); 
                            }

                        }
                    }
                }
            });

        // clear Textfields(FuelCar)
        fCarClear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //----------Reseting the textfields of FuelCar
                    // 1st row
                    fCarIDTxt.setText("");
                    fCarNameTxt.setText("");
                    fCarBrandTxt.setText("");
                    fCarPriceTxt.setText("");
                    fFuelTypeTxt.setText("");
                    fNoOfSeatsTxt.setText("");
                    fMileageTxt.setText("");
                    // 2nd row
                    fCarID1Txt.setText("");
                    fCarName1Txt.setText("");
                    fCarBrand1Txt.setText("");
                    fCarColorTxt.setText("");
                    fTransmissionTypeTxt.setText("");
                    fDistributorNameTxt.setText("");
                }
            });

        //--------------------->ElectricCar<----------------------

        // add_Button(ElectricCar)
        eCarAdd.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //checking empty fields
                    if(eCarIDTxt.getText().equals("") || eCarNameTxt.getText().equals("") || eCarBrandTxt.getText().equals("") || eCarPriceTxt.getText().equals("") ||  eBatteryCapacityTxt.getText().equals("")){
                        JOptionPane.showMessageDialog(frame, "Fill all the Empty fields", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    else{
                        try{
                            // geting values from the user in the textfield
                            int ecID = Integer.parseInt(eCarIDTxt.getText());
                            String ecName = eCarNameTxt.getText();
                            String ecBrand = eCarBrandTxt.getText();
                            String ecPrice = eCarPriceTxt.getText();
                            int ecBatteryCapacity = Integer.parseInt(eBatteryCapacityTxt.getText());

                            //if ArrayList is Empty
                            if(cars.isEmpty()){
                                Car ec = new ElectricCar(ecID,ecName,ecBrand,ecPrice,ecBatteryCapacity);
                                cars.add(ec);
                                JOptionPane.showMessageDialog(frame, "Electric car Items has been added","Info.",JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                            //checking if value is already exist or not
                            for(Car car: cars){
                                if(car instanceof ElectricCar && ecID == car.getCarId()){
                                    JOptionPane.showMessageDialog(frame, "Already Exist","Info.",JOptionPane.INFORMATION_MESSAGE);
                                    return;
                                }
                            }

                            //if ArrayList is not Empty
                            Car ec = new ElectricCar(ecID,ecName,ecBrand,ecPrice,ecBatteryCapacity);
                            cars.add(ec);
                            JOptionPane.showMessageDialog(frame, "Electric car Items has been added","Info.",JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame, "Input Valid CarID,Battery_Capacity", "Warning", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                    }

                }
            });

        //Buy_Button(Electric Car)
        eCarBuy.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //checking textfields are empty or not
                    if(eCarID1Txt.getText().equals("") || eCarName1Txt.getText().equals("") || eCarBrand1Txt.getText().equals("") || eCarPrice1Txt.getText().equals("") || eCarColorTxt.getText().equals("") || eCustomerNameTxt.getText().equals("") || eBatteryWarrantyTxt.getText().equals("") || eRangeTxt.getText().equals("") || eRechargeTimeTxt.getText().equals("")){
                        JOptionPane.showMessageDialog(frame, "Fill all the Empty fields", "Warning", JOptionPane.WARNING_MESSAGE);
                        return; 
                    }
                    else{
                        try{
                            // geting values from the user in the textfield
                            int ecID = Integer.parseInt(eCarID1Txt.getText());
                            String ecName = eCarName1Txt.getText();
                            String ecBrand = eCarBrand1Txt.getText();
                            String ecPrice = eCarPrice1Txt.getText();
                            String ecColor = eCarColorTxt.getText();
                            String ecCustomerName = eCustomerNameTxt.getText();
                            int ecBatteryWarranty = Integer.parseInt(eBatteryWarrantyTxt.getText());
                            String ecRange = eRangeTxt.getText();
                            int ecRechargeTime = Integer.parseInt(eRechargeTimeTxt.getText());
                            String ecPY = eCarPurYear.getSelectedItem().toString();
                            String ecPM = eCarPurMonth.getSelectedItem().toString();
                            String ecPD = eCarPurDay.getSelectedItem().toString();
                            String purchase = ecPY + "-" + ecPM + "-" + ecPD;//concatinating

                            //checking if ArrayList is Empty or Not
                            if(cars.isEmpty()){
                                JOptionPane.showMessageDialog(frame, "Car is not available in the Stock", "Info.", JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                            else{
                                //iterating from the arraylist
                                for(Car car:cars){
                                    if(car instanceof ElectricCar){
                                        boolean isBought = ((ElectricCar)car).getIsBought();
                                        if(ecID == car.getCarId() && isBought == false){
                                            ElectricCar obj = (ElectricCar)car;//Downcasting
                                            obj.buy(ecCustomerName,ecBatteryWarranty,purchase,ecRange,ecRechargeTime);
                                            JOptionPane.showMessageDialog(frame, "Electric Car has been bought","Info.",JOptionPane.INFORMATION_MESSAGE);
                                            return;
                                        }

                                        if(ecID == car.getCarId() && isBought == true){
                                            ElectricCar obj = (ElectricCar)car;//Downcasting
                                            obj.buy(ecCustomerName,ecBatteryWarranty,purchase,ecRange,ecRechargeTime);
                                            JOptionPane.showMessageDialog(frame, "Electric Car has been Already bought","Info.",JOptionPane.INFORMATION_MESSAGE);
                                            return;
                                        }
                                    }
                                }
                            }

                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame, "Input valid CarID,BatteryWarranty,RechargeTime", "Warning", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                    }
                }
            });

        //Sell_Button(Electric Car)
        eCarSell.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //checking Textfields are empty or not
                    if(eCarID2Txt.getText().equals("") || eCustomerName1Txt.getText().equals("")){
                        JOptionPane.showMessageDialog(frame, "Fill all the Empty Fields", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    else{
                        try{
                            // geting values from the user in the textfield
                            int ecID = Integer.parseInt(eCarID2Txt.getText());
                            String ecCustomerName = eCustomerName1Txt.getText();

                            //checking if ArrayList is Empty or Not
                            if(cars.isEmpty()){
                                JOptionPane.showMessageDialog(frame, "Selling Car is Off Right Now,Due to Company Construction", "Info.", JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }
                            else{
                                //iterating through the Arraylist
                                for(Car car:cars){
                                    if(car instanceof ElectricCar){
                                        boolean isSold = ((ElectricCar)car).getIsSold();//passing boolena value
                                        if(ecID == car.getCarId() && isSold == false){
                                            ElectricCar obj = (ElectricCar)car;//Downcasting
                                            obj.sell(ecCustomerName);
                                            JOptionPane.showMessageDialog(frame, "Electric Car has been Sold","Info.",JOptionPane.INFORMATION_MESSAGE);
                                            return;
                                        }
                                        //checking carid and boolean value
                                        if(ecID == car.getCarId() && isSold == true){
                                            ElectricCar obj = (ElectricCar)car;//Downcasting
                                            obj.sell(ecCustomerName);
                                            JOptionPane.showMessageDialog(frame, "Electric Car has been Already Sold","Info.",JOptionPane.INFORMATION_MESSAGE);
                                            return;
                                        }

                                    }
                                }
                            }
                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(frame, "Input valid CarID", "Warning", JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                    }
                }
            });

        //Display button(ElectricCar)
        eCarDisplay.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //checking Empty value in the ArrayList
                    if(cars.isEmpty()){
                        JOptionPane.showMessageDialog(frame, "Please Sell the Electric Car First", "Info.", JOptionPane.INFORMATION_MESSAGE);
                        return; 
                    }
                    else{
                        for(Car car: cars){
                            if(car instanceof ElectricCar){
                                //downcasting
                                ElectricCar obj = (ElectricCar)car;
                                //calling ElectricCar Display method
                                obj.display(); 
                            }

                        }
                    }
                }
            });
        // clear TextFields(ElectricCar)
        eCarClear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //resetting textfields of ElectricCar
                    // 1st row
                    eCarIDTxt.setText("");
                    eCarNameTxt.setText("");
                    eCarBrandTxt.setText("");
                    eCarPriceTxt.setText("");
                    eBatteryCapacityTxt.setText("");
                    // 2nd row
                    eCarID1Txt.setText("");
                    eCarName1Txt.setText("");
                    eCarBrand1Txt.setText("");
                    eCarPrice1Txt.setText("");
                    eCarColorTxt.setText("");
                    eCustomerNameTxt.setText("");
                    eBatteryWarrantyTxt.setText("");
                    eRangeTxt.setText("");
                    eRechargeTimeTxt.setText("");
                    // 3rd row
                    eCarID2Txt.setText("");
                    eCustomerName1Txt.setText("");
                }
            });

        // Frame Setup
        frame.setSize(1280, 825);//frame size
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);//frame default close operation
        frame.setVisible(true);//make frame visible
    }

    //main method
    public static void main(String[] args){
        new GUI_Demo();//creating object of GUI_Demo()
    }
}

/**March 16
*Michael Brennan
*Student Number:1645267
*This is a class called ParkingTicketDemo that driver the classes programs and stores the CarMake, Model, Colour, LicensePlate, MinutesParked, MinutesParked1
*Fine, MinutesPurchased, GardaName and GardaNumber within the object to print out to the user.
*/

//This tells java that we want to use the JOptionPane class, (located in the javax.swing library).
import javax.swing.JOptionPane;

//This class header acts like a container (keeping all code within the name of that class)
public class ParkingTicketDemo
{
	//This method is main method (starting of this application)
	public static void main (String[] arg)
	{
	
	// Define variables
	String CarMake; 
	String Model;
	String Colour;
	String LicensePlate;
	int MinutesParked;
	String MinutesParked1;
	int repeat;
	double Fine; 
	String MinutesPurchased1;
	int MinutesPurchased;
	String GardaName;
	String GardaNumber;      
	

     
      	//*****************ParkedCar*************************
      	
      	//Displayed to the user from the object (argument)...
		CarMake = JOptionPane.showInputDialog("What is the car make?");
		
		//Displayed to the user from the object (argument)...
		Model = JOptionPane.showInputDialog("What is the car Model?");
		
		//Displayed to the user from the object (argument)...
		Colour = JOptionPane.showInputDialog("What is the car Colour?");
		
		//Displayed to the user from the object (argument)...
		LicensePlate = JOptionPane.showInputDialog("What is the car License Plate?");
		
		//Displayed to the user from the object (argument)...
		MinutesParked1 = JOptionPane.showInputDialog("How many MINUTES was the car parked?");
		//Returns the string into an int
		MinutesParked = Integer.parseInt(MinutesParked1);
		
		//Creating a Class objects to be displayed to the user there input in the constructor ParkedCar...
		ParkedCar PCar = new ParkedCar(CarMake, Model, Colour, LicensePlate, MinutesParked);
		
		//*******************ParkingMeter*************************
		//Displayed to the user from the object (argument)...
		MinutesPurchased1 = JOptionPane.showInputDialog("How many MINUTES where purchased?");
		//Returns the string into an int
		MinutesPurchased = Integer.parseInt(MinutesPurchased1);
		
		//If Statement to display a message IF the user enters a number less than 1 an error message will appear
		if 	(MinutesParked < 1)
		{
		//error message	
		JOptionPane.showMessageDialog(null,
    	"**Incorrect Amount**\n" + "Please Restart the Program",
    	"Inane warning",
    	JOptionPane.WARNING_MESSAGE);
		
		//Closing point
		System.exit(0);
		}
		
		//Creating a Class objects to be displayed to the user there input in the constructor ParkedCar...	
		ParkingMeter PMeter = new ParkingMeter(MinutesPurchased);

		//************ParkingTicket*******************
		//Displayed to the user from the object (argument)...	
		GardaName = JOptionPane.showInputDialog("Enter your Name");
		//Displayed to the user from the object (argument)...
		GardaNumber	= JOptionPane.showInputDialog("Enter your Garda Number");
		
		
		//Dialog box displaying YES or NO Answer
		repeat = JOptionPane.showConfirmDialog(null, "" +PCar+ "\n" +PMeter+ "\nGarda Name = " +GardaName+ "\nGarda Number = " +GardaNumber+
		 "\n\n IS THE INFORMATION ABOVE CORRECT?", "--Please Confirm--",JOptionPane.YES_NO_OPTION);
		 
		 //While the user press yes the following from below will be displayed
		 while (repeat == JOptionPane.YES_OPTION){
		
		    	 
 		//Creating a Class objects to be displayed to the user there input in the constructor ParkingTicket...	
		ParkingTicket PTicket = new ParkingTicket(GardaName, GardaNumber);
		JOptionPane.showMessageDialog(null, "" +PTicket);


		//****GardaOfficer****
		//Creating a Class objects to be displayed to the user there input in the constructor GardaOfficer...
		GardaOfficer GOfficer = new GardaOfficer();
		//Displayed to the user from the object/Constructor (argument)...
		JOptionPane.showMessageDialog(null, "" +GOfficer);
	
		//Closing point
		System.exit(0);    
 	}
	}
	}
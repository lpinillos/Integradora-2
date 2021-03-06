package ui;
import java.util.Scanner;
import model.*;

public class WetlandMain{
	
	public static Scanner scr;
	public static WetlandController controller;
	public static int choice = 0;
	
	public static void init() {

		scr = new Scanner(System.in);
		controller = new WetlandController();

	}
	
	/**pre
	 *<strong>Description:</strong> the stopFlag method is use as a controller variable
	 when the user type any choice or desicion.
	 *<strong>pre:</strong> N/A
	 *<strong>pos:</strong> N/A
	 *@param choice <strong>int</strong> this variable save the desicion that the user makes in the menus
	 of the program.
	 *pre
	*/
	public static int stopFlag(int choice){
		while (choice<1 || choice>5){
			Scanner scr = new Scanner (System.in);
			System.out.println("\nERROR, enter a valid option!\n");
			choice = scr.nextInt();
		}
		return choice;
	}
	
	/**
		*<strong>Description:</strong> main is where all the program runs with the help of the others methods created.
		@param args <strong>String []</strong> this variable is part of the main method.
	*/
	
	public static void main(String [] args){
		
		init();
		int choice = 0;
		int exit = 0;
		int infoDesicion = 0;
		
		System.out.println(" ");
		System.out.println("*************************************");
		System.out.println("*                                   *");
		System.out.println("*  WELCOME TO THE WETLAND DATABASE  *");
		System.out.println("*                                   *");
		System.out.println("*************************************\n");

		while(exit==0){
			
			System.out.println("*********** MENU **********");
			System.out.println("* Type an option:         *");
			System.out.println("*                         *");
			System.out.println("* 1. Create wetland       *");
			System.out.println("* 2. Register new species *");
			System.out.println("* 3. Register new event   *");
			System.out.println("* 4. Get information      *");
			System.out.println("* 5. Exit                 *");
			System.out.println("*                         *");
			System.out.println("***************************\n");
			choice = scr.nextInt();
		
			switch(stopFlag(choice)){
			
				case 1:
					registerWetland();
					break;
				case 2:
					registerSpecies();
					break;
				case 3:
					registerEvent();
					break;
				case 4:
					if (controller.showWetlands().equals("")) {
						System.out.println("\nThere aren't any wetlands registered.\n");
					} else {
						System.out.println(" ");
						System.out.println("***************INFO MENU****************");
						System.out.println("*                                      *");
						System.out.println("* 1. Get wetland info                  *");
						System.out.println("* 2. Get species info                  *");
						System.out.println("* 3. Get yearly events per wetland info*");
						System.out.println("* 4. Show wetland with fewer species   *");
						System.out.println("* 5. Show wetland with more species    *");
						System.out.println("*                                      *");
						System.out.println("****************************************\n");
						choice = scr.nextInt();
					
						switch (stopFlag(choice)){
						
							case 1:
								System.out.println(controller.showWetlands());
								break;
							case 2:
								if(controller.ShowSpecies().equals("")){
									System.out.println("\nThere are no species entered yet!\n");
								}else{
									System.out.println(controller.ShowSpecies());
								}
								break;
							case 3:
								if(controller.ShowEvents().equals("")){
									System.out.println("\nThere are no events entered yet!\n");
								}else{
									System.out.println(controller.ShowEvents());
								}
								break;
							case 4:
								if(controller.ShowSpecies().equals("")){
									System.out.println("\nThere are no species entered yet!\n");
								}else{
									System.out.println("Teacher, I got an error and I didn't know how to fix it :(");
									//System.out.println(controller.ShowFewerSpecies());
								}
								break;
							case 5: 
								if(controller.ShowSpecies().equals("")){
									System.out.println("\nThere are no species entered yet!\n");
								}else{
									System.out.println("Teacher, I got an error and I didn't know how to fix it :(");
									//System.out.println(controller.showMoreSpecies());
								}
								break;
						}
					}
					break;
					
				case 5:
				
					System.out.println("\nThanks for using this program!\n");
					exit++;
					break;
			}
		}
	}
	
	/**pre
	 *<strong>Description:</strong> the registerWetland method is use to register a new wetland to the program.
	 *<strong>pre:</strong> N/A
	 *<strong>pos:</strong> N/A
	 *pre
	*/
	
	public static void registerWetland(){

		System.out.println("\nPlease enter the wetland name\n");
		String wetlandName = scr.nextLine();
		wetlandName = scr.nextLine();
		
		while(wetlandName.equals("")){
			System.out.println("\nERROR, please enter the name of the wetland");
			wetlandName = scr.nextLine();
		}
		
		System.out.println("\nPlease type the location of the wetland\n");
		System.out.println("1. Rural");
		System.out.println("\n2. Urban\n");
		String locationZone = scr.next();
		
		while (!locationZone.equals("1") && !locationZone.equals("2")){
			System.out.println("\nERROR, enter a valid option!\n");
			locationZone = scr.next();
		}
		
		if(locationZone.equals("1")){
			locationZone = "Rural";
		}else if (locationZone.equals("2")){
			locationZone = "Urban";
		}
		
		System.out.println("\nEnter the location type of the wetland\n");
		System.out.println("1. Public");
		System.out.println("\n2. Private\n");
		String locationType = scr.next();
		
		while (!locationType.equals("1") && !locationType.equals("2")){
			System.out.println("\nERROR, enter a valid option!\n");
			locationType = scr.next();
		}
		
		if(locationType.equals("1")){
			locationType = "Public";
		}else if (locationType.equals("2")){
			locationType = "Private";
		}
		System.out.println("\nPlease enter the km2 that the wetland covers\n");
		double kmAmount = scr.nextDouble();
		
		System.out.println("\nPlease enter an URL of the wetland picture\n");
		String wetlandPicture = scr.nextLine();
		wetlandPicture = scr.nextLine();
		
		while(wetlandPicture.equals("")){
			System.out.println("\nERROR, please enter the wetland picture");
			wetlandPicture = scr.nextLine();
		}
		
		System.out.println("\nIs this wetland a protected area?\n");
		System.out.println("1. YES");
		System.out.println("\n2. NO\n");
		String protectedArea = scr.next();
		
		while (!protectedArea.equals("1") && !protectedArea.equals("2")){
			System.out.println("\nERROR, enter a valid option!\n");
			protectedArea = scr.next();
		}
		
		if(protectedArea.equals("1")){
			protectedArea = "YES";
		}else if (locationZone.equals("2")){
			protectedArea = "NO";
		}
		
		if (controller.registerWetland(wetlandName, locationZone, locationType, kmAmount, wetlandPicture, protectedArea)){
			System.out.println("\nThe wetland " + wetlandName + " was successfully registered\n");
		} else {
			System.out.println("\nThe wetland " + wetlandName + " couldn't be registered\n");
		}
		
	}
	
	/**pre
	 *<strong>Description:</strong> the registerSpecies method is use to register new species to the program.
	 *<strong>pre:</strong> the user have to register a wetland first in order to use this option
	 *<strong>pos:</strong> N/A
	 *pre
	*/
	
	public static void registerSpecies(){
		int speciesType = 0;
		
		if (controller.showWetlands().equals("")) {

			System.out.println("\nThere aren't any wetlands registered.\n");
			
		} else {
			
			System.out.println("\nChoose the wetland to which you want to add the species" + controller.showWetlandsList() + "\n");
			String wetlandID = scr.next();
			
			System.out.println("\nIs this species fauna or flora?\n");
			System.out.println("1. Fauna\n");
			System.out.println("2. Flora\n");
			String faunaOrFlora = scr.next();
			
			while (!faunaOrFlora.equals("1") && !faunaOrFlora.equals("2")){
				System.out.println("\nERROR, enter a valid option!\n");
				faunaOrFlora = scr.next();
			}
			
			if(faunaOrFlora.equals("1")){
				faunaOrFlora = "Fauna";
			}else if(faunaOrFlora.equals("2")){
				faunaOrFlora = "Flora";
			}
			
			System.out.println("\nPlease enter the name of the species\n");
			String speciesName = scr.nextLine();
			speciesName = scr.nextLine();
			
			System.out.println("\nPlease enter the scientific name of the species that you introduce\n");
			String scientificName = scr.nextLine();
			
			System.out.println("\nIs a migratory species?\n");
			System.out.println("1. YES\n");
			System.out.println("2. NO\n");
			String migratorySpecies = scr.next();
			
			while (!migratorySpecies.equals("1") && !migratorySpecies.equals("2")){
				System.out.println("\nERROR, enter a valid option!\n");
				migratorySpecies = scr.next();
			}
			
			if(migratorySpecies.equals("1")){
				migratorySpecies = "YES";
			}else if (migratorySpecies.equals("2")){
				migratorySpecies = "NO";
			}
			
			if(faunaOrFlora.equals("Flora")){
				System.out.println("\nEnter the type of the species:\n1. LAND_SPECIES\n2. AQUATIC_SPECIES");
				speciesType = scr.nextInt();
				
				while (speciesType< 1 || speciesType> 2){
					System.out.println("\nERROR, enter a valid option!\n");
					speciesType = scr.nextInt();
				}
			}else if(faunaOrFlora.equals("Fauna")){
				System.out.println("\nEnter the type of species:\n3. BIRD\n4. MAMMAL\n5. AQUATIC\n");
				speciesType = scr.nextInt();
				
				while (speciesType< 3 || speciesType> 5){
					System.out.println("\nERROR, enter a valid option!\n");
					speciesType = scr.nextInt();
				}
			}
			
			if (controller.registerSpecies(wetlandID, speciesName, scientificName, migratorySpecies, speciesType, faunaOrFlora)){
				System.out.println("\nThe species " + speciesName + " was successfully registered\n");
			} else {
				System.out.println("\nThe species " + speciesName + " couldn't be registered\n");
			}
		}
	}
	
	/**pre
	 *<strong>Description:</strong> the registerEvent method is use to register new events to the program.
	 *<strong>pre:</strong> the user have to register a wetland first in order to use this option.
	 *<strong>pos:</strong> N/A
	 *pre
	*/
	
	public static void registerEvent(){
		if (controller.showWetlands().equals("")) {

			System.out.println("There aren't any wetlands registered.");
			
		} else {
			
			System.out.println("\nChoose the wetland to which you want to add the event " + controller.showWetlandsList() + "\n");
			String wetlandID = scr.next();
			
			System.out.println("\nWhat kind of event is going to take place in this wetland?\n");
			System.out.println("1. Maintence\n");
			System.out.println("2. School visits\n");
			System.out.println("3. Improvement activities\n");
			System.out.println("4. Celebrations\n");
			String eventType = scr.next();
			
			while (!eventType.equals("1") && !eventType.equals("2") && !eventType.equals("3") && !eventType.equals("4")){
				System.out.println("\nERROR, enter a valid option!\n");
				eventType = scr.next();
				
			}
			
			if(eventType.equals("1")){
				eventType = "Maintence";
			}else if(eventType.equals("2")){
				eventType = "School visits";
			}else if(eventType.equals("3")){
				eventType = "Improvement activities";
			}else if(eventType.equals("4")){
				eventType = "Celebrations";
			}
			
			System.out.println("\nPlease enter the date on which the event is going to take place\n");
			int date = scr.nextInt();
			
			System.out.println("\nWho is the owner of this event?\n");
			String eventOwner = scr.nextLine();
			eventOwner = scr.nextLine();
			
			System.out.println("\nPlease type the value of this event\n");
			double eventValue = scr.nextDouble();
			
			System.out.println("\nPlease enter a description for this event\n");
			String eventDescription = scr.nextLine();
			eventDescription = scr.nextLine();
			
			if (controller.registerEvent(wetlandID, eventType, date, eventOwner, eventValue, eventDescription)){
				System.out.println("\nThe event of " + eventOwner + " was successfully registered\n");
			} else {
				System.out.println("\nThe event " + eventOwner + " couldn't be registered\n");
			}
			
		}
		
	}
}
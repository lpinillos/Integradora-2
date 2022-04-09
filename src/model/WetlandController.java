package model;

public class WetlandController{

	private Wetland[] wetlands;

/**pre
	 *<strong>Description:</strong> the public wetlandController is used to inicialized the 
	wetlands array.
	 *<strong>pre:</strong> N/A
	 *<strong>pos:</strong> N/A
	 *pre
	*/
	public WetlandController() {

		wetlands = new Wetland[80];

	}
	
	/**pre
	 *<strong>Description:</strong> the registerWetland method is use to create all the things that
	 the wetland have, such as name, lacation, pictures, etc...
	 *<strong>pre:</strong> N/A
	 *<strong>pos:</strong> N/A
	 *@param wetlandName <strong>String</strong> this varible is used to save the name of the wetland.
	 *@param locationZone <strong>String</strong> this varible is used to enter if the wetland is on a rural area
	 or on a urban area.
	 *@param locationType <strong>String</strong> this variable is used to save if the wetland is public or private.
	 *@param kmAmount <strong>double</strong> this varible is used to save the number of km covered by the wetland.
	 *@param wetlandPicture <strong>String</strong> this varible is used to save the URL of a picture of the wetland.
	 *@param protectedArea <strong>String</strong> this varible is used to save if the wetland is protected or not.
	 *@return stopFlag <strong>boolean</strong> this value returns a true boolean that indicates that the method 
	 ends its funcion.
	 *pre
	*/

	public boolean registerWetland(String wetlandName, String locationZone, String locationType, double kmAmount, String wetlandPicture, String protectedArea){

		boolean stopFlag = false;

		Wetland myWetland = new Wetland(wetlandName, locationZone, locationType, kmAmount, wetlandPicture, protectedArea);

		for (int i = 0; i < wetlands.length && !stopFlag; i++) {

			if (wetlands[i] == null) {

				myWetland.setWetlandID((i + 1) + "");
				wetlands[i] = myWetland;
				stopFlag = true;

			}

		}

		return stopFlag;

	}
	
	/**pre
	 *<strong>Description:</strong> the showWetlandsList method is use to show to the user the wetlands that he/she can choose
	  in order to add a new species or event.
	 *<strong>pre:</strong> this method needs the creation of a wetland.
	 *<strong>pos:</strong> N/A
	 *@return msg <strong>String</strong> this variable is use to save the message that the user will see in the program.
	 *pre
	*/

	public String showWetlandsList() {

		String msg = "";

		for (int i = 0; i < wetlands.length; i++) {

			if (wetlands[i] != null) {

				msg += "\n" + wetlands[i].getWetlandID() + ". " + wetlands[i].getName();
			}
		}

		return msg;

	}
	
	/**pre
	 *<strong>Description:</strong> the registerEvent method is used to create all the things that
	 the event have, such as type, owner, date, etc...
	 *<strong>pre:</strong> this method needs the creation of a wetland.
	 *<strong>pos:</strong> N/A
	 *@param wetlandID <strong>String</strong> this varible is used to choose the wetland to which we are going to
	 assign the event.
	 *@param eventType <strong>String</strong> this varible is used to indentify the type of the event.
	 or on a urban area.
	 *@param date <strong>int</strong> this variable is used enter the date in which the event will take place.
	 *@param eventOwner <strong>String</strong> this varible is used to save the owner of the event.
	 *@param eventValue <strong>double</strong> this varible is used to save the cost that the event will have.
	 *@param eventDescription <strong>String</strong> this varible is used to save a desription of the event.
	 *@return stopFlag <strong>boolean</strong> this value returns a true boolean that indicates that the method 
	 ends its funcion.
	 *pre
	*/

	public boolean registerEvent(String wetlandID, String eventType, int date, String eventOwner, double eventValue, String eventDescription) {

		boolean stopFlag = false;

		for (int i = 0; i < wetlands.length && !stopFlag; i++) {

			if (wetlands[i] != null) {

				if ((i + 1 + "").equals(wetlandID)) {

					stopFlag = wetlands[i].addEvent(eventType, date, eventOwner, eventValue, eventDescription);

				}

			}

		}

		return stopFlag;

	}
	
	/**pre
	 *<strong>Description:</strong> the showWetlands method is use to show to the user the information of the wetlands
	  that are already entered.
	 *<strong>pre:</strong> this method needs the creation of a wetland.
	 *<strong>pos:</strong> N/A
	 *@return msg <strong>String</strong> this variable is use to save the message that the user will see in the program.
	 *pre
	*/
	
	public String showWetlands() {

		String msg = "";

		for (int i = 0; i < wetlands.length; i++) {

			if (wetlands[i] != null) {

				msg += "\n" + wetlands[i].toString();
			}
		}

		return msg;

	}
	
	/**pre
	 *<strong>Description:</strong> the ShowSpecies method is use to show to the user the species that he/she already
	  entered in the program.
	 *<strong>pre:</strong> this method needs the creation of a wetland.
	 *<strong>pre:</strong> this method needs the creation of a species.
	 *<strong>pos:</strong> N/A
	 *@return msg <strong>String</strong> this variable is use to save the message that the user will see in the program.
	 *pre
	*/
	
	public String ShowSpecies(){
		String msg = "";
		
		for (int i = 0; i<wetlands.length; i++){
			
			if(wetlands[i]!=null){
				msg += wetlands[i].showSpecies();
			}
		}
		
		return msg;
	}
	
	/**pre
	 *<strong>Description:</strong> the showEvents method is use to show to the user the events that he/she already
	  entered in the program.
	 *<strong>pre:</strong> this method needs the creation of a wetland.
	 *<strong>pre:</strong> this method needs the creation of an event.
	 *<strong>pos:</strong> N/A
	 *@return msg <strong>String</strong> this variable is use to save the message that the user will see in the program.
	 *pre
	*/
	
	public String ShowEvents(){
		String msg = "";
		
		for (int i = 0; i<wetlands.length; i++){
			
			if(wetlands[i]!=null){
				
				msg += "\nYearly events per wetland:\n";
				msg += wetlands[i].getName() + ":\n";
				msg += wetlands[i].showEvents();
			}
		}
		
		return msg;
	}
	
	/**pre
	 *<strong>Description:</strong> the registerSpecies method is used to create all the things that
	 the species have, such as name, scientific name, type, etc...
	 *<strong>pre:</strong> this method needs the creation of a wetland.
	 *<strong>pos:</strong> N/A
	 *@param wetlandID <strong>String</strong> this varible is used to choose the wetland to which we are going to
	 assign the event.
	 *@param speciesName <strong>String</strong> this varible is used save the name of the species.
	 *@param scientificName <strong>String</strong> this variable is used top save the scientific name of the species.
	 *@param migratorySpecies <strong>String</strong> this varible is used to save if the species is migratory or not.
	 *@param speciesType <strong>int</strong> this varible is used to save the type of the species.
	 *@param faunaOrFlora <strong>String</strong> this varible is used to save if the species belongs to fauna or to flora.
	 *@return stopFlag <strong>boolean</strong> this value returns a true boolean that indicates that the method 
	 ends its funcion.
	 *pre
	*/
	
	public boolean registerSpecies(String wetlandID, String speciesName, String scientificName, String migratorySpecies, int speciesType, String faunaOrFlora) {

		boolean stopFlag = false;

		for (int i = 0; i < wetlands.length && !stopFlag; i++) {

			if (wetlands[i] != null) {

				if ((i + 1 + "").equals(wetlandID)) {

					stopFlag = wetlands[i].addSpecies(speciesName, scientificName, migratorySpecies, speciesType, faunaOrFlora);

				}

			}

		}

		return stopFlag;

	}
	
	/**pre
	 *<strong>Description:</strong> the registerEnviromentalManagementPlan method is used to create the enviromental plan
	 of the wetland.
	 *<strong>pre:</strong> this method needs the creation of a wetland.
	 *<strong>pos:</strong> N/A
	 *@param wetlandID <strong>String</strong> this varible is used to choose the wetland to which we are going to
	 assign the event.
	 *@param havePlan <strong>String</strong> this varible is used to save if the wetland have a plan or not.
	 *@param compliancePercentage <strong>double</strong> this variable is used to save the compliance percentage that the plan have.
	 *@return stopFlag <strong>boolean</strong> this value returns a true boolean that indicates that the method 
	 ends its funcion.
	 *pre
	*/
	
	public boolean registerEnviromentalManagementPlan(String wetlandID, int havePlan, double compliancePercentage) {

		boolean stopFlag = false;

		for (int i = 0; i < wetlands.length && !stopFlag; i++) {

			if (wetlands[i] != null) {

				if ((i + 1 + "").equals(wetlandID)) {

					stopFlag = wetlands[i].addEnviromentalManagementPlan(havePlan, compliancePercentage);

				}

			}

		}

		return stopFlag;

	}
	
	/**pre
	 *<strong>Description:</strong> the ShowFewerSpecies method is use to show to the user the wetland with fewer flora species.
	 *<strong>pre:</strong> this method needs the creation of a wetland.
	 *<strong>pre:</strong> this method needs the creation of a species.
	 *<strong>pos:</strong> N/A
	 *@return msg <strong>String</strong> this variable is use to save the message that the user will see in the program.
	 *pre
	*/

/*	
	public String ShowFewerSpecies(){
		String msg = "";
		int count = 0;
		int countFewerSpecies = 0;
		
		for(int i = 0; i < wetlands.length; i++){
			
			Species [] temp = wetlands[i].getSpecies();
			
			for(int j = 0; j < temp.length; j++){
				
				if(temp[j].getSpeciesType().equals(Type.LAND_SPECIES)){
					count++;
				}else if(temp[j].getSpeciesType().equals(Type.AQUATIC_SPECIES)){
					count++;
				}
				
			}
			
			if(count < countFewerSpecies){
				countFewerSpecies = count;
			}else{
				msg = wetlands[i].getName() + " have " + countFewerSpecies + " species ";
			}
			
		}
		
		return msg;
	}
*/
	
	/**pre
	 *<strong>Description:</strong> the showMoreSpeciesSpecies method is use to show to the user the wetland
	  with more animal species.
	 *<strong>pre:</strong> this method needs the creation of a wetland.
	 *<strong>pre:</strong> this method needs the creation of a species.
	 *<strong>pos:</strong> N/A
	 *@return msg <strong>String</strong> this variable is use to save the message that the user will see in the program.
	 *pre
	*/
	
	/*
	public String showMoreSpecies(){
		String msg = "";
		int count = 0;
		int countMoreSpecies = 0;
		
		for(int i = 0; i < wetlands.length; i++){
			
			Species [] temp = wetlands[i].getSpecies();
			
			for(int j = 0; j < temp.length; j++){
				
				if(temp[j].getSpeciesType().equals("MAMMAL")){
					count++;
				}else if(temp[j].getSpeciesType().equals("BIRD")){
					count++;
				}else if(temp[j].getSpeciesType().equals("AQUATIC")){
					count++;
				}
				
			}
			
			if(count > countMoreSpecies){
				countMoreSpecies = count;
			}else{
				msg = wetlands[i].getName() + " have " + countMoreSpecies + " species ";
			}
			
		}
		
		return msg;
		
	}
*/

}
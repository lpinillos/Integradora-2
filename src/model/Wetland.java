package model;

public class Wetland {
	
	private int count = 0;
	
	private String name;
	private String locationZone;
	private String locationType;
	private double kmAmount;
	private String wetlandPicture;
	private String protectedArea;
	private String wetlandID;
	private EnviromentalManagementPlan enviromentalManagementPlans;
	private Event[] events;
	private Species[] species;
	private EnviromentalManagementPlan[] enviMaPlan;
	
	public Wetland(String name, String locationZone, String locationType, double kmAmount, String wetlandPicture, String protectedArea){
		
		this.name = name;
		this.locationZone = locationZone;
		this.locationType = locationType;
		this.kmAmount = kmAmount;
		this.wetlandPicture = wetlandPicture;
		this.protectedArea = protectedArea;
		this.wetlandID = wetlandID;
		this.enviromentalManagementPlans = null;
		this.events = new Event[50];
		this.species = new Species[50];
		this.enviMaPlan = new EnviromentalManagementPlan[80];
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocationZone() {
		return locationZone;
	}

	public void setLocationZone(String locationZone) {
		this.locationZone = locationZone;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public double getKmAmount() {
		return kmAmount;
	}

	public void setKmAmount(double kmAmount) {
		this.kmAmount = kmAmount;
	}
	
	public String getWetlandPicture() {
		return wetlandPicture;
	}

	public void setWetlandPicture(String wetlandPicture) {
		this.wetlandPicture = wetlandPicture;
	}
	
	public String getProtectedArea() {
		return protectedArea;
	}

	public void setProtectedArea(String protectedArea) {
		this.protectedArea = protectedArea;
	}
	
	public String getWetlandID() {
		return wetlandID;
	}

	public void setWetlandID(String wetlandID) {
		this.wetlandID = wetlandID;
	}
	
	public EnviromentalManagementPlan getEnviromentalManagementPlans() {
		return enviromentalManagementPlans;
	}

	public void setEnviromentalManagementPlans(EnviromentalManagementPlan enviromentalManagementPlans) {
		this.enviromentalManagementPlans = enviromentalManagementPlans;
	}
	
	public Event[] getEvents() {
		return events;
	}

	public void setEvents(Event[] events) {
		this.events = events;
	}
	
	public Species[] getSpecies() {
		return species;
	}

	public void setSpecies(Species[] species) {
		this.species = species;
	}

	/**pre
	 *<strong>Description:</strong> the addEvent method is use to add the events that the user creates to the
	 events array.
	 *<strong>pre:</strong> this method needs the creation of a wetland.
	 *<strong>pos:</strong> N/A
	 *@param eventType <strong>String</strong> this varible is used to choose the type of the event.
	 *@param date <strong>int</strong> this varible is used save the date in which the event will take place.
	 *@param eventOwner <strong>String</strong> this varible is used to save the owner of the event.
	 *@param eventValue <strong>double</strong> this varible is used to save the cost that the event will have.
	 *@param eventDescription <strong>String</strong> this varible is used to save a desription of the event.
	 *@return stopFlag <strong>boolean</strong> this value returns a true boolean that indicates that the method 
	 ends its funcion.
	 *pre
	*/
	
	public boolean addEvent(String eventType, int date, String eventOwner, double eventValue, String eventDescription) {
		
		boolean stopFlag = false;
		
		Event myEvent = new Event(eventType, date, eventOwner, eventValue, eventDescription);
		
		events[count] = myEvent;
		
		count++;
		
		stopFlag = true;
		
		return stopFlag;
	}
	
	/**pre
	 *<strong>Description:</strong> the addSpecies method is used to add the species that the user creates to the
	 species array.
	 *<strong>pre:</strong> this method needs the creation of a wetland.
	 *<strong>pos:</strong> N/A
	 *@param name <strong>String</strong> this varible is used save the name of the species.
	 *@param scientificName <strong>String</strong> this variable is used top save the scientific name of the species.
	 *@param migratorySpecies <strong>String</strong> this varible is used to save if the species is migratory or not.
	 *@param speciesType <strong>int</strong> this varible is used to save the type of the species.
	 *@param faunaOrFlora <strong>String</strong> this varible is used to save if the species belongs to fauna or to flora.
	 *@return stopFlag <strong>boolean</strong> this value returns a true boolean that indicates that the method 
	 ends its funcion.
	 *pre
	*/
	
	public boolean addSpecies(String name, String scientificName, String migratorySpecies, int speciesType, String faunaOrFlora){

		boolean stopFlag = false;
		
		Species mySpecies = new Species(name, scientificName, migratorySpecies, speciesType, faunaOrFlora);
		
		species[count] = mySpecies;
		
		count++;
		
		stopFlag = true;
		
		return stopFlag;
	
	}
	
	/**pre
	 *<strong>Description:</strong> the addEnviromentalManagementPlan method is used to add the enviromental plan
	 to the enviMaPlan array.
	 *<strong>pre:</strong> this method needs the creation of a wetland.
	 *<strong>pos:</strong> N/A
	 *@param havePlan <strong>String</strong> this varible is used to save if the wetland have a plan or not.
	 *@param compliancePercentage <strong>double</strong> this variable is used to save the compliance percentage that the plan have.
	 *@return stopFlag <strong>boolean</strong> this value returns a true boolean that indicates that the method 
	 ends its funcion.
	 *pre
	*/
	
	public boolean addEnviromentalManagementPlan(int havePlan, double compliancePercentage){
	
		boolean stopFlag = false;
		
		EnviromentalManagementPlan myEnviromentalManagementPlan = new EnviromentalManagementPlan(havePlan, compliancePercentage);
		
		enviMaPlan[count] = myEnviromentalManagementPlan;
		
		count++;
		
		stopFlag = true;
		
		return stopFlag;
	
	}
	
	/**pre
	 *<strong>Description:</strong> the showSpecies method is use to show to the user the species that he/she already
	  entered in the program.
	 *<strong>pre:</strong> this method needs the creation of a wetland.
	 *<strong>pre:</strong> this method needs the creation of a species.
	 *<strong>pos:</strong> N/A
	 *@return msg <strong>String</strong> this variable is use to save the message that the user will see in the program.
	 *pre
	*/
	
	public String showSpecies() {

		String msg = "";

		for (int i = 0; i < species.length; i++) {

			if (species[i] != null) {

				msg += "\n" + species[i].toString();
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
	
	public String showEvents() {

		String msg = "";

		for (int i = 0; i < events.length; i++) {

			if (events[i] != null) {

				msg += "\n" + events[i].toString();
			}
		}

		return msg;

	}	

	@Override
	public String toString() {
		
		String msg = "";
		int countMammal = 0;
		int countAquaticSpecies = 0;
		int countLandSpecies = 0;
		int countAquatic = 0;
		int countBird = 0;
		
		msg = "\nWetland info:\n\nName: " + name + "\nLocation: " + locationZone + "\nLocation type: " + locationType + "\nURL of the wetland picture: " 
		+ wetlandPicture + "\nKm2 of the wetland: " + kmAmount + "\nIs a protected area?: " + protectedArea + "\n";
		
		for (int i=0; i<species.length; i++){
			
			if (species[i]==null){
				
			}else{
				
				if(species[i].getSpeciesType().equals(Type.MAMMAL)){
					countMammal++;
				}else if(species[i].getSpeciesType().equals(Type.BIRD)){
					countBird++;
				}else if(species[i].getSpeciesType().equals(Type.AQUATIC)){
					countAquatic++;
				}else if(species[i].getSpeciesType().equals(Type.LAND_SPECIES)){
					countLandSpecies++;
				}else if(species[i].getSpeciesType().equals(Type.AQUATIC_SPECIES)){
					countAquaticSpecies++;
				}
				msg+= "\n" + species[i].toString();
			}
		}
		
		msg+= "\n" + "Total species per type:\n" + "\nFauna:\nMammal: " + countMammal + "\nBird: " + countBird + "\nAquatic: " + countAquatic +
				"\n\nFlora:\nLand species: " + countLandSpecies + "\nAquatic species: " + countAquaticSpecies + "\n";
		
		return msg;
	}

}

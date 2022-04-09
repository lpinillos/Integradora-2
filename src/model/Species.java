package model;

public class Species {
	
	private String name;
	private String scientificName;
	private String migratorySpecies;
	private Type speciesType;
	private String faunaOrFlora;
	
	public Species(String name, String scientificName, String migratorySpecies, int speciesType, String faunaOrFlora){
		
		this.name = name;
		this.scientificName = scientificName;
		this.migratorySpecies = migratorySpecies;
		this.faunaOrFlora = faunaOrFlora;
		
		switch(speciesType){
			
			case 1: 
				this.speciesType = Type.LAND_SPECIES;
				break;
			case 2: 
				this.speciesType = Type.AQUATIC_SPECIES;
				break;
			case 3: 
				this.speciesType = Type.BIRD;
				break;
			case 4:
				this.speciesType = Type.MAMMAL;
				break;
			case 5:
				this.speciesType = Type.AQUATIC;
				break;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public String getMigratorySpecies() {
		return migratorySpecies;
	}

	public void setMigratorySpecies(String migratorySpecies) {
		this.migratorySpecies = migratorySpecies;
	}

	public Type getSpeciesType() {
		return speciesType;
	}

	public void setSpeciesType(Type speciesType) {
		this.speciesType = speciesType;
	}
	
	public String getFaunaOrFlora() {
		return faunaOrFlora;
	}

	public void setFaunaOrFlora(String faunaOrFlora) {
		this.faunaOrFlora = faunaOrFlora;
	}
	@Override
	public String toString() {
		
		String msg = "";
		
		msg = "\nSpecies name: " + name + "\nScientific name of the species: " + scientificName + "\nThis species correspond to: " + faunaOrFlora + "\nIs a migratory species? " + migratorySpecies + 
		"\nType of this species: " + speciesType + "\n";
		
		return msg;
	}
}

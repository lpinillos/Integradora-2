package model;

public class Event {
	
	private String eventType;
	private int date;
	private String eventOwner;
	private double eventValue;
	private String eventDescription;
	
	public Event(String eventType, int date, String eventOwner, double eventValue, String eventDescription){
		
		this.eventType = eventType;
		this.date = date;
		this.eventOwner = eventOwner;
		this.eventValue = eventValue;
		this.eventDescription = eventDescription;
		
	}
	
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String EventType) {
		this.eventType = eventType;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getEventOwner() {
		return eventOwner;
	}

	public void setEventOwner(String eventOwner) {
		this.eventOwner = eventOwner;
	}

	public double getEventValue() {
		return eventValue;
	}

	public void setEventValue(double eventValue) {
		this.eventValue = eventValue;
	}
	
	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	@Override
	public String toString() {
		
		String msg = "";
		
		msg = "Event: " + eventType + "\nDate of the event: " + date + "\nthe owner of the event is: " + eventOwner + "\nThe total value of the event is: "
		+ eventValue + "$\nDescription: " + eventDescription + "\n";
		
		return msg;
	}
}

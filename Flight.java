package com.satish.collectionsapps;

public class Flight {
	
	int flightId;
	String flightName;
	String source;
	String destination;
	
	public Flight(int flightId, String flightName, String source, String destination) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", source=" + source + ", destination="
				+ destination + "]";
	}
	
	

}

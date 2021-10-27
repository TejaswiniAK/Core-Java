package com.xworkz.dp.dto;

public class ParkDTO {

	private String parkName;
	private String location;
	private String timings;
	private int noOfBenches;
	private String holiday;
	private boolean gymInstupents;
	private boolean temple;
	
	public ParkDTO() {
		System.out.println("Invoked No-argument constructor");
	}

	public ParkDTO(String parkName, String location, String timings, int noOfBenches, String holiday,
			boolean gymInstupents, boolean temple) {
		super();
		this.parkName = parkName;
		this.location = location;
		this.timings = timings;
		this.noOfBenches = noOfBenches;
		this.holiday = holiday;
		this.gymInstupents = gymInstupents;
		this.temple = temple;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public int getNoOfBenches() {
		return noOfBenches;
	}

	public void setNoOfBenches(int noOfBenches) {
		this.noOfBenches = noOfBenches;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public boolean isGymInstupents() {
		return gymInstupents;
	}

	public void setGymInstupents(boolean gymInstupents) {
		this.gymInstupents = gymInstupents;
	}

	public boolean isTemple() {
		return temple;
	}

	public void setTemple(boolean temple) {
		this.temple = temple;
	}
	
	
}

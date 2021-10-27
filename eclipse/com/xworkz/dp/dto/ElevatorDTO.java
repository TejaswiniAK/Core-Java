package com.xworkz.dp.dto;

public class ElevatorDTO {
	
	private boolean cardAccess;
	private int elevatorButtons;
	private boolean doorSenores;
	private boolean doorRestraints;
	private boolean safetyBrackes;
	private String elevatorType;
	private String elevatorFor;
	
	public ElevatorDTO() {
		System.out.println("Invoked No-argument constructor");
	}

	public ElevatorDTO(boolean cardAccess, int elevatorButtons, boolean doorSenores, boolean doorRestraints,
			boolean safetyBrackes, String elevatorType, String elevatorFor) {
		super();
		this.cardAccess = cardAccess;
		this.elevatorButtons = elevatorButtons;
		this.doorSenores = doorSenores;
		this.doorRestraints = doorRestraints;
		this.safetyBrackes = safetyBrackes;
		this.elevatorType = elevatorType;
		this.elevatorFor = elevatorFor;
	}

	public boolean isCardAccess() {
		return cardAccess;
	}

	public void setCardAccess(boolean cardAccess) {
		this.cardAccess = cardAccess;
	}

	public int getElevatorButtons() {
		return elevatorButtons;
	}

	public void setElevatorButtons(int elevatorButtons) {
		this.elevatorButtons = elevatorButtons;
	}

	public boolean isDoorSenores() {
		return doorSenores;
	}

	public void setDoorSenores(boolean doorSenores) {
		this.doorSenores = doorSenores;
	}

	public boolean isDoorRestraints() {
		return doorRestraints;
	}

	public void setDoorRestraints(boolean doorRestraints) {
		this.doorRestraints = doorRestraints;
	}

	public boolean isSafetyBrackes() {
		return safetyBrackes;
	}

	public void setSafetyBrackes(boolean safetyBrackes) {
		this.safetyBrackes = safetyBrackes;
	}

	public String getElevatorType() {
		return elevatorType;
	}

	public void setElevatorType(String elevatorType) {
		this.elevatorType = elevatorType;
	}

	public String getElevatorFor() {
		return elevatorFor;
	}

	public void setElevatorFor(String elevatorFor) {
		this.elevatorFor = elevatorFor;
	}

	
}

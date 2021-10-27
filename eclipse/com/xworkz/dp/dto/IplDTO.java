package com.xworkz.dp.dto;

public class IplDTO {

	private String teamName;
	private int teamSize;
	private String owner;
	private String sponsor;
	
	public IplDTO() {
		System.out.println("IplDTO no-arg constructor is invoked");
		System.out.println();
	}

	public IplDTO(String teamName, int teamSize, String owner, String sponsor) {
		super();
		this.teamName = teamName;
		this.teamSize = teamSize;
		this.owner = owner;
		this.sponsor = sponsor;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	
	
}

package com.xworkz.bridge.busroutedata.dao;

import com.xworkz.bridge.busroutedata.dto.BusRouteDTO;

public class ArrayBusRouteDAO implements BusRouteDAO {

	BusRouteDTO[] dtos = new BusRouteDTO[5];
	int counter = 0;

	@Override
	public void save(BusRouteDTO busRouteDTO) {
		System.out.println("Invoked over-ride save method");
		if (busRouteDTO != null) {
			System.out.println("busRouterDTO is checked...");
			this.dtos[this.counter++] = busRouteDTO;
			System.out.println(busRouteDTO.getId());
		} else {
			System.err.println("busRouterDTO is null ");
		}
	}

	@Override
	public void update(BusRouteDTO busRouteDTO) {
		System.out.println("Invoked over-ride update method");
		if (busRouteDTO != null && counter >= 0 && counter < dtos.length) {
			System.out.println("Checked...");
			this.dtos[this.counter] = busRouteDTO;
			System.out.println(busRouteDTO.getId());
			this.counter++;
		} else {
			System.err.println("Array is full OR busRouterDTO is null");
		}

	}

	@Override
	public void update(BusRouteDTO busRouteDTO, int index) {
		System.out.println("Invoked over-ride update method at an index");
		if (busRouteDTO != null && index >= 0 && index < dtos.length) {
			System.out.println("Checked at an index...");
			this.dtos[index] = busRouteDTO;
			System.out.println(busRouteDTO.getId());
			this.counter++;
		} else {
			System.err.println("Array is full OR busRouterDTO is null OR index is out of an array");
		}

	}

	@Override
	public int delete(int index) {
		System.out.println("Invoked over-ride delete method");
		if (index >= 0 && index < dtos.length) {
			System.out.println("Deleting process...");
			this.dtos[index] = null;
			System.out.println("Deleted at an index of ".concat(String.valueOf(index)));
		} else {
			System.err.println("Not deleted");
		}
		return -1;
	}

	@Override
	public String findByID(BusRouteDTO busRouteDTO) {
		System.out.println("Invoked over-ride findByID method");
		if (busRouteDTO != null) {
			for (int j = 0; j < dtos.length; j++) {
				String findID = dtos[j].getId();
				if (busRouteDTO.equals(findID)) {
					System.out.println("Found Bus ID".concat(findID));
				} else {
					System.err.println("Id not found");
				}
			}
		} else {
			System.err.println("busRouterDTO is null");
		}
		return null;
	}

	@Override
	public void displayDetails() {
		System.out.println("Invoked over-ride displayDetails method");
		for (int i = 0; i < dtos.length; i++) {
			BusRouteDTO ref = dtos[i];
			if (ref != null) {
				System.out.println(ref.getId());
				System.out.println(ref.getStartPoint());
				System.out.println(ref.getDestination());
				System.out.println(ref.getDriverName());
			}
		}
	}

}

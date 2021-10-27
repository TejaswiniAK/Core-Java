package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MovieDTO;

public class MovieDAO {

	private MovieDTO[] movieDTOs=new MovieDTO[10];
	private int count=0;
	
	public void save(MovieDTO dto) {
		if(dto!=null && this.count<this.movieDTOs.length && this.count>=0) {
			this.movieDTOs[this.count++]=dto;
			System.out.println("The added names are: ".concat(dto.getActor()));
		}else {
			System.err.println("Array is full or dto pointing to null");
		}
	}
	
	public void create(int index, MovieDTO dto) {
		if(dto!=null && index<this.movieDTOs.length && index>=0) {
			this.movieDTOs[index]=dto;
			System.out.println("The added names are: ".concat(String.valueOf(index)).concat(" and ").concat(dto.getActor()));
		}else {
			System.err.println("Array is full or dto pointing to null");
		}
	}
	
	public int indexOccupied() {
		return this.count;
	}
	
	public boolean matching(String name) {
		
		for(int i=0;i<movieDTOs.length;i++) {
			MovieDTO ref=movieDTOs[i];
			
			if(ref!=null) {
				System.out.println("ref is".concat(String.valueOf(i)));
				String tempTime=ref.getActor();
				System.out.println(tempTime);
				if(tempTime.equals(name)) {
					System.out.println("Time found");
					return true;
				}
			}
		}
		return false;
	}
	
	
}

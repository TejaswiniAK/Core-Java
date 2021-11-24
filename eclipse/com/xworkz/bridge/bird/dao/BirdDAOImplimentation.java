package com.xworkz.bridge.bird.dao;

import com.xworkz.bridge.bird.dto.BirdDTO;

public class BirdDAOImplimentation implements BirdDAO {

	BirdDTO[] dtos = new BirdDTO[10];
	int counter = 0;
	
	public BirdDTO[] getDtos() {
		return dtos;
	}

	@Override
	public void save(BirdDTO birdDTO) {

		System.out.println("Invoked over-ride save method");
		if (birdDTO != null) {
			System.out.println("birdDTO is checked");
			System.out.println("counter= ".concat(String.valueOf(this.counter)));
			this.dtos[this.counter++] = birdDTO;
			System.out.println(birdDTO.getId());
		} else {
			System.out.println("birdDTO is null or Array is full");
		}
	}

	@Override
	public void delete(int index) {
		System.out.println("Invoked over-ride delete method");
		if (index >= 0 && index < dtos.length) {
			this.dtos[index] = null;
			System.out.println("deleted at the index ".concat(String.valueOf(index)));
		} else {
			System.err.println("Array not deleted");
		}

	}

	@Override
	public BirdDTO findById(String name) {
		System.out.println("Invoked over-ride findByName method");
		if (name != null) {
			System.out.println("name is checked...");
			for (int i = 0; i < dtos.length; i++) {
				BirdDTO find = dtos[i];
				if (find != null) {
					String match = find.getId();
					if (match.equals(name)) {
						System.out.println("Id matched");
					} else {
						System.err.println("Id not matched");
					}
				}
			}
		}
		return null;
	}

	@Override
	public void displayAllDetails() {
		System.out.println("Invoked over-ride displayAllDetails");
		for (int i = 0; i < dtos.length; i++) {
			BirdDTO ref = this.dtos[i];
			if (ref != null) {
				String ids = ref.getId();
				boolean breeds = ref.isBreed();
				int ages = ref.getAge();
				String origin = ref.getOrigin();
				boolean canFly = ref.isCanFly();

				System.out.println("~~~   ~~~   ~~~   ~~~   ~~~");
				System.out.println(ids);
				System.out.println(breeds);
				System.out.println(ages);
				System.out.println(origin);
				System.out.println(canFly);
				//System.out.println("~~~   ~~~   ~~~   ~~~   ~~~");
			}
		}
	}

}

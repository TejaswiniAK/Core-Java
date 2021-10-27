package com.xworkz.dp.dto;

public class TempleDTO {

		private String name;
		private String location;
		private String mainGod;
		private boolean prasada;
		private String yestgante;
		
		public TempleDTO() {
			System.out.println("Invoke TempleDTO is invoked");
		}

		public TempleDTO(String name, String location, String mainGod, boolean prasada, String yestgante) {
			super();
			this.name = name;
			this.location = location;
			this.mainGod = mainGod;
			this.prasada = prasada;
			this.yestgante = yestgante;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getMainGod() {
			return mainGod;
		}

		public void setMainGod(String mainGod) {
			this.mainGod = mainGod;
		}

		public boolean isPrasada() {
			return prasada;
		}

		public void setPrasada(boolean prasada) {
			this.prasada = prasada;
		}

		public String getYestgante() {
			return yestgante;
		}

		public void setYestgante(String yestgante) {
			this.yestgante = yestgante;
		}

}

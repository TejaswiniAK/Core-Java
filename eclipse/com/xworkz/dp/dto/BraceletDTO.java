package com.xworkz.dp.dto;

public class BraceletDTO {

		private float price;
		private String color;
		private String material;
		private boolean gemUsed;
		private boolean gifted;

		public BraceletDTO() {
			System.out.println("No-arg construtor invoked");
		}

		public BraceletDTO(float price, String color, String material, boolean gemUsed, boolean gifted) {
			super();
			this.price = price;
			this.color = color;
			this.material = material;
			this.gemUsed = gemUsed;
			this.gifted = gifted;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public boolean isGemUsed() {
			return gemUsed;
		}

		public void setGemUsed(boolean gemUsed) {
			this.gemUsed = gemUsed;
		}

		public boolean isGifted() {
			return gifted;
		}

		public void setGifted(boolean gifted) {
			this.gifted = gifted;
		}


}

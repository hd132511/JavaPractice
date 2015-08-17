package org.dimigo.inheritance;

public class Circle extends Figure{

	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
		// TODO Auto-generated constructor stub
		
		public int radius;
	
		public Circle(int radius) {
			super(0,0);
			this.radius = radius;
		
	}
		
		protected double calcArea() {
			return Math.PI * (double)radius * (double)radius;
		}

}

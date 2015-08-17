package org.dimigo.inheritance;

public class Rectangle extends Figure{
	
	public int width;
	public int height;
	
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
		// TODO Auto-generated constructor stub
	
		public Rectangle(int width, int height) {
			super(0,0);
			this.width = width;
			this.height = height;
		
	}
		
		protected double calcArea() {
			return (double)height * (double)width;
		}

	
}

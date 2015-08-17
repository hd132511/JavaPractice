package org.dimigo.inheritance;

public class Triangle extends Figure{

	public int width;
	public int height;
	
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
		// TODO Auto-generated constructor stub
	
		public Triangle(int width, int height) {
			super(0,0);
			this.width = width;
			this.height = height;
		
	}
		
		protected double calcArea() {
			return 0.5 * (double)height * (double)width;
		}
		
		protected void printCenter() {
			System.out.println("삼각형의 중심좌표");
			super.printCenter();
			}

}

package com.JavaBasics.Oops.Encapsulation;
class Area{
	private float length;
	private float breadth;
	
	public void setlength(float length) {
		this.length=length;
	}
	public void setbreadth(float breadth) {
		this.breadth=breadth;
	}
	public float getlength() {
		return this.length;
	}
	
	public float getbreadth() {
	     return this.breadth;
	}
	
}
public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area=new Area();
		area.setlength(5.2f);
		area.setbreadth(5.2f);
		System.out.println("Area of square is :- "+ area.getlength() * area.getbreadth());
	}

}

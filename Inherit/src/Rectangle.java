
public class Rectangle extends Shape{
	private int Width,height;

	public int getWidth() {	return Width;	}
	public void setWidth(int width) {	Width = width;	}
	public int getHeight() {return height;	}
	public void setHeight(int height) {	this.height = height;}
	
	double area() {
		return (double)Width*height;
	}
	void draw(){
		System.out.println("("+this.getX()+","+this.getY()+") 좌표에 가로 :"+this.Width+"세로 : "+this.height);
		System.out.println("면적 : "+this.area());
	}
}


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
		System.out.println("("+this.getX()+","+this.getY()+") ��ǥ�� ���� :"+this.Width+"���� : "+this.height);
		System.out.println("���� : "+this.area());
	}
}

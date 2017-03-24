
public class MainClass_Liskov {
	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.setWidth(10);
		obj.setHeight(12);
		System.out.println("Area Of Rectangle :"+obj.getArea());
		Square obj1=new Square();
		obj1.setSize(5);
		System.out.println("Size Of Square :"+obj1.getArea());
		
	}
}

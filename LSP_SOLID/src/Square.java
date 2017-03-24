
public class Square extends Shape {
	private int size;
	public int getWidth() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	@Override
	int getArea() {
		// TODO Auto-generated method stub
		return size*size;
	}

}

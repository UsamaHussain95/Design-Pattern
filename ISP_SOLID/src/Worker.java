public class Worker implements IWorkable,IFeedable{
	public void work() {
		System.out.println("I Can Work");
	}

	public void eat() {
		System.out.println("I Can Eat also");
	}
}

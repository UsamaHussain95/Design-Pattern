
public class MainClass_DIP {
	public static void main(String[] args)
	{
		IWorker workerObj=new Worker();
		Manager managerObj=new Manager();
		managerObj.setWorker(workerObj);
		managerObj.manage();
	}
}

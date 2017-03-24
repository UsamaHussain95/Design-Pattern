
public class MainClass_ISP {
	public static void main(String[] args)
	{
		IWorkable workerObj=new Worker();
		IFeedable feederObj=new Worker();
		Manager managerObj=new Manager();
		managerObj.setWorker(workerObj);
		managerObj.manage();
		feederObj.eat();
	}
}

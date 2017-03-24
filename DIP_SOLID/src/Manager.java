
public class Manager {
	IWorker work;
	public void setWorker(IWorker work_)
	{
		work=work_;
	}
	public void manage()
	{
		work.work();
	}
}

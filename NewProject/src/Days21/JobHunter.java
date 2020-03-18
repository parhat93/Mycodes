package Days21;

public class JobHunter {

	public static void main(String[] args) {

		job job1 = new job();
		job1.printJobDetail();
		System.out.println("===================");
		job job2 = new job("SDET",125000);
		job2.printJobDetail();
		System.out.println("===================");
		job job3 = new job("Senior Automation Engineer",145000,"Fairfax");
		job3.printJobDetail();
		System.out.println("====================");
		job.isRemote = true;
		job1.printJobDetail();
		job2.printJobDetail();
		job3.printJobDetail();
	}
	

}

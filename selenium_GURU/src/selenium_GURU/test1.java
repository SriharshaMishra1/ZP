package selenium_GURU;

public class test1 {

	int eid;
	String sname;
	
	test1(int eid,String sname)
	{
		this.eid=eid;
		this.sname=sname;
		
	}
	
	void shyam()
	{
		System.out.println(eid);
		System.out.println(sname);
	}
	
public static void main(String[] args) {
	
	test1 t=new test1(8, "sriharsha");
	t.shyam();
	
			
}	
	
	
}

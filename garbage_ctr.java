package jun14_gc;

public class garbage_ctr {
	
	int no;
	String name;
	
	public void finalize()
	{
		System.out.println("Object is getting garbage collected");
	}

	public static void main(String[] argv)
	{
		System.out.println("In the main");
		
		garbage_ctr G1 = new garbage_ctr();
		
		garbage_ctr G2 = new garbage_ctr();
		
		G1 = null;
		G2 = null;
		System.gc();
	}
}


public class SampleClass {
	private String name;
	public SampleClass()
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String a)
	{
		name=a;
	}
	public static void main(String[] args) {
		
		SampleClass abc=new SampleClass();
		abc.setname("karthick");
		System.out.println(abc.getname());
	}

}

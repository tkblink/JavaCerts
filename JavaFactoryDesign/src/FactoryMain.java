import com.phone.*;
public class FactoryMain 
{
	public static void main(String[] args) 
	{
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("Open");
		OS obj2 = osf.getInstance("Closed");
		OS obj3 = osf.getInstance("Noob");
		obj.spec();
		obj2.spec();
		obj3.spec();
	}
}

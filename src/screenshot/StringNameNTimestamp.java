package screenshot;

import java.util.Date;

import net.bytebuddy.utility.RandomString;

public class StringNameNTimestamp {
	
	public static void main(String[] args) {

	//string name	
		String name = RandomString.make(6);
		System.out.println(name);
	
	//timestamp
		
		Date d=new Date();
		String timestamp = d.toString().replace(' ','_').replace(':','_');
		System.out.println(timestamp);
	}
}

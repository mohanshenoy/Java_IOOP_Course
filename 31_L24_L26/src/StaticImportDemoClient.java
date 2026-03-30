//import java.lang.Math;
//import static java.lang.Math.sqrt;
import static java.lang.Math.*;

import static edu.manipal.services.common.StaticImportDemoClass.*;

public class StaticImportDemoClient {

	public static void main(String[] args) {
		//System.out.println(Math.sqrt(16));
		System.out.println(sqrt(16));
		System.out.println(pow(2.0,3.0));
		
		System.out.println(staticIntVar);
		myStaticMethod();
		
	}

}


public class TestClient14 {

	public static void main(String[] args) {
		{
			int iTemp = 10;
			{
			int iTemp = 20;
			{
			int iTemp = 30;
			System.out.print("Value of iTemp is "+iTemp);	
			}
			System.out.print(" "+ iTemp);	
			}
			System.out.print(" "+ iTemp);	
			}

	}

}

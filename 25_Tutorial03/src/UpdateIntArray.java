
public class UpdateIntArray {

	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5};
		int j=0;
		for (int arr : intArray) {
			intArray[j]=arr*2;
			++j;
		}
		for (int i : intArray) {
			System.out.println(i);
		}

	}

}

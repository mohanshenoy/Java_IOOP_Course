package package1;

class Test {
	public int a; // default access
	public int b; // public access
	private int c; // private access

	public void setC(int i) { // set c's value
		c = i;
	}
	public int getC() { // get c's value
		return c;
	}
}

class AppendDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(40);
		int a = 42;
		String s = sb.append("a = ").append(a).append("!").toString();
		System.out.println(s);
	}
}
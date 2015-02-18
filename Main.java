public class Main{
	public static void main(String[] args){
		Counter c1 = new Counter();
		c1.click();
		c1.click();

		Counter c2 = new Counter();
		c2.click();
		Counter c3 = c2.add(c1);	//c3=>3, c1=>2, c2=>1

		System.out.println(c3.getVal());
	}
}
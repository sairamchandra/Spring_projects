package Factorypat;

public class PremiumUser implements Netflix {

	@Override
	public void usertype() {
		System.out.println("I am premium user");
	}

	@Override
	public void price() {
		System.out.println("1000");
	}
}

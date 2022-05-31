package Factorypat;

public class factoryProcess {
	public Netflix getInstance(String usertype) {
		if(usertype.equals("1")) {
			return new NormalUser();
		}
		else if(usertype.equals("2"))
			return new PremiumUser() ;
		else 
			return new Error();

	}
}

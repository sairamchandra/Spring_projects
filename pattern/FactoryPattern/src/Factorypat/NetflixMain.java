package Factorypat;

import java.util.Scanner;

public class NetflixMain {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		factoryProcess f1= new factoryProcess();
		System.out.println("Press (1) ---for Normal User");
		System.out.println("Press (2) ---for Normal User");
		System.out.println("please enter Your Answer :");
		Netflix n1=f1.getInstance(sc.nextLine());
		n1.usertype();
		n1.price();
	}

}

package com.shoppingmal;

import org.springframework.stereotype.Component;

@Component
public class Max implements Mall {
public void shop() {
	System.out.println("i am maxshopping mall");
}
}

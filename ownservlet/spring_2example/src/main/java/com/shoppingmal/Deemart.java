package com.shoppingmal;

import org.springframework.stereotype.Component;

@Component
public class Deemart implements Mall{
public void shop() {
	System.out.println("i am deemart");
}
}

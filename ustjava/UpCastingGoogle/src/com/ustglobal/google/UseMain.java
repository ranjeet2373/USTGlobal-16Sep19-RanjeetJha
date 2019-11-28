package com.ustglobal.google;

public class UseMain {
	public static void main(String[] args) {
		Browser b = new Browser();
		Google g = new Gmail();
		Google gd = new GoogleDrive();
		b.open(g);
		System.out.println("***********");
		b.open(gd);
	}

}

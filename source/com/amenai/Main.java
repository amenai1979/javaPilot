package com.amenai;
//import System.out.println;
public class Main {

    public static void main(String[] args) {
	// write your code here
	//System.out.println("Hello World!");
	CommonPerformanceElement c = new CommonPerformanceElement();
	System.out.println(c.getAltitudeFt());
	c = new CommonPerformanceElement(25,2350,125,1300,14);
	System.out.println(c.getAltitudeFt());
    }
}

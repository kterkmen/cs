import java.io.*;
/*
 * This file is code written to test the IntNode class and the methods contained within it
 */
public class IntNodeTest{
	

public static void main(String args[]) {
	//test default constructor
	IntNode head = new IntNode(); 
	
	
	IntNode tail = new IntNode(42, null); 
	//test getters 
	/*
	    System.out.println("Testing head.getData()");
		System.out.println(head.getData());
		System.out.println("Testing head.getLink()");
		System.out.println(head.getLink());
		System.out.println("Testing tail.getData()");
		System.out.println(tail.getData());
		System.out.println("Testing tail.getLink()");
		System.out.println(tail.getLink());	
		System.out.println(head.toString());*/
	
	   head.setLink(tail); 
	   head.setData(11); 
	   tail.setData(99);
	   
	   System.out.println("Output string created by toString()");
	   System.out.println(head.toString());
	   
	   //test addNodeAfterThis
	   head.addNodeAfterThis(88); 
	   head.addNodeAfterThis(77); 
	   head.addNodeAfterThis(66); 
	   head.addNodeAfterThis(55); 
	   head.addNodeAfterThis(44); 
	   head.addNodeAfterThis(33); 
	   head.addNodeAfterThis(22); 
	  
	   //test if it worked by printing toString()
	   System.out.println("Output string created by toString()");
	   System.out.println(head.toString());
	   
	   //test removeNodeAfterThis
	   head.removeNodeAfterThis(); 
	   //test if it worked by printing toString()
	   System.out.println("Output string with node after head removed created by toString()");
	   System.out.println(head.toString());
	   
	   //test search
	   System.out.println(Boolean.toString(head.search(head,11)));
	   
	
	
}
}

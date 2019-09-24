

/**
 * 
 * @author Katie 
 * 
 * The element (integer) is stored in the node 
 * and a link points to the next node in our list
 */
public class IntNode {
	private int data; 
	private IntNode link; 
	
	/**
	 * 
	 * @param initialData 
	 * @param initialLink
	 */

	public IntNode(int initialData, IntNode initialLink) {
		
		setData(initialData); 
		setLink(initialLink); 
		
		
	}
	
	/**
	 * default constructor
	 */
	public IntNode() {
		data = 0;
		link = null;
	}


    /**
     * 
     * @return data stored in node
     */
	public int getData() {
		return this.data;
	}
	
	
	/**
	 * 
	 * @param data stores int 
	 */


	public void setData(int data) {
		this.data = data;
	}

	/**
	 * 
	 * @return link
	 */
	public IntNode getLink() {
		return this.link;
	}

	/**
	 * 
	 * @param link
	 */
	public void setLink(IntNode givenLink) {
		link = givenLink;
	}
	/*
	 * @return link which points to the next node in list
	 
	public IntNode getNextNode() {
		return this.getLink();
	}*/
	
	/**
	 * creates string of list from point of data passed into method
	 * @return 
	 */
	public String toString() {
		IntNode cursor = this; 
		String thisString = ""; 
		while(cursor != null){
		for(cursor = this; cursor != null; cursor = cursor.link) {
			thisString = thisString + Integer.toString(cursor.getData()) + "->";
			}
			
	    } return thisString;
	}
	/**
	 * 
	 * @param newdata
	 */
	public void addNodeAfterThis(int newdata) {
		IntNode newNode = new IntNode(newdata, this.getLink());
		
		this.setLink(newNode); 
		

	}
	/**
	 * remove node after given 
	 */
	public void removeNodeAfterThis() {
		link = link.link; 	
	}
	
	
    /**
     * 
     * @param head
     * @return number of nodes in the list 
     */
	
	public static int listLength(IntNode head) {
		int count = 0;
		IntNode cursor = head; 
		for(cursor = head; cursor != null; cursor = cursor.link) {
			count++;
			
		}return count;
		
	}
		
	
	/**
	 *  
	 * @param head
	 * @param data
	 * @return boolean 
	 */
	public boolean search(IntNode head, int data) {
		IntNode cursor = head; 
		while(cursor != null) {
			if(cursor.getData() == data) {
				return true;
				
			}
			
		}return false;
		
	}
    
	public static void main(String[] args) {	
		
	}
}



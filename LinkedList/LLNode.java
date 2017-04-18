
/**
 * Linked List Node, contains the 'data' and a pointer to the next Node in 
 * in sequence.
 *
 * HWardak
 */
public class LLNode {
	private String data;
	private LLNode next;
	
	public LLNode() {
		this.data = null;
		this.next = null;
	}
	public LLNode (String newData) {
		this.data = (newData);
		this.next = null;
	}
	public void updateNode (LLNode nextOne) {
		this.next = nextOne;
	}
	public String toString () {
		return  this.data;
	}
	public LLNode getNext() {
		return this.next;
	}

}

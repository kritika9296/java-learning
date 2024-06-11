
public class linkedlist2 {
    
  public class basic{
	   public static class Node{
		   int data;
			  Node next;
			  Node(int data){
				  this.data =data;
			  }
	   }
	 
	
	  
	  public static void main(String[] args) {
		  
		  Node a=new Node(10);
		  Node b=new Node(20);
		  Node c=new Node(30);
		  System.out.println(a.data);
	  }
  }
	
	
}

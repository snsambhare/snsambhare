import java.util.*;

class ReverseLinkedList
{
	Node head ; 
	
	static class Node 
	{
		int data ;
		Node next ;
		
		Node(int d)
		{
			data = d ;
			next = null;
		}
	}
	
	 static Node reverseLL( Node new_node)
	{
		Node p = null ;
		Node h = new_node ;
		Node next = null ;
		
		while(h != null)
		{
			next = h.next;
			h.next = p ;
			p = h;
			h= next; 
			
		}
		new_node = p;
		return new_node ;
		
	}
	
	static void display(Node new_node )
	{
		while(new_node != null)
		{
			System.out.println(new_node.data);
			new_node = new_node.next ;
		}
	}
	

	public static void main(String...args)
	{
		ReverseLinkedList l = new ReverseLinkedList();
		Scanner sc = new Scanner(System.in);
		
		l.head = new_node;
		
		for(int j = 1 ; j<= 10; j++)
		{
			int t = j;
			System.out.println(t);
	 
			//System.out.println("enter how namy no yo want to enter ");
			int n = sc.nextInt();
	 	
			//System.out.println(n);
			
		for(int i = 0 ; i <= n-1 ; i++)
		{
			int k = sc.nextInt();
			//System.out.println(k);
		}
	
		}
		l.reverseLL(head);
		l.display(head);
	}
}
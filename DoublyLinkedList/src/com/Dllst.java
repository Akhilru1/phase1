package com;

public class Dllst {
	
	public class Node{
		
		public String data;
		public Node prevData;
		public Node nextData;
		public Node(String data ) {
			this.data=data;
		}
	}	
		
	
	    public Node headNode,tailNode; 
		public void createNode(String data) {
			Node newNode=new Node(data);
			if(headNode==null) {
				headNode=newNode;
				tailNode=newNode;
				headNode.prevData=null;
				tailNode.nextData=null;
			}else {
				tailNode.nextData=newNode;
				newNode.prevData=tailNode;
				tailNode=newNode;
				newNode.nextData=null;
			}
		}
		public void displayNode() {
            Node currentNode = headNode;
            if(headNode == null) {
                System.out.println("Doubly Linked List is empty");
                return;
            }
            System.out.println("Nodes in Doubly Linked List: ");
            while(currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.nextData;
            }
        }
		

	public static void main(String[] args) {
		Dllst dllst=new Dllst();
		dllst.createNode("Akhil");
		dllst.createNode("abhi");
		dllst.createNode("akul");
		dllst.createNode("arun");
		dllst.createNode("anish");
		dllst.createNode("raju");
		dllst.createNode("ram");
		dllst.createNode("ayush");
		dllst.createNode("pradeep");
		dllst.createNode("ayesh");
		dllst.createNode("madhu");
		dllst.displayNode();
				

	}

}
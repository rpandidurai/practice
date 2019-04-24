package com.ennaval.tree;

public class BinaryTree {

	Node root;
	
	public void addNode(int key, String name)
	{
		addNode(new Node(key, name));
	}
	
	public void addNode(Node node)
	{
		if (root == null) 
		{
			root = node;
		}
		else
		{
			Node focusNode = root;			
			Node parent;
			
			while(true)
			{
				parent = focusNode;
				
				if (node.key < focusNode.key)
				{
					focusNode = focusNode.leftChild;
					if (focusNode == null)
					{
						parent.leftChild = node;
						return;
					}
				}
				else
				{
					focusNode = focusNode.rightChild;
					if (focusNode == null)
					{
						parent.rightChild = node;
						return;
					}
					
				}
			}
		}		
	}
	
	public void inOrderTreeTraversal()
	{
		inOrderTreeTraversal(root);
	}
	
	public void preOrderTreeTraversal()
	{
		preOrderTreeTraversal(root);
	}
	
	public void postOrderTreeTraversal()
	{
		postOrderTreeTraversal(root);
	}
	
	public void inOrderTreeTraversal(Node focusNode)
	{
		if (focusNode != null)
		{
			inOrderTreeTraversal(focusNode.leftChild);
			
			System.out.print(focusNode+" ");
			
			inOrderTreeTraversal(focusNode.rightChild);
		}
	}
	
	public void preOrderTreeTraversal(Node focusNode)
	{
		if (focusNode != null)
		{
			System.out.print(focusNode+" ");
			
			preOrderTreeTraversal(focusNode.leftChild);					
			
			preOrderTreeTraversal(focusNode.rightChild);
		}
	}
	
	public void postOrderTreeTraversal(Node focusNode)
	{
		if (focusNode != null)
		{		
			postOrderTreeTraversal(focusNode.leftChild);		
			
			postOrderTreeTraversal(focusNode.rightChild);
			
			System.out.print(focusNode+" ");
		}
	}
	
	public Node findNode(int key)
	{
		if (root != null) 
		{
			Node focusNode = root;
			
			while((focusNode != null && focusNode.key != key))
			{
				if (key < focusNode.key)
				{
					focusNode = focusNode.leftChild;
				}
				else
				{
					focusNode = focusNode.rightChild;
				}
			}
			return focusNode;
			
		}
		else
			return null;
	}
	
	public boolean remove(int key)
	{
		Node focusNode = null;// = findNode(key);
		Node parent = null;
		boolean isLeftChild = true;
		
		if (root != null) 
		{
			focusNode = root;
			
			while((focusNode != null && focusNode.key != key))
			{
				parent = focusNode;
				
				if (key < focusNode.key)
				{
					isLeftChild = true;
					focusNode = focusNode.leftChild;
				}
				else
				{
					isLeftChild = false;
					focusNode = focusNode.rightChild;
				}
			}
//			replacementNode = focusNode;			
		}
		else
			focusNode =  null;
		
		if (focusNode != null)
		{
			if (focusNode.leftChild == null && focusNode.rightChild == null)
			{
				if (focusNode == root)
					root = null;
				else if (isLeftChild)
					parent.leftChild = null;
				else
					parent.rightChild = null;
			}
			else if (focusNode.rightChild == null)
			{
				if (focusNode == root)
					root = root.leftChild;
				else if (isLeftChild)
					parent.leftChild = focusNode.leftChild;
				else
					parent.rightChild = focusNode.leftChild;
				
			}
			else if (focusNode.leftChild == null)
			{
				if (focusNode == root)
					root = root.rightChild;
				else if (isLeftChild)
					parent.leftChild = focusNode.rightChild;
				else
					parent.rightChild = focusNode.rightChild;
				
			}
			
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		BinaryTree b1 = new BinaryTree();
		
		
		  b1.addNode(25, "Pandidurai"); b1.addNode(15, "Pandidurai"); b1.addNode(10,
		  "Pandidurai"); b1.addNode(4, "Pandidurai"); b1.addNode(12, "Pandidurai");
		  b1.addNode(22, "Pandidurai"); b1.addNode(18, "Pandidurai"); b1.addNode(24,
		  "Pandidurai"); b1.addNode(50, "Pandidurai"); b1.addNode(35, "Pandidurai");
		  b1.addNode(31, "Pandidurai"); b1.addNode(44, "Pandidurai"); b1.addNode(70,
		  "Pandidurai"); b1.addNode(66, "Pandidurai"); b1.addNode(90, "Pandidurai");
		 
		
//		b1.addNode(50, "Pandidurai");
//		b1.addNode(25, "Pandidurai");
//		b1.addNode(15, "Pandidurai");
//		b1.addNode(30, "Pandidurai");
//		b1.addNode(75, "Pandidurai");
//		b1.addNode(85, "Pandidurai");
		
		  System.out.println(b1.findNode(25));
		  
		b1.inOrderTreeTraversal(b1.root);
		System.out.println();
		b1.preOrderTreeTraversal(b1.root);
		System.out.println();
		b1.postOrderTreeTraversal(b1.root);
//		System.out.println(b1);
		
		
	}
}

class Node
{
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key, String name)
	{
		this.key = key;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return key+"";
	}
}
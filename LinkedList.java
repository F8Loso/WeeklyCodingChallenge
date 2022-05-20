package com.revature;

import java.util.List;

public class LinkedList {

	Node head;

	// method to insert data for LinkedList
	public void insert(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		// Checks for first object in List
		if (head == null) {
			head = node;
		}

		else {
			// Creates a head node if no first node exist
			Node n = head;
			while (n.next != null) {
				// jumps to the next node
				n = n.next;
			}
			n.next = node;

		}

	}

	// prints content of double linked list
	public void display(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public void show() {

		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	public Node reverseInsert(Node node) {

		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

//	class ListNode {
//		int val;
//		ListNode next;
//
//		ListNode() {
//		}
//
//		ListNode(int val) {
//			this.val = val;
//		}
//
//		ListNode(int val, ListNode next) {
//			this.val = val;
//			this.next = next;
//		}

	public Node addTwoNumbers(Node l1, Node l2) {
		l1 = this.reverseInsert(l1);
		l2 = this.reverseInsert(l2);

		Node testHead = null;
		Node prev = null;
		int sum, c = 0;

		while (l1 != null || l2 != null) {
			sum = c + (l1 != null ? l1.data : 0) + (l2 != null ? l2.data : 0);

			c = sum / 10;

			Node node = getNewNode(sum % 10);
			if (testHead == null) {
				testHead = node;

			} else {
				prev.next = node;
			}

			if (l1 != null) {
				l1 = l1.next;
			}
		   if(l2 != null) {
			   l2 = l2.next;
		   }
		
		}
		if(c != 0 ) {
			prev.next = getNewNode(c);
			
		}
		testHead = this.reverseInsert(testHead);
		return testHead;
	}

	private Node getNewNode(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public Node insert(int i, Node head1) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

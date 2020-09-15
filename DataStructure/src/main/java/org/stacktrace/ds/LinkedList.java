package org.stacktrace.ds;

public class LinkedList {

	Node head;

	public void insert(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == node) {

		} else {
			Node n = head;

			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void show() {
		Node node = head;

		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}

	}
}

package com.vbiso.basic.algorithm.linked;

import java.util.Objects;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 5:55 PM 2019/1/31
 * @Modified By:
 */
public class SinglyLinkedList {

  private Node head;

  private int count;

  public void insertHead(Object obj) {
    Node node = new Node(obj);
    node.next = head;
    head = node;
    ++count;
  }

  public void insertNth(Object obj, int position) {
    if (position < 0 || position > count) {
      throw new RuntimeException("position less than zero or position more than the count of list");
    }
    Node node = new Node(obj);
    Node dummy = new Node(null);
    dummy.next = head;
    Node cur = dummy;
    for (int i = 0; i < position; ++i) {
      cur = cur.next;
    }
    node.next = cur.next;
    cur.next = node;
    ++count;
  }

  public Node deleteHead() {
    if (isEmpty()) {
      throw new RuntimeException("The list is empty");
    }
    Node temp = head;
    head = head.next;
    --count;
    return temp;
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public void display() {
    Node current = head;
    while (Objects.nonNull(current)) {
      System.out.println(current.node + " ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    SinglyLinkedList linkedList = new SinglyLinkedList();
    assert linkedList.isEmpty();
    linkedList.insertHead(5);
    linkedList.insertHead(7);
    linkedList.insertHead(10);
    linkedList.display();
    linkedList.deleteHead();
    linkedList.display();
    linkedList.insertNth(11,2);
    linkedList.display();
  }

}

class Node {


  Object node;

  Node next;

  Node(Object node) {
    this.node = node;
  }
}

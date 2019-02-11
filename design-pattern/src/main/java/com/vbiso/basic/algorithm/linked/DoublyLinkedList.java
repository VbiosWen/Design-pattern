package com.vbiso.basic.algorithm.linked;

import java.util.Objects;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 6:21 PM 2019/1/31
 * @Modified By:
 */
public class DoublyLinkedList {


  private Node head;

  private Node tail;

  public DoublyLinkedList() {
    head = null;
    tail = null;
  }

  public DoublyLinkedList(Object[] array) {
    if (Objects.isNull(array)) {
      throw new NullPointerException();
    }
    for (Object obj : array) {
      insertTail(obj);
    }
  }

  private void insertTail(Object obj) {
    Node newNode = new Node(obj);
    newNode.next = null;
    tail.next = newNode;
    newNode.pre = tail;
    tail = newNode;
  }

  public void deleteHead() {
    Node temp = head;
    head = head.next;
    head.pre = null;
  }


  private class Node {

    private Node pre;

    private Node next;

    private Object value;

    Node(Object value) {
      this.value = value;
    }
  }

}

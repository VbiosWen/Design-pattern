package com.vbiso.basic.algorithm.sort;


import static com.vbiso.basic.algorithm.sort.SortUtils.less;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午11:24 2018/7/18
 * @Modified By:
 */
public class BinaryTreeSort implements SortAlgorithm {

  interface TreeVistor<T extends Comparable<T>> {

    void visit(Node<T> node);
  }

  private static class Node<T extends Comparable<T>> {

    private T value;
    private Node<T> left;
    private Node<T> right;

    Node(T value) {
      this.value = value;
    }

    void insert(Node<T> node) {
      if (less(node.value, value)) {
        if (left != null) {
          left.insert(node);
        } else {
          left = node;
        }
      } else {
        if (right != null) {
          right.insert(node);
        } else {
          right = node;
        }
      }
    }

    void traverse(TreeVistor<T> treeVistor) {
      if (left != null) {
        left.traverse(treeVistor);
      }
      treeVistor.visit(this);
      if (right != null) {
        right.traverse(treeVistor);
      }
    }
  }

  @Override
  public <T extends Comparable<T>> T[] sort(T[] unsorted) {
    return null;
  }
}

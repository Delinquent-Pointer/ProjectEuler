//import org.w3c.dom.Node;

public class SLL {

  private class Node {
    private Object data;
    private Node next;

    public Node(Object data, Node next) {
      this.data = data;
      this.next = next;
    }

    public Node(Object data) {
      this(data, null);
    }
  }

  private Node head;
  private int size;
  private Node tail;

  public SLL() {
    head = new Node(null, null);
    size = 0;
  }
  // TODO: Implement the addLast method
  public void addLast(Object data) {
    Node newNode = new Node(data);
    Node current = head;
    // while loop without using size
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;
    size++;
  }

  public void printList() {
    Node current = head.next;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }

}

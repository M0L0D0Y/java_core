package lesson11.list;

public class MyLinkedList {
    private Node first;
    private Node last;

    public void add(Integer number) {
        if (first == null) {
            this.first = new Node(number);
            this.last = this.first;
        } else {
            Node node = new Node(number);
            last.setNext(node);
            node.setPrev(last);
            this.last = node;
        }

    }

    public static class Node {
        private Integer value;
        private Node next = null;
        private Node prev = null;

        public Node(Integer value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }


    @Override
    public String toString() {
        return "MyLinkedList{" +
                "value=" + first +
                '}';
    }
}

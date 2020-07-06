package liststring;

public class QueueString {

    private NodeString head;

    public QueueString() {
        head = null;
    }

    public NodeString add(String data) {

        if (head != null) {
            NodeString tail = findTail();

            tail.setNext(new NodeString(data));
        } else {
            head = new NodeString(data);
        }

        //print();
        return head;
    }

    public String remove() {

        NodeString removed = head;
        NodeString next = head.getNext();

        head = next;
        //print();
        return removed.getData();
    }

    public String getHead() {

        if (head != null) {
            return head.getData();
        } else {
            return "";
        }
    }

    public void print() {
        NodeString q = head;

        if (q != null) {
            do {
                System.out.print(q.getData() + " ");
                q = q.getNext();
            } while (q != null);
        }

        System.out.println();
    }

    public NodeString findTail() {
        NodeString tail = head;

        if (head != null) {
            while (tail.getNext() != null) {
                tail = tail.getNext();
            }
        }

        return tail;
    }

    @Override
    public String toString() {
        String string = "";
        NodeString q = head;
        while (q != null) {
            string += q.getData();
            q = q.getNext();
        }
        return string;
    }
}

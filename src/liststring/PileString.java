package liststring;

public class PileString {

    private NodeString head;

    public PileString() {
        head = null;
    }

    public boolean push(String data) {

        if (head != null) {
            NodeString newNode = new NodeString(data);
            newNode.setNext(head);
            head = newNode;
        } else {
            NodeString newNode = new NodeString(data);
            head = newNode;
        }

        //print();
        return true;
    }

    public String pop() {

        NodeString removed = head;
        NodeString next = head.getNext();

        head = next;
        //print();
        return removed.getData();
    }

    public String nextPop() {

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
}

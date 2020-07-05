package listnumeric;

public class PileNum {

    NodeNum head;

    public PileNum() {
        head = null;
    }

    public boolean push(double data) {

        if (head != null) {
            NodeNum newNode = new NodeNum(data);
            newNode.setNext(head);
            head = newNode;
        } else {
            NodeNum newNode = new NodeNum(data);
            head = newNode;
        }

        //print();
        return true;
    }

    public double pop() {

        NodeNum removed = head;
        NodeNum next = head.getNext();

        head = next;
        //print();
        return removed.getData();
    }

    public boolean nextPop() {

        return (head != null);
    }

    public void print() {
        NodeNum q = head;

        if (q != null) {
            do {
                System.out.print(q.getData() + " ");
                q = q.getNext();
            } while (q != null);
        }

        System.out.println();
    }
}

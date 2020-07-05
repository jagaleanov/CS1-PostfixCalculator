package listnumeric;

public class NodeNum {

    private double data;
    private NodeNum next;

    public NodeNum(double info) {
        this.data = info;
        this.next = null;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public NodeNum getNext() {
        return next;
    }

    public void setNext(NodeNum next) {
        this.next = next;
    }
}

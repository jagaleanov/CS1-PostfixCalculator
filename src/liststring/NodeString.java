package liststring;

public class NodeString {

    private String data;
    private NodeString next;

    public NodeString(String info) {
        this.data = info;
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NodeString getNext() {
        return next;
    }

    public void setNext(NodeString next) {
        this.next = next;
    }
}

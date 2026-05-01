package taiyarijavaa.QUEUES;

public class node {
    int val;
    int idx;
    int data;
    node next;
    node prev;
    node child;
    node random;

    public node(int data) {   // ✅ parameter bhi data rakho
        this.data = data;     // ✅ correct assignment
        this.next = null;
        this.prev = null;
        this.child = null;
        this.random = null;
    }
}
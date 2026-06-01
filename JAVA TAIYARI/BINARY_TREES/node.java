package taiyarijavaa.BINARY_TREES;

import org.w3c.dom.Node;

public class node {
    int val;
    node left;
    node right;
    node(int val ){
        this.val = val ;
    }

    public class pair{
        Node node;
        int level;
        pair(Node node , int level){
            this.node = node;
            this.level = level;
            
        }
    }
    
}


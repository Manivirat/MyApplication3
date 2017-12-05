package com.example.a.myapplication;


public class Node {

    private int payload;
    private Node leftChild;
    private Node rightChild;

    public Node(int payload)
    {
        this.payload = payload;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void add(Node n)
    {
        if(n.getPayload() <= this.payload)
        {
            if(this.leftChild == null)
            {
                this.leftChild = n;
            }
            else
            {
                this.leftChild.add(n);
            }
        }
        else
        {
            if(this.rightChild == null)
            {
                this.rightChild = n;
            }
            else
            {
                this.rightChild.add(n);
            }
        }
    }

    public int getPayload() {
        return payload;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}

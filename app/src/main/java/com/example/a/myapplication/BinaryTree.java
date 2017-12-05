package com.example.a.myapplication;



public class BinaryTree {

    private Node root;
    private int count;

    public BinaryTree()
    {
        this.root = null;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public void add(int payload)
    {
        Node n = new Node(payload);
        this.count++;

        if(this.root == null)
        {
            this.root = n;
        }
        else
        {
            this.root.add(n);
        }
    }
}

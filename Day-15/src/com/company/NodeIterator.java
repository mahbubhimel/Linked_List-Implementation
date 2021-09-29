package com.company;
//import com.company.LinkedList;

import java.util.Iterator;


class NodeIterator<T> implements Iterator<T> {
     Node current;

    public NodeIterator(Node firstInList) {
        this.current = firstInList;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        Node prevNode = current;
        current = current.next;
        return (T) prevNode.data;
    }
}
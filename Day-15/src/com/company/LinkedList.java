package com.company;

import java.util.Iterator;

class Node<T>{
    T data;
    Node next;

    Node(T value){
        this.data = value;
        this.next = null;
    }
}
public class LinkedList<T> implements Iterable<T>{ //receive by """"LinkedList<T>"""" this commmand ### sending the type to iterable interface by """"Iterable<T>"""" this command
    Node head;

    public Iterator<T> iterator() {
        return new NodeIterator(head);
    }


    public void add(T data){
        Node new_node = new Node(data);
        new_node.next = null;

        if(head == null){
            head = new_node;
        }else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public void printList(){
        Node currentNode = head;

        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public T get(int index){
        Node getByIndexCurrentNode = head;
        int countVariable = 0;
        while(getByIndexCurrentNode != null) {
            if (countVariable == index) {
                //System.out.println("Found! The value is : " + getByIndexCurrentNode.data);
                return (T) getByIndexCurrentNode.data;
            }
            countVariable++;
            getByIndexCurrentNode = getByIndexCurrentNode.next;
        }
        return null;
    }


    public boolean remove(int removeAtIndex){
        Node currentNode = head;
        Node previousNode = null;

        int listCurrentIndex = 0;

        while(currentNode != null){
            if(removeAtIndex == 0){
                head = currentNode.next;
                return true;
            }
            else if(listCurrentIndex == removeAtIndex){
                previousNode.next = currentNode.next;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
            listCurrentIndex++;
        }
        return false;
    }

    public int size(){
        int size = 0;

        Node currentNode = head;

        while(currentNode != null){
            currentNode = currentNode.next;
            size++;
        }
        return size;
    }
}
package com.company;

import java.util.*;
//import com.company.NodeIterator;

public class Main{

    static class User{
        int age;
        String name;

        User(int age, String name){
            this.name = name;
            this.age = age;
        }
    }


    public static void main(String[] args) {
        AppleTree a = new AppleTree();
        a.sum();



//        LinkedList<User> list = new LinkedList<>();
//
//        User a = new User(20,"Himel");
//        User b = new User (24, "Mahbub");
//
//        list.add(a);
//        list.add(b);
//
//        Iterator<User> x = list.iterator();
//        User temp;
//        while(x.hasNext()) {
//            temp = x.next();
//            System.out.println(temp.name);
//        }
//
//        for(User i : list){
//            System.out.println(i.name+"   "+ i.age);
//        }
//
//        list.remove(0);
//
//        for(User i : list){
//            System.out.println(i.name+"   "+ i.age);
//        }

//        list.add(10);
//        list.add(20);
//
//        list.printList();
//        list.remove(1);
//        list.printList();
//
//        for(Integer i : list){
//            System.out.println(i);
//        }

//        Scanner scanner= new Scanner(System.in);
//        String input, x;
//        int y;
//        while(scanner.hasNextLine()){
//            input = scanner.nextLine();
//            if(input.equalsIgnoreCase("add")){
//                x = scanner.nextLine();
//                list.add(x);
//            }
//            if(input.equalsIgnoreCase("find")){
//                y = scanner.nextInt();
//                if(y < list.size()){
//                    System.out.println("Found : "+ list.get(y));
//                }else{
//                    System.out.println("Not Found");
//                }
//            }
//
//            if(input.equalsIgnoreCase("remove")){
//                y = scanner.nextInt();
//                if(y < list.size()){
//                    list.remove(y);
//                }else{
//                    System.out.println("Index out of Bound");
//                }
//            }
//            if(input.equalsIgnoreCase("show")){
//                if(list.size()!=0){
//                    list.printList();
//                }else{
//                    System.out.println("List Empty");
//                }
//            }
//
//            if(input.equalsIgnoreCase("iterable")){
////                for(int i = 0 ; i < list.size() ; i++){
////                    System.out.println(list.get(i));
////                }
//
//                for(String it : list){
//                    System.out.println(it);
//                }
//            }
//        }

    }
}

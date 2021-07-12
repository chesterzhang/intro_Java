package indi.chester.LinkedList;


import java.util.LinkedList;
import java.util.List;

//Java LinkedList 用作 List
public class LinkedListDemo1 {

    public static void main(String[] args) {
        List<Integer> ls=new LinkedList<>();

        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(0,1);
        System.out.println(ls);//[1, 2, 3, 4]

        System.out.println(ls.get(0));// 1

        ls.set(0,-1);
        System.out.println(ls);//[-1, 2, 3, 4]

        ls.remove(3);
        System.out.println(ls);//[-1, 2, 3]

        if (ls.contains(3)){
            System.out.println("链表含有 3");
        }

        if (ls.isEmpty()){
            System.out.println("链表为空");
        }else {
            System.out.println("链表不为空");
        }

        System.out.println("链表长度: "+ls.size());

    }

}

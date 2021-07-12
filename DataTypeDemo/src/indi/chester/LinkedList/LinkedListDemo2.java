package indi.chester.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

//Java LinkedList 用作 queue

public class LinkedListDemo2 {
    public static void main(String[] args) {

        Queue<Integer> queue =new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue);// 输出  [1, 2, 3]

        //获取队首
        System.out.println(queue.peek());//输出 1

        //取出队首
        System.out.println(queue.poll());//输出 1
        
       if (queue.contains(3)){
           System.out.println("队列含有 3");//输出 队列含有 3
       }

        if (queue.isEmpty()){
            System.out.println("队列为空");
        }else {
            System.out.println("队列不为空");//输出 队列不为空
        }

        System.out.println("队列长度: "+queue.size());//输出 队列长度: 2

    }

}

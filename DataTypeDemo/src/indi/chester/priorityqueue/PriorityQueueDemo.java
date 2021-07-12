package indi.chester.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> pq= new PriorityQueue<>();

        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(1);

        //查看队首
        System.out.println(pq.peek());//输出1

        //取出队首
        System.out.println(pq.poll());//输出1


        pq.remove(2);

        //查看队首
        System.out.println(pq.peek());//输出3

        if (pq.contains(3)){
            System.out.println("优先队列含有 3");//输出这句
        }

        if (pq.isEmpty()){
            System.out.println("优先队列为空");
        }else {
            System.out.println("优先队列不为空");//输出这句
        }

        System.out.println("优先队列元素个数: "+pq.size());//输出 优先队列元素个数: 2

    }

}

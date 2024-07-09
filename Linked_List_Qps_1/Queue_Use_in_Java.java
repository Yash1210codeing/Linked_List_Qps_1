package Linked_List_Qps_1;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Use_in_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<Integer>q=new LinkedList<>();
        Queue<Integer>q1=new LinkedList<>();  
        q1.add(10); // Last
        q1.add(20);
        q1.add(30);
        q1.add(10);
        q1.add(20);
        q1.add(30);
        System.out.println(q.remove());   // First
	}
}
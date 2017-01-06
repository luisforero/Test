package co.com.examples.java8.collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Luis Wilmer Forero Romero<luisforero.wr@gmail.com>
 */
public class QueueCollections {

    public static void main(String[] args) {
        String[] array = {"AN", "AB", "OH", "ZO", "NJ", "NA", "NJ", "XJ", "NJ"};

        // Linked List is tradeoff than ArrayDeque. 
        // But Linked List have other methods than arrayDeque 
        // that permit priority with one element 
        LinkedList<String> listQueue = new LinkedList<>();
        listQueue.addAll(Arrays.asList(array));
        System.out.println("Linked Queue: " + listQueue);

        // The diference between LIFO and FIFO are the methods used into the queue
        // Queue
        System.out.println("** QUEUE **");
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println("queue offer(10)(an adding to queue): " + queue.offer(10));
        System.out.println("queue offer(4): " + queue.offer(4));
        System.out.println("queue add(1): " + queue.add(1) + "\t(the diference is this mhetod return an "
                + "exception while the other don't anr return an value of the operation)");
        System.out.println("** QUEUE: " + queue);
        System.out.println("queye peek()(Obtain but don't remove): " + queue.peek());
        System.out.println("queye poll()(Obtain and remove): " + queue.poll());
        System.out.println("queye poll(): " + queue.poll());
        System.out.println("queye peek(): " + queue.peek());

        //
        System.out.println("** PRIORITY QUEUE *** \n"
                + "\t(This needs to make a Comparator values this works \n"
                + "with default Comparator of Class)**");
        Queue<Integer> queuePriority = new PriorityQueue<>(2);
        System.out.println("queuePriority offer(10)(an adding to queue): " + queuePriority.offer(10));
        System.out.println("queuePriority offer(4): " + queuePriority.offer(4));
        System.out.println("queuePriority add(1): " + queuePriority.offer(1));
        System.out.println("** PRIORITY QUEUE: " + queuePriority);

        // Stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        System.out.println("\n** STACK **");
        stack.push(10);
        stack.push(4);
        System.out.println("stack add(1): " + stack.add(1));
        System.out.println("** STACK: " + stack);
        System.out.println("queye peek()(Obtain but don't remove): " + stack.peek());
        System.out.println("queye poll()(Obtain and remove): " + stack.poll());
        System.out.println("queye poll(): " + stack.poll());
        System.out.println("queye poll(): " + stack.poll());
        System.out.println("queye peek(): " + stack.peek());
    }
}

import java.util.*;

public class Queue {
    public static void main(String[] args) {

        PriorityQueue<String> q = new PriorityQueue<String>();
        Scanner sc = new Scanner(System.in);

        String el;
        int ch;

        do {
            System.out.print(
                "\n----------------\n" +
                "1: Add\n" +
                "2: Remove\n" +
                "3: Display\n" +
                "4: Head\n" +
                "0: Exit\n" +
                "----------------\n" +
                "Enter your choice: "
            );

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter element to insert: ");
                    el = sc.next();
                    q.add(el);
                    break;

                case 2:
                    if (!q.isEmpty()) {
                        System.out.println("Removed: " + q.remove());
                    } else {
                        System.out.println("Queue is empty");
                    }
                    break;

                case 3:
                    System.out.println("Priority Queue: " + q);
                    break;

                case 4:
                    if (!q.isEmpty()) {
                        System.out.println("Head of the queue: " + q.peek());
                    } else {
                        System.out.println("Queue is empty");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Wrong choice!");
            }

        } while (ch != 0);
    }
}
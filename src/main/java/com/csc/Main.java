package com.csc;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Main {
  public static ArrayList<Cutie> enqueue_from = new ArrayList<>();
  public static int queue_length;
  public static ArrayList<Cutie> queue = new ArrayList<>();
  public static void main(String[] args) {
    
    enqueue_from.add(new Hamster());
    enqueue_from.add(new Starfish());
    enqueue_from.add(new Fawn());
    enqueue_from.add(new Hyena());
    enqueue_from.add(new Blobfish());

    
    Scanner in = new Scanner(System.in);
    boolean running =true;
    System.out.println("Please enter the desired length of the queue: ");
    queue_length= in.nextInt();

    while(running)
    {
      System.out.println("Please enter 'enqueue' to add a new element at the front of the queue.\nPlease enter 'dequeue' to remove an element from the front of the queue. \nPlease enter 'size' to get the size of the queue. \nPlease enter 'exit' to exit the program.\nPlease enter 'clear' to clear contents of queue. ");
      String entry = in.next();
      switch (entry)
      {
        case "enqueue":
          Collections.shuffle(enqueue_from);
          if(queue.size()<queue_length)
          {
            enqueue();
          }
          else
          {
            System.out.println("The queue is full. Please dequeue some elements to continue. ");
          }
          break;

        case "dequeue":
          dequeue();
          break;
        case "size":
          size();
          break;
        case "exit":
          running =false;
          break;
        case "clear":
          clear();
          break;
        default:
          System.out.println("Please enter a valid option");
      }
      
    }
    in.close();
  }
  public static void enqueue()
  {
    queue.add(enqueue_from.get(0));
    System.out.println(queue);
    System.out.println("Added element: "+ enqueue_from.get(0));
  }

  public static void dequeue()
  {
    Cutie first_in_line = queue.get(queue.size()-1);
    queue.remove(first_in_line);
    System.out.println(queue);
    System.out.println("Removed element: "+ first_in_line);
  }
  public static void size()
  {
     System.out.println(queue.size());
  }

  public static void clear()
  {
    queue.clear();
    System.out.println("Queue has been cleared.");
  }

}
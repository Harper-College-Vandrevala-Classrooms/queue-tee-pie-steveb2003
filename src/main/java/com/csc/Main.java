package com.csc;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public interface Cutie {
  // All cuties need to have a description of what makes them cute.
  public String description();

  // All cuties get a cuteness rating out of ten.
  public Integer cutenessRating();
}

class Hamster implements Cutie{
  public String description(){
    return "A small black and white hamster with tiny eyes and teeth";
  }
  public Integer cutenessRating(){
    return 6;
  }
}

class Starfish implements Cutie{
  public String description(){
    return "A pink starfish with green and purple shorts";
  }
  public Integer cutenessRating(){
    return 8;
  }
}

class Fawn implements Cutie{
  public String description(){
    return "A  little deer with a while tail";
  }
  public Integer cutenessRating(){
    return 9;
  }
}

class Hyena implements Cutie{
  public String description(){
    return "A cackling hyena eating a zebra";
  }
  public Integer cutenessRating(){
    return -1;
  }
}

class Blobfish implements Cutie{
  public String description(){
    return "A kind blobfish";
  }
  public Integer cutenessRating(){
    return 11;
  }
}

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
      System.out.println("Please enter 'enqueue' to add a new element at the front of the queue.\nPlease enter 'dequeue' to remove an element from the front of the queue. \nPlease enter 'size' to get the size of the queue. \nPlease enter 'exit' to exit the program.");
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

}
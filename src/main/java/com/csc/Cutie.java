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

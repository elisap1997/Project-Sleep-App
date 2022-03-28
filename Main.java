import java.util.Scanner;
import java.util.*;

class Main {
  public static void main(String[] args) {

  // Enter your code below this line
  Scanner keyboard = new Scanner(System.in);

  int bedTime = 0;
  int sleepHours = 0;
  int alarm = 0;
  boolean isWorking = true;
  boolean isWorkday = true;
  boolean useWork = true;
  String myName = "";

  System.out.print("Please enter your name: ");
  myName = keyboard.nextLine();
    
  System.out.println("Hi " + myName + ", welcome to the sleep app!");

  System.out.print("What time do you want to go to sleep? ");
  bedTime = Integer.parseInt(keyboard.nextLine());

  System.out.println("You want to go to sleep at " + bedTime);

  System.out.print("How many hours of sleep do you want? ");
  sleepHours = Integer.parseInt(keyboard.nextLine());

  System.out.println("You want " + sleepHours + " hours of sleep. Make sure you get enough sleep throughout the week!");

  System.out.print("What time would you like to set the alarm? ");
  alarm = Integer.parseInt(keyboard.nextLine());

  System.out.println("You would like to set your alarm for " + alarm);

  System.out.print("Are you working? ");
  isWorking = Boolean.parseBoolean(keyboard.nextLine());

  System.out.print("Are you using this sleep app on a workday? ");
  isWorkday = Boolean.parseBoolean(keyboard.nextLine());

  useWork = isWorkday && isWorking;

  System.out.println("You are using the sleep app for work purposes: " + useWork);

  System.out.println("Hi, " + myName + ". You want to go to sleep at " + bedTime + ", sleep for " + sleepHours + " hours, and wake up at " + alarm + ".");
    
    
  /////////// End of the tasks /////////////////
  } // end of method
} // end of class

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    //create program w/ scanner to figure out birthday, how old, and create true/false statement about grade

      Scanner scan =  new Scanner(System.in); 

    System.out.println("What is your birth month?"); 
     String birthMonth = scan.next();
    System.out.println("What day is your birthday?");
      String birthDay = scan.next(); 
    System.out.println("When is your birth year?");
      int birthYear = scan.nextInt();
    System.out.println("What is the current year?");
      int currentYear = scan.nextInt(); 
    System.out.println("What grade are you in?"); 
      int gradeLevel = scan.nextInt(); 
    System.out.println("Have you passed all your classes? (true/false)");
      boolean passed = scan.nextBoolean(); 

    System.out.println("Your age is " + age); 
    System.out.println("Your birthday is " + birthDay); 
  }

    //method to  print  birthday
      static int  birthDay(int birthMonth, int birthDay, int birthYear)
        {
          return birthDay;  
        }
    //create method to calculate age
      static int age(int birthYear, int currentYear)
        {
          int age = currentYear - birthYear;
          return age; 
        }

    //create method to calculate grade level
      static boolean passed(boolean passed) 
        {
          if (passed = true)
          {
            System.out.println("You have passed all your classes!");
          }else{
            System.out.print("You have failed all your classes, please see your teacher for more info."); 
          }

        }
  }
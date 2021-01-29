import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    //create program w/ scanner to figure out birthday, how old, and create true/false statement about grade

    System.out.println("What is your name?");
      String name = scan.next(); 
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

    System.out.println("Your age is " + age); 
    System.out.println("Your grade level is " + gradeLevel); 
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
      static int gradeYear(int gradeLevel) 
        {
          int gradeLevel = 9; 
          int gradeLevel = 10;
          int gradeLevel = 11;
          int gradeLevel = 12; 
    
          if (i = gradeLevel)
            {
              System.out.println("You are in grade " + gradeLevel); 
            }

        }
  }
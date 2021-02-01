import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    //create program w/ scanner to figure out birthday, how old, and create true/false statement about grade

      Scanner scan =  new Scanner(System.in); 

    System.out.println("What is your birth month? just the numerical number"); 
      int birthMonth = scan.nextInt();
    System.out.println("What day is your birthday? just the numerical number");
      int birthDay = scan.nextInt(); 
    System.out.println("When is your birth year?");
      int birthYear = scan.nextInt();
    System.out.println("What is the current year?");
      int currentYear = scan.nextInt(); 

    System.out.println("Your age is " + age(birthYear,currentYear)); 
    System.out.println("Your birthday is " + birthMonth + " / " + birthDay + " / "  + birthYear); 
    System.out.println("Your zodiac sign is " + zodiacSign(birthMonth, birthDay)); 
  }

    //method to  print  zodiac signs
      static String  zodiacSign(int birthMonth, int birthDay)
        {
        //if statement to print January Aquarius
          if (birthMonth == 1 && birthDay >= 1 && birthDay <= 19)
          {
             return "Capricorn"; 
          }

        //if statement to print January Aquarius
          if (birthMonth == 1 && birthDay >= 20 && birthDay <= 31)
          {
            return "Aquarius";
          }

        //if statement to print February Aquarius
          if (birthMonth == 2 && birthDay >=  1 && birthDay <= 18)
          {
            return "Aquarius"; 
          }

        //if statement to print February Pisces
          if (birthMonth == 2 && birthDay >= 19 && birthDay <= 28) 
          {
            return "Pisces";
          }

        //if statement to print March Pisces
          if (birthMonth == 3 && birthDay >= 1 && birthDay <= 20)
          {
            return "Pisces";
          }

        //if statement to print March Aries
          if (birthMonth == 3 && birthDay >= 21 && birthDay <= 31)
          {
            return "Aries";
          }

        //if statement to print April Aries
          if (birthMonth == 4 && birthDay >= 1 && birthDay <= 19)
          {
            return "Aries"; 
          }

        //if statement to print April Taurus
          if (birthMonth == 04 && birthDay >= 20 && birthDay <= 30)
          {
            return "Taurus"; 
          }

        //if statement to print May Taurus
          if (birthMonth == 5 && birthDay >= 1 && birthDay <= 20)
          {
            return "Taurus"; 
          }

        //if statement to print May Gemini
          if (birthMonth == 5 && birthDay >= 21 && birthDay <= 31)
          {
            return "Gemini";
          }

        //if statement to print June Gemini
          if (birthMonth == 6 && birthDay >= 1 && birthDay <= 21)
          {
            return "Gemini"; 
          }

        //if statement to print June Cancer
          if (birthMonth == 6 && birthDay >= 22 && birthDay <= 30)
          {
            return "Cancer"; 
          }

        //if statement to print July Cancer
          if (birthMonth == 7 && birthDay >= 1 && birthDay <= 22)
          {
            return "Cancer"; 
          }

        //if statement to print July Leo
          if (birthMonth == 7 && birthDay >= 23 && birthDay <= 31)
          {
            return "Leo"; 
          }

        //if statement to print August Leo
          if (birthMonth == 8 && birthDay >= 1 && birthDay >= 22)
          {
            return "Leo"; 
          }

        //if statement to print August Virgo
          if (birthMonth == 8 && birthDay >= 23 && birthDay <= 31)
          {
            return "Virgo "; 
          }
          
        //if statement to print September Virgo
          if (birthMonth == 9 && birthDay >= 1 && birthDay <= 22)
          {
            return "Virgo"; 
          }

        //if statement to print September Libra 
          if (birthMonth == 9 && birthDay >= 23 && birthDay <= 30)
          {
            return "Libra"; 
          }

        //if statement to print October Libra
          if (birthMonth == 10 && birthDay >= 1 && birthDay <= 23)
          {
            return "Libra"; 
          }

        //if statement to print October Scorpio 
          if (birthMonth == 10 && birthDay >= 24 && birthDay <= 31)
          {
            return "Scorpio"; 
          }

        //if statement to print November Scorpio 
          if (birthMonth == 11 && birthDay >= 1 && birthDay <= 21)
          {
            return "Scorpio"; 
          }

        //if statement to print November Sagittarius
          if (birthMonth == 11 && birthDay >= 22 && birthDay <= 30)
          {
            return "Sagittarius"; 
          } 

        //if statement to print December Sagittarius
          if (birthMonth == 12 && birthDay >= 1 && birthDay <= 21)
          {
            return "Sagittarius"; 
          }

        //if statement to print December Capricorn
          if (birthMonth == 12 && birthDay >= 22 && birthDay <= 31 )
          {
            return "Capricorn"; 
          }
          return "Wrong dates. Zodiac not found.";
        }

    //create method to calculate age
      static int age(int birthYear, int currentYear)
        {
          int age = currentYear - birthYear;
          return age; 
        }
  }
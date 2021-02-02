import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    //create program w/ scanner to figure out birthday, how old, and the users zodiac sign 

      Scanner scan =  new Scanner(System.in); 

    System.out.println("What is your birth month? just the numerical number example: 1/2/2004"); 
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
             return "Capricorn and your February horoscope is: February looks like it could be a fun month for you, Cap. Despite the pandemic, there’s a certain indescribable feeling in the air. With Valentine’s day approaching, you may feel an unspoken desire to either pamper or be pampered. You shouldn’t deny yourself during this romantic, sensual period, but try to manage your money and your resources responsibly. You may have natural inclinations to treat and be treated — and you’re always capable of attracting abundance and wealth, but be sure to stay within your budget as payment often ebbs and flows."; 
          }

        //if statement to print January Aquarius
          if (birthMonth == 1 && birthDay >= 20 && birthDay <= 31)
          {
            return "Aquarius and your February horoscope is: Keep your spirits high, Aquarius! You're making it through the beginning of 2021. It’s a good time to consider your approach to life, as well as your social network. Even if you don’t crave attention, it’s not uncommon that crowds notice you anyway. February has a cerebral aura attached to it, enabling conscious thought and meaningful intention to help you manifest your best self. A little vanity never hurt anyone, so set aside time to really look yourself in the mirror to appreciate the vessel that carries you through life. It’s easy to get lost in life and feel displanted, but this month is great for setting your roots into the ground.";
          }

        //if statement to print February Aquarius
          if (birthMonth == 2 && birthDay >=  1 && birthDay <= 18)
          {
            return "Aquarius and your February horoscope is: You will have to handle your opportunities with care and self - doubting situations may arise mostly in the field of learning. People in the field of Commerce will see extra benefits for sure. The career will hold its strings tight on the people pursuing Art as their career and rest will have to manage a little bit by the third week of the month. Your greediness will get you into big trouble this month so you must be careful while dealing on professional fronts and mostly carrying out your business. Keeping high hopes for a new venture will be fruitful. Marital issues will finally come to end this month and people indulged in relationships may become victims of miscommunication therefore should be more expressive than usual. Developing new hobbies will keep your children busy and positive this month."; 
          }

        //if statement to print February Pisces
          if (birthMonth == 2 && birthDay >= 19 && birthDay <= 28) 
          {
            return "Pisces and your February horoscope is: Slow down, Pisces! Before you can speak your truth, you must first acknowledge your shadow, which means taking the time to address the themes in your life that may be holding you back. In order to elevate your state of mind and transition from conscious thought to outward expression, allow yourself the ability to get lost in your own mind. You’re no stranger to daydreaming or expressive arts, so revisiting your old work is a surefire way to better understand the person you are today. February will be a difficult month as it pertains to forward movement, but at least you’re getting somewhere.";
          }

        //if statement to print March Pisces
          if (birthMonth == 3 && birthDay >= 1 && birthDay <= 20)
          {
            return "Pisces and your February horoscope is: Slow down, Pisces! Before you can speak your truth, you must first acknowledge your shadow, which means taking the time to address the themes in your life that may be holding you back. In order to elevate your state of mind and transition from conscious thought to outward expression, allow yourself the ability to get lost in your own mind. You’re no stranger to daydreaming or expressive arts, so revisiting your old work is a surefire way to better understand the person you are today. February will be a difficult month as it pertains to forward movement, but at least you’re getting somewhere.";
          }

        //if statement to print March Aries
          if (birthMonth == 3 && birthDay >= 21 && birthDay <= 31)
          {
            return "Aries and youur February horoscope is: Prepare for an action-packed month, Aries. Direct your focus to your community and peers, as the eyes and ears that are on you now could help propel you to your next big thing. Don’t shy away from the attention, and be willing to take some risks for long-term results. A big talk could be exactly what’s needed to create network security. Being unapologetically confident is exactly how you can begin to open doors for yourself. Schmoozing and small talk is also the name of the game, so try expanding your contacts by using the popular Clubhouse app.";
          }

        //if statement to print April Aries
          if (birthMonth == 4 && birthDay >= 1 && birthDay <= 19)
          {
            return "Aries and your February horoscope is: Prepare for an action-packed month, Aries. Direct your focus to your community and peers, as the eyes and ears that are on you now could help propel you to your next big thing. Don’t shy away from the attention, and be willing to take some risks for long-term results. A big talk could be exactly what’s needed to create network security. Being unapologetically confident is exactly how you can begin to open doors for yourself. Schmoozing and small talk is also the name of the game, so try expanding your contacts by using the popular Clubhouse app."; 
          }

        //if statement to print April Taurus
          if (birthMonth == 04 && birthDay >= 20 && birthDay <= 30)
          {
            return "Taurus and your February horoscope is: Turn on your mental autopilot in 2021, Taurus. After a year that forced you to develop better methods of organizing yourself, it’s time to take a backseat approach to life and respond as needed. Set clear objectives to help you keep your head above water. Try to focus on maintaining what you have as opposed to over extending yourself. With Mercury retrograde in Aquarius, it's an ideal time to get all your ducks in a row and make sure you’re on track to reach your goals. You may feel the compulsion to treat yourself, but don’t go overboard."; 
          }

        //if statement to print May Taurus
          if (birthMonth == 5 && birthDay >= 1 && birthDay <= 20)
          {
            return "Taurus and your February horoscope is: Turn on your mental autopilot in 2021, Taurus. After a year that forced you to develop better methods of organizing yourself, it’s time to take a backseat approach to life and respond as needed. Set clear objectives to help you keep your head above water. Try to focus on maintaining what you have as opposed to over extending yourself. With Mercury retrograde in Aquarius, it's an ideal time to get all your ducks in a row and make sure you’re on track to reach your goals. You may feel the compulsion to treat yourself, but don’t go overboard."; 
          }

        //if statement to print May Gemini
          if (birthMonth == 5 && birthDay >= 21 && birthDay <= 31)
          {
            return "Gemini and your February horoscope is: Does it feel like your brain is exploding, Gemini? Lots of things are happening and changing, but the number of projects on your plate remains the same. With Mercury in retrograde until Feb. 21, you can expect some barriers to understanding what’s needed from you within your relationships. It may be difficult for you to determine what to ask from those closest to you, but try to push past those insecurities because assistance is there for you as needed. Dedicating an hour a day to reading books relevant to your field can help shed some light on areas that you don’t quite understand. Cheating and taking shortcuts will only hurt you in the end. Align your mind and prepare for your future so that you’re not stuttering when it’s time to show off.";
          }

        //if statement to print June Gemini
          if (birthMonth == 6 && birthDay >= 1 && birthDay <= 21)
          {
            return "Gemini and your February horoscope is: Does it feel like your brain is exploding, Gemini? Lots of things are happening and changing, but the number of projects on your plate remains the same. With Mercury in retrograde until Feb. 21, you can expect some barriers to understanding what’s needed from you within your relationships. It may be difficult for you to determine what to ask from those closest to you, but try to push past those insecurities because assistance is there for you as needed. Dedicating an hour a day to reading books relevant to your field can help shed some light on areas that you don’t quite understand. Cheating and taking shortcuts will only hurt you in the end. Align your mind and prepare for your future so that you’re not stuttering when it’s time to show off."; 
          }

        //if statement to print June Cancer
          if (birthMonth == 6 && birthDay >= 22 && birthDay <= 30)
          {
            return "Cancer and your February horoscope is: You have lots to unpack in the intimacy department, Cancer. Don’t worry though, there’s time to learn how to express your feelings. The beginning of the month is a great time for you to explore joy by connecting with your friends and community in more intimate ways. Spend February centering yourself and hashing through residual baggage. The more you ignore your issues, the higher the likelihood that it'll follow you and grow in size. Confrontation is difficult, and it can sometimes feel impossible to figure out who did what. Try to refrain from being too stuck on the past. Instead, focus on how you can ensure that your future is prosperous. The best revenge comes from carefully made decisions, not sporadic or impulsive actions."; 
          }

        //if statement to print July Cancer
          if (birthMonth == 7 && birthDay >= 1 && birthDay <= 22)
          {
            return "Cancer and your February horoscope is: You have lots to unpack in the intimacy department, Cancer. Don’t worry though, there’s time to learn how to express your feelings. The beginning of the month is a great time for you to explore joy by connecting with your friends and community in more intimate ways. Spend February centering yourself and hashing through residual baggage. The more you ignore your issues, the higher the likelihood that it'll follow you and grow in size. Confrontation is difficult, and it can sometimes feel impossible to figure out who did what. Try to refrain from being too stuck on the past. Instead, focus on how you can ensure that your future is prosperous. The best revenge comes from carefully made decisions, not sporadic or impulsive actions."; 
          }

        //if statement to print July Leo
          if (birthMonth == 7 && birthDay >= 23 && birthDay <= 31)
          {
            return "Leo and your February horoscope is: Take February as a time to evaluate your commitments. Some projects weren’t meant for you to follow through on and it’s OK to admit that. No use beating a dead horse or expecting someone or yourself to contort to fit somewhere you’re supposed to step out of. You’re a light, Leo. And when you’re a light, it can feel like people are trying to dim you, which can be frustrating. But when you stop and listen to people, you can better understand their rationales and it'll be easier to work with them going forward. This month is putting heavy emphasis on your partnerships, intellect, and boundaries."; 
          }

        //if statement to print August Leo
          if (birthMonth == 8 && birthDay >= 1 && birthDay >= 22)
          {
            return "Leo and your February horoscope is: Take February as a time to evaluate your commitments. Some projects weren’t meant for you to follow through on and it’s OK to admit that. No use beating a dead horse or expecting someone or yourself to contort to fit somewhere you’re supposed to step out of. You’re a light, Leo. And when you’re a light, it can feel like people are trying to dim you, which can be frustrating. But when you stop and listen to people, you can better understand their rationales and it'll be easier to work with them going forward. This month is putting heavy emphasis on your partnerships, intellect, and boundaries."; 
          }

        //if statement to print August Virgo
          if (birthMonth == 8 && birthDay >= 23 && birthDay <= 31)
          {
            return "Virgo and your February horoscope is: Virgo, it should go without saying that you need to make some clear decisions about how you want to conduct your life. Are you where you want to be right now? If you answered no, is it possible that your current mindself needs to shift? As Mercury retrogrades through Aquarius, you’re being challenged to think outside of the box. Don’t get stuck in a tired, old narrative — you’re allowed to soar and surpass the path that was created for you. For the Virgos who have done the shadow work, congrats. February should be a month where extracurricular activities help you attain your dreams so long as you keep an open mind."; 
          }
          
        //if statement to print September Virgo
          if (birthMonth == 9 && birthDay >= 1 && birthDay <= 22)
          {
            return "Virgo and your February horoscope is: Virgo, it should go without saying that you need to make some clear decisions about how you want to conduct your life. Are you where you want to be right now? If you answered no, is it possible that your current mindself needs to shift? As Mercury retrogrades through Aquarius, you’re being challenged to think outside of the box. Don’t get stuck in a tired, old narrative — you’re allowed to soar and surpass the path that was created for you. For the Virgos who have done the shadow work, congrats. February should be a month where extracurricular activities help you attain your dreams so long as you keep an open mind."; 
          }

        //if statement to print September Libra 
          if (birthMonth == 9 && birthDay >= 23 && birthDay <= 30)
          {
            return "Libra and your February horoscope is Continuously moving through life, you’re used to being like the air, Libra. Occasionally though, you'll wobble and it’s not uncommon to feel a little discomfort. February is a time for you to focus on your community and develop your creative energy. As a Libra, you can easily develop ideas and become keen when you need to be, but it seems that you have been in a mild rut since 2020. It’s important to examine why that is and reallocate your energy accordingly. This month might not be the easiest point of time for you and part of that may be a confidence issue. Take time as needed to give birth to the life you wish to live."; 
          }

        //if statement to print October Libra
          if (birthMonth == 10 && birthDay >= 1 && birthDay <= 23)
          {
            return "Libra and your February horoscope is Continuously moving through life, you’re used to being like the air, Libra. Occasionally though, you'll wobble and it’s not uncommon to feel a little discomfort. February is a time for you to focus on your community and develop your creative energy. As a Libra, you can easily develop ideas and become keen when you need to be, but it seems that you have been in a mild rut since 2020. It’s important to examine why that is and reallocate your energy accordingly. This month might not be the easiest point of time for you and part of that may be a confidence issue. Take time as needed to give birth to the life you wish to live."; 
          }

        //if statement to print October Scorpio 
          if (birthMonth == 10 && birthDay >= 24 && birthDay <= 31)
          {
            return "Scorpio and your February horoscope is: You may have the inclination to move or feel a certain urging to travel, which is certainly understandable due to the pandemic. Your ideas may feel restricted right now, and you could be facing difficulties articulating exactly what you feel to those around you. As February persists, be patient with yourself. There’s no need to feel shame or guilt if you decide to be a hermit. Sometimes all you can do is allow yourself downtime. Exercise your creativity through projects or leisurely activities, such as scrapbooking or photography. The less pressure you put on yourself, the easier it'll be for you to feel at home and comfortable in your environment."; 
          }

        //if statement to print November Scorpio 
          if (birthMonth == 11 && birthDay >= 1 && birthDay <= 21)
          {
            return "Scorpio and your February horoscope is: You may have the inclination to move or feel a certain urging to travel, which is certainly understandable due to the pandemic. Your ideas may feel restricted right now, and you could be facing difficulties articulating exactly what you feel to those around you. As February persists, be patient with yourself. There’s no need to feel shame or guilt if you decide to be a hermit. Sometimes all you can do is allow yourself downtime. Exercise your creativity through projects or leisurely activities, such as scrapbooking or photography. The less pressure you put on yourself, the easier it'll be for you to feel at home and comfortable in your environment."; 
          }

        //if statement to print November Sagittarius
          if (birthMonth == 11 && birthDay >= 22 && birthDay <= 30)
          {
            return "Sagittarius and your February horoscope is: Communication is undoubtedly difficult to have during February, and you have Mercury Retrograde in Aquarius to thank for that. Expressing yourself can often feel easy to you, Sag, but for most of the month, you'll be challenged to prove how much you actually know. Try not to get fixated on what you cannot do. Instead, focus on strengthening your mind and diversifying your realm of awareness. Purchase a book from a genre outside of your typical reading list. You might find that exposing yourself to new perspectives will help you better understand the world around you."; 
          } 

        //if statement to print December Sagittarius
          if (birthMonth == 12 && birthDay >= 1 && birthDay <= 21)
          {
            return "Sagittarius and your February horoscope is: Communication is undoubtedly difficult to have during February, and you have Mercury Retrograde in Aquarius to thank for that. Expressing yourself can often feel easy to you, Sag, but for most of the month, you'll be challenged to prove how much you actually know. Try not to get fixated on what you cannot do. Instead, focus on strengthening your mind and diversifying your realm of awareness. Purchase a book from a genre outside of your typical reading list. You might find that exposing yourself to new perspectives will help you better understand the world around you."; 
          }

        //if statement to print December Capricorn
          if (birthMonth == 12 && birthDay >= 22 && birthDay <= 31 )
          {
            return "Capricorn and your February horoscope is: February looks like it could be a fun month for you, Cap. Despite the pandemic, there’s a certain indescribable feeling in the air. With Valentine’s day approaching, you may feel an unspoken desire to either pamper or be pampered. You shouldn’t deny yourself during this romantic, sensual period, but try to manage your money and your resources responsibly. You may have natural inclinations to treat and be treated — and you’re always capable of attracting abundance and wealth, but be sure to stay within your budget as payment often ebbs and flows."; 
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
import java.util.Scanner;

public class DisplayCalendar {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter year: ");
    int year = input.nextInt();
    System.out.print("Enter first day of year: (0 for Sunday, 1 for Monday, ...) ");
    int day = input.nextInt();
    int month = 1;
    
    while (month <= 12){
        
        int length = 30 + ((month + (int)(month / 8.0)) % 2);
        if (month == 2){
          if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            length = 29;
          else
            length = 28;  
         } // if february   
        
        switch(month){
          case 1: System.out.printf("%28s", "January " + year + '\n'); break;
          case 2: System.out.printf("%28s", "February " + year + '\n'); break;
          case 3: System.out.printf("%28s", "March " + year + '\n'); break;
          case 4: System.out.printf("%28s", "April " + year + '\n'); break;
          case 5: System.out.printf("%28s", "May " + year + '\n'); break;
          case 6: System.out.printf("%28s", "June " + year + '\n'); break;
          case 7: System.out.printf("%28s", "July " + year + '\n'); break;
          case 8: System.out.printf("%28s","August " + year + '\n'); break;
          case 9: System.out.printf("%28s","September " + year + '\n'); break;
          case 10: System.out.printf("%28s","October " + year + '\n'); break;
          case 11: System.out.printf("%28s","November " + year + '\n'); break;
          case 12: System.out.printf("%28s","December " + year + '\n'); break;
        } // switch month
        
        System.out.println("-----------------------------------------");
        System.out.printf("%-6s%-6s%-6s%-6s%-6s%-6s%-6s\n", "Sun", "Mon",
                          "Tue", "Wed", "Thu", "Fri", "Sat");
        
        day = day % 7;
        if (day != 0) 
          System.out.print(String.format("%" + 6 * day + "s", ""));
        
        
        for (int i = 1; i <= length; i++){
          System.out.printf("%-6d", i);
          if (day % 7 == 6)
            System.out.println();
          day += 1;
        } // for i
        
        System.out.println();
        month++;
    } // while

    
  } // main 
} // DisplayCalendar

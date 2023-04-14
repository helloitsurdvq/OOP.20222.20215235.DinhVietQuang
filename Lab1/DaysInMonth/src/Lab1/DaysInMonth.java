package Lab1;
import java.util.Scanner;
public class DaysInMonth {
	public static int getMonthNumber(String monthName){
        String[] monthNames = {"january", "february", "march", "april", "may", "june",
            "july", "august", "september", "october", "november", "december"};
        String[] monthAbb = {"jan", "feb", "mar", "apr", "may", "jun", "jul",
            "aug", "sep", "oct", "nov", "dec"};
        
        for (int i = 0; i < monthNames.length; i++){
            if(monthName.equals(monthNames[i]) || monthName.equals(monthAbb[i])){
                return i + 1;
            }
        }
        try {
            int monthNum = Integer.parseInt(monthName);
            if(monthNum >= 1 && monthNum <= 12) return monthNum;
        } catch (NumberFormatException e){
            // ignore
        }
        return -1;
    }
	
    public static int getDates(int month, int year){
        if (month < 1 || month > 12) return -1;  
        if (year < 1) return -1;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = daysInMonth[month - 1];
        if(month == 2 && isLeapYear(year)){
            day = 29;
        }
        return day;
    }
    
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int day = 0, year = 0;
        while(true){
            System.out.print("Enter the month and year: ");
            String input = inp.nextLine().trim().toLowerCase();
            String[] parts = input.split(" ");
            if(parts.length != 2) {
                System.out.println("Invalid input.");
                continue;
            }
            String monthName = parts[0];
            String yearStr = parts[1];
            try{
                year = Integer.parseInt(yearStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid year.");
                continue;
            }
            int month = getMonthNumber(monthName);
            if(month == -1){
                System.out.println("Invalid month.");
                continue;
            }
            day = getDates(month, year);
            if(day == -1){
                System.out.println("Invalid year.");
                continue;
            }   
            break;
        }
        System.out.printf("Number of days in the month: %d%n", day);
    }
}
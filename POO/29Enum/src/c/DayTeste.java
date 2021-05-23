/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;

public class DayTeste {
    Day day;
    
    public DayTeste(Day day) {
        this.day = day;
    }
    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        DayTeste firstDay = new DayTeste(Day.MONDAY);
        firstDay.tellItLikeItIs();
        DayTeste thirdDay = new DayTeste(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        DayTeste fifthDay = new DayTeste(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        DayTeste sixthDay = new DayTeste(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        DayTeste seventhDay = new DayTeste(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}

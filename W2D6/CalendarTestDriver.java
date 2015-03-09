/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d6;
import java.util.Calendar;
/**
 *
 * @author ZBrodale
 */
public class CalendarTestDriver {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(1982, 4, 27, 7, 50);
        String s = String.format("My birthday is: %tA, %<tB %<td %<tY", cal.getTime());
        System.out.println(s);
    }
}

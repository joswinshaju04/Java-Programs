/* 
 * Title: Switch Example
 * Author : Joswin Shaju
 * Date : 11/07/2025
 */

package prgms;

public class SwitchExample {
	public static void main(String[] args) {
		int day = 3;
		String name = switch (day) {
			case 1->"Sunday";
			case 2->"Monday";
			case 3->"Tuesday";
			case 4->"Wednesday";
			case 5->"Thursday";
			case 6->"Friday";
			case 7->"Saturday";
			default ->"Invalid";
		};
		System.out.println("Day: " +name);
	}

}

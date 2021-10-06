//info on https://www.youtube.com/watch?v=_tS2gw5l1TY&ab_channel=ProfessorSaad

package ie.gmit.dip;

public class Formatter {
public static void main(String[] args) {
	String formatting = "%-20s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s%-7s\n";
	//13 x %-7s put in here
	System.out.printf(formatting, "Size", "100", "200", "500", "750", "1000", "1250", "2500", "3750", "5000", "6250", "7500", "8750", "10000" );
	
	String Algoname = "Insertion Sort";
	String Res1 = "test";
	System.out.printf(formatting, Algoname, Res1, Res1, Res1, Res1,Res1,Res1,Res1,Res1,Res1,Res1,Res1,Res1,Res1);

}
}

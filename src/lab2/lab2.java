package lab2;

/*import javax.swing.JOptionPane;

public class lab2 {
	public static void main(String[] args) {
		String strheart = "  *   *\n"
						+ " *** *** \n"
						+ "*********\n"
						+ " *******\n"
						+ "  *****\n"
						+ "   ***\n"
						+ "    *\n";
						
		String show = "";
		String str = JOptionPane.showInputDialog("This program show heart");
		int num = Integer.parseInt(str);
		for (int i = 1;i <= num;i++) {
			show = show + strheart + "\n\n";
		}
		JOptionPane.showMessageDialog(null, show);
	}
}*/

/*import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class lab2 {
   public static void main(String[] args) throws FileNotFoundException {
   	File f = new File("D:\\data1.txt");
       PrintWriter p1 = new PrintWriter(f);
       p1.println("n74 Poommin Lakornchai 68160041 Nick");
       p1.close();
   }
}*/

/*import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class lab2 {
   public static void main(String[] args) throws FileNotFoundException {
	   File f = new File("D:\\data2.txt");
       PrintWriter p1 = new PrintWriter(f);
	   
	   String str = JOptionPane.showInputDialog("Enter a number : ");
	   int num = Integer.parseInt(str);
	   double sum = Math.pow(num, 2);
	   JOptionPane.showMessageDialog(null, "result of "+num+"^2 is "+sum);
	   
       p1.println("result of "+num+"^2 is "+sum);
       p1.close();
   }
}*/

/*import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class lab2 {
   public static void main(String[] args) throws FileNotFoundException {
	   File f = new File("D:\\data3.txt");
       PrintWriter p1 = new PrintWriter(f);
	   
	   String str = JOptionPane.showInputDialog("Enter a number : ");
	   int num = Integer.parseInt(str);
	   
	   String a = "";
	   for (int i = 1;i <= 12;i++) {
		   a += num + " x "+ i + " = " + (num*i) + "\n";
	   }
	   
	   JOptionPane.showMessageDialog(null, a);
	   
       p1.println(a);
       p1.close();
   }
}*/

/*import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class lab2 {
   public static void main(String[] args) throws FileNotFoundException {
	   File f = new File("D:\\data4.txt");
       PrintWriter p1 = new PrintWriter(f);
	   
       String strheart = "  *   *\n"
				+ " *** *** \n"
				+ "*********\n"
				+ " *******\n"
				+ "  *****\n"
				+ "   ***\n"
				+ "    *\n";
				
       String show = "";
       String str = JOptionPane.showInputDialog("This program show heart");
       int num = Integer.parseInt(str);
       for (int i = 1;i <= num;i++) {
    	   show = show + strheart + "\n\n";
       }
       JOptionPane.showMessageDialog(null, show);
	   
       p1.println(show);
       p1.close();
   }
}*/

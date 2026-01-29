package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class lab3 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("D:\\number.txt");
		Scanner s = new Scanner(f);
		
		int a;
		int sum = 0;
		
		while (s.hasNext()) {
			a = s.nextInt();
			sum += a;
			System.out.print(a + " ");
		}
		JOptionPane.showMessageDialog(null, "sum of all number in number.txt is "+sum);
	}
}

/*import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class lab3 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("D:\\mark.txt");
		Scanner s = new Scanner(f);
		PrintWriter p1 = new PrintWriter("D:\\report.txt");
		int id,n1,n2,n3,sum = 0;
		char grade;
		int cA = 0,cB = 0,cC = 0,cD = 0,cF = 0;
		
		while (s.hasNext()) {
			id = s.nextInt();
			n1 = s.nextInt();
			n2 = s.nextInt();
			n3 = s.nextInt();
			
			sum = n1+n2+n3;
			
			if(sum >= 80) {
				grade = 'A';cA++;
			} else if (sum >= 70) {
				grade = 'B';cB++;
			} else if (sum >= 60) {
				grade = 'C';cC++;
			} else if (sum >= 50) {
				grade = 'D';cD++;
			} else {
				grade = 'F';cF++;
			}
			System.out.println(id+" " +n1+" "+n2+" "+n3+" grade "+grade);
		}
		p1.println("get A grade = "+cA);
		p1.println("get B grade = "+cB);
		p1.println("get C grade = "+cC);
		p1.println("get D grade = "+cD);
		p1.println("get F grade = "+cF);
		p1.close();
	}
}*/

/*import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class lab3 {
	public static void printG(PrintWriter p,String name,File file) throws FileNotFoundException {
		Scanner s = new Scanner(file);

		int id,n1,n2,n3,sum = 0;
		char grade;
		int cA = 0,cB = 0,cC = 0,cD = 0,cF = 0;
		
		p.println(name);
		p.println("   id    midterm   final   assignment   total   grade");
		while (s.hasNext()) {
			id = s.nextInt();
			n1 = s.nextInt();
			n2 = s.nextInt();
			n3 = s.nextInt();
			
			sum = n1+n2+n3;
			
			if(sum >= 80) {
				grade = 'A';cA++;
			} else if (sum >= 70) {
				grade = 'B';cB++;
			} else if (sum >= 60) {
				grade = 'C';cC++;
			} else if (sum >= 50) {
				grade = 'D';cD++;
			} else {
				grade = 'F';cF++;
			}
			p.println(id+"    " +n1+"       "+n2+"        "+n3+"         "+sum+"      "+grade);
		}
		
		p.println("Grade summary");
		p.println("A = "+cA);
		p.println("B = "+cB);
		p.println("C = "+cC);
		p.println("D = "+cD);
		p.println("F = "+cF);
	}
	public static void main(String[] args) throws FileNotFoundException {
		File f1 = new File("D:\\mark1.txt");
		File f2 = new File("D:\\mark2.txt");
		File f3 = new File("D:\\mark3.txt");
		
		PrintWriter p1 = new PrintWriter("D:\\reportAll.txt");
		printG(p1,"Group 1",f1);
		printG(p1,"Group 2",f2);
		printG(p1,"Group 3",f3);
		p1.close();
		
	}
}*/

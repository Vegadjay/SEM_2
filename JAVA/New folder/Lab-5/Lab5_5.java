import java.util.*;

class Complex{
	int realno;
	int imgno;
	Complex(){
		realno = 0;
		imgno = 0;
	}
	Complex(int r, int i){
		this.realno = r;
		this.imgno = i;

	}
	void addComplex(Complex a, Complex b){
		this.realno = a.realno+b.realno;
		this.imgno = a.imgno+b.imgno;
	}
}

public class Lab5_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Real and Imaginary No: ");
		int rr = sc.nextInt();
		int ii = sc.nextInt();
		Complex c1 = new Complex(rr,ii);
		System.out.print("Enter 2nd Real and Imaginary No : ");
		rr = sc.nextInt();
		ii = sc.nextInt();
		Complex c2 = new Complex(rr,ii);
		Complex c3 = new Complex();
		c3.addComplex(c1,c2);
		
		System.out.println("Real No and Imaginary No are :"+c3.realno+ " "+c3.imgno);

	}
	
}

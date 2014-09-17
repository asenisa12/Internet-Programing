package elsys.org.homework;

public class Main {

	public static void main(String[] args) {
		int a=1;
		
		for(int i=0;;i++){
			a++;
			if(i>10) break;
		}
		
		System.out.println(a);
		
		PrintNum pn1 = new PrintNum(2);
		PrintNum pn2 = new PrintNum(a);

		if(pn1.equals(pn1)) pn1.print();
		if(pn1.equals(pn2)) pn2.print();

	}

}

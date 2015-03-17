import java.util.Scanner;


public class question5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter credit card number: ");
		double cardnum=input.nextDouble();
		
		input.close();
		
		double firstdigit=((cardnum%Math.pow(10, 16))-(cardnum%Math.pow(10, 15)))/Math.pow(10, 15);
		double seconddigit=((cardnum%Math.pow(10, 15))-(cardnum%Math.pow(10, 14)))/Math.pow(10, 14);
		double thirddigit=((cardnum%Math.pow(10, 14))-(cardnum%Math.pow(10, 13)))/Math.pow(10, 13);
		double fourthdigit=((cardnum%Math.pow(10, 13))-(cardnum%Math.pow(10, 12)))/Math.pow(10, 12);
		double fifthdigit=((cardnum%Math.pow(10, 12))-(cardnum%Math.pow(10, 11)))/Math.pow(10, 11);
		double sixthdigit=((cardnum%Math.pow(10, 11))-(cardnum%Math.pow(10, 10)))/Math.pow(10, 10);
		double seventhdigit=((cardnum%Math.pow(10, 10))-(cardnum%Math.pow(10, 9)))/Math.pow(10, 9);
		double eighthdigit=((cardnum%Math.pow(10, 9))-(cardnum%Math.pow(10, 8)))/Math.pow(10, 8);
		double ninthdigit=((cardnum%Math.pow(10, 8))-(cardnum%Math.pow(10, 7)))/Math.pow(10, 7);
		double tenthdigit=((cardnum%Math.pow(10, 7))-(cardnum%Math.pow(10, 6)))/Math.pow(10, 6);
		double eleventhdigit=((cardnum%Math.pow(10, 6))-(cardnum%Math.pow(10, 5)))/Math.pow(10, 5);
		double twelfthdigit=((cardnum%Math.pow(10, 5))-(cardnum%Math.pow(10, 4)))/Math.pow(10, 4);
		double thirteenthdigit=((cardnum%Math.pow(10, 4))-(cardnum%Math.pow(10, 3)))/Math.pow(10, 3);
		double fourteenthdigit=((cardnum%Math.pow(10, 3))-(cardnum%Math.pow(10, 2)))/Math.pow(10, 2);
		double fifteenthdigit=((cardnum%Math.pow(10, 2))-(cardnum%Math.pow(10, 1)))/Math.pow(10, 1);
		double sixteenthdigit=((cardnum%Math.pow(10, 1))-(cardnum%Math.pow(10, 0)))/Math.pow(10, 0);
		
		double realfifteenthdigit=fifteenthdigit*2;
		if (realfifteenthdigit>=10){
			 realfifteenthdigit=realfifteenthdigit%10+1;
		}
		double realthirteenthdigit=thirteenthdigit*2;
		if (realthirteenthdigit>=10){
			 realthirteenthdigit=realthirteenthdigit%10+1;
		}
		double realeleventhdigit=eleventhdigit*2;
		if (realeleventhdigit>=10){
			 realeleventhdigit=realeleventhdigit%10+1;
		}
		double realninthdigit=ninthdigit*2;
		if (realninthdigit>=10){
			 realninthdigit=realninthdigit%10+1;
		}
		double realseventhdigit=seventhdigit*2;
		if (realseventhdigit>=10){
			 realseventhdigit=realseventhdigit%10+1;
		}
		double realfifthdigit=fifthdigit*2;
		if (realfifthdigit>=10){
			 realfifthdigit=realfifthdigit%10+1;
		}
		
		double realthirddigit=thirddigit*2;
		if (realthirddigit>=10){
			 realthirddigit=realthirddigit%10+1;
		}
		double realfirstdigit=firstdigit*2;
		if (realfirstdigit>=10){
			 realfirstdigit=realfirstdigit%10+1;
		}
		double sum=realfirstdigit+seconddigit+realthirddigit+fourthdigit+realfifthdigit+sixthdigit+realseventhdigit+eighthdigit+realninthdigit+tenthdigit+realeleventhdigit+twelfthdigit+realthirteenthdigit+fourteenthdigit+realfifteenthdigit;
		
		double lastcarddigit=(sum*9)%10;
		System.out.println("Based on Luhn algorithm last number on card is:");
		System.out.println(lastcarddigit); 
		
		if(lastcarddigit==sixteenthdigit){
			System.out.print("Card is valid");
		}
		else if(lastcarddigit!=sixteenthdigit){
			System.out.print("Your card is not valid");
		}
	}

}

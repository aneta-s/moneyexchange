package mainmoneyexchange1909;
import java.util.Scanner;

public class MoneyExchange1909Launcher {

	public static void main(String[] args) {
		final double US_DOLLAR=1.9876;
		final double GB_POUNDS=1.5467;
		final double YEN=0.5678;
		double euroBedrag=0;
		double uitbetaling;
		Scanner input=new Scanner(System.in);
		boolean doorgaan=true;
		while (doorgaan) {
			System.out.println();
			System.out.print("1 dollar, 2 gb pond, 3 yetn 0 stoppen");
			int valutakeuze=input.nextInt();
			while (valutakeuze==0) {
				System.out.println("het programma stopt");
				valutakeuze=input.nextInt();
			}
			while (valutakeuze!= 1 && valutakeuze!= 2 && valutakeuze!= 3) {
				System.out.println("ongeldige keuze");
				System.out.print("1 dollar, 2 gb pond, 3 yetn 0 stoppen");
				valutakeuze=input.nextInt();


			}
			System.out.println("hoe veel inwisselen?");
			int wisselbedrag=input.nextInt();

			if (valutakeuze==1) {
				euroBedrag=wisselbedrag/US_DOLLAR;
				double transactiekosten=berekenTransactiekosten(euroBedrag);

				System.out.printf("voor "+wisselbedrag+" US dollars krijg je %4.2f",euroBedrag);
				System.out.println();
				System.out.printf("transactiekosten zijn %4.2f euro",transactiekosten);
			} else if (valutakeuze==2) {
				euroBedrag=wisselbedrag/GB_POUNDS;
				double transactiekosten=berekenTransactiekosten(euroBedrag);

				System.out.printf("voor "+wisselbedrag+" GB POUNDS krijg je %4.2f",euroBedrag);
				System.out.println();
				System.out.printf("transactiekosten zijn %4.2f euro",transactiekosten);
			} else {
				euroBedrag=wisselbedrag/YEN;
				double transactiekosten=berekenTransactiekosten(euroBedrag);
				uitbetaling=euroBedrag-transactiekosten;

				System.out.printf("voor "+wisselbedrag+" YEN krijg je %4.2f",euroBedrag);
				System.out.println();
				System.out.printf("transactiekosten zijn %4.2f euro",transactiekosten);
				System.out.println();
				System.out.printf("uit te betalen in €: %4.2f",uitbetaling);
			}
		}

	}


	public static double berekenTransactiekosten(double euroBedrag){
		double transactiekosten;
		transactiekosten=euroBedrag*(1.5/100);

		return transactiekosten;
	}
}

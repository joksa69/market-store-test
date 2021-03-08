package main;
import cards.Card;
import cards.BronzeCard;
import cards.SilverCard;
import cards.GoldCard;
import cardowners.CardOwner;
import register.Register;
import register.Invoice;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		Invoice invoice = new Invoice();
		
		//Example output by card type, descending from Bronze to Gold
		CardOwner cardOwner = new CardOwner("John","Doe");
		Card card = new BronzeCard(cardOwner);
		System.out.println("1. Bronze:" +"\n"
							+"a. Mock data: turnover $0, purchase value $150" + "\n"
							+ "b. Output:");
		invoice.printInvoice(150, card);
		
		cardOwner = new CardOwner("Jane","Doe");
		card = new SilverCard(cardOwner);
		card.setTurnover(600);
		System.out.println("2. Silver:" +"\n"
				+"a. Mock data: turnover $600, purchase value $850" + "\n"
				+ "b. Output:");
		invoice.printInvoice(850, card);
		
		cardOwner = new CardOwner("Doe","Doe");
		card = new GoldCard(cardOwner);
		card.setTurnover(1500);
		System.out.println("3. Gold:" +"\n"
				+"a. Mock data: turnover $1500, purchase value $1300" + "\n"
				+ "b. Output:");
		invoice.printInvoice(1300, card);
		
	}

}

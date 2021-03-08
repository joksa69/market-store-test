package register;
import cards.Card;

public class Register {
	public static double discountRate(Card card) {
		if (card==null) {
			return 0;
		}
		
		return card.currentRate();	
	}
	
	public static double discount(double purchaseValue, Card card) {
		return discountRate(card) / 100 * purchaseValue;
	}
	
	public static double total(double purchaseValue, Card card) {
			return purchaseValue - discount(purchaseValue, card);
	}
}

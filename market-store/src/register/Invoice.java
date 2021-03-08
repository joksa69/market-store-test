package register;
import cards.Card;
import java.text.DecimalFormat;

public class Invoice {
	public static void printInvoice (int purchaseValue, Card card) {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.println(
				"Purchase value: $" + df.format(purchaseValue) + ":\n"
				+ "Discount rate: " + df.format(Register.discountRate(card)) + "%" + ":\n"
				+ "Discount: $" + df.format(Register.discount(purchaseValue, card)) + ":\n"
				+ "Total: $" + df.format(Register.total(purchaseValue, card)) + ":\n");
	}
}

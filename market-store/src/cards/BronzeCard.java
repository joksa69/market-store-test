package cards;
import cardowners.CardOwner;

public class BronzeCard extends Card {

	public BronzeCard(CardOwner cardOwner) {
		super(CardType.BRONZE, cardOwner, 0);
	}

	@Override
	public double currentRate() {
		if(getTurnover() < 100) {
			return getInitialRate();
		} if(getTurnover() <= 300) {
			return 1;
		} 		
			return 2.5;
	}
		
}

package cards;
import cardowners.CardOwner;

public class SilverCard  extends Card {

	public SilverCard(CardOwner cardOwner) {
		super(CardType.SILVER, cardOwner, 1);
	}

	@Override
	public double currentRate() {
		if(getTurnover() <= 300) {
			return getInitialRate();
		} 		
			return 3.5;
	}
}

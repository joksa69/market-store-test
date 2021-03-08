package cards;
import cardowners.CardOwner;

public class GoldCard extends Card {

	public GoldCard(CardOwner cardOwner) {
		super(CardType.GOLD, cardOwner, 2);
	}

	@Override
	public double currentRate() {
		if (getTurnover() < 100) {
			return getInitialRate();
		}
		
		double growthRate = 2.5;
		double growthStep = 100;
		int growthCap = 10;
		
		double additionalRate = growthRate * (int) (getTurnover() / growthStep);
		double currentRate = getInitialRate() + additionalRate;
		
		if (currentRate > growthCap) {
			return growthCap;
		}
		
		return currentRate;
	}
	
}

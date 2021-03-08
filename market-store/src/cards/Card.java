package cards;
import cardowners.CardOwner;

public abstract class Card {
	private CardType cardType;
	private CardOwner cardOwner;
	private double initialRate;
	private double turnover;
	
	public Card(CardType cardType, CardOwner cardOwner, double initialRate) {
		this.cardType = cardType;
		this.cardOwner = cardOwner;
		this.initialRate = initialRate;
	}
	
	public abstract double currentRate();

	public CardType getCardType() {
		return cardType;
	}

	public CardOwner getCardOwner() {
		return cardOwner;
	}

	public double getInitialRate() {
		return initialRate;
	}

	public double getTurnover() {
		return turnover;
	}
	
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	
	

}

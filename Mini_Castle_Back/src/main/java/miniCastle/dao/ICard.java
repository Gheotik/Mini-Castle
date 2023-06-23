package miniCastle.dao;

public interface ICard {
	public abstract String getDescription();
	
	public abstract int getScoreValue();
	
	public abstract void setScoreValue(int score);
	
	public abstract String getCardImagePath();
	
	public void run();
}

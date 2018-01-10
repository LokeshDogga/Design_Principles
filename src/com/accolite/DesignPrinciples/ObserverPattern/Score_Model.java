package com.accolite.DesignPrinciples.ObserverPattern;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Score_Model {
	
	private Score cur_score = new Score();
	private List<PropertyChangeListener> listeners =new ArrayList<PropertyChangeListener>() ;
	
	private void notifyListeners(Object obj , String property, String oldValue, String newValue) {
		for(PropertyChangeListener client : listeners) {
			client.propertyChange(new PropertyChangeEvent(this,property,oldValue,newValue));
		}
	}
	
	public void Subscribe(PropertyChangeListener newListener) {
        listeners.add(newListener);
    }
	
	public void updateScore(String new_score) {
		notifyListeners(this,"Score",cur_score.getScore(),new_score);
		cur_score.setScore(new_score);	
	}
	public void updatePlayer(String Player) {
		notifyListeners(this,"Player",cur_score.getPlayer1(),Player);
		cur_score.setScore(Player);	
	}

	public Score getScore() {
		return cur_score;
	}

	
	
}
class Score{
String Score;
float overs;
String Player1;
String player2;
public String getScore() {
	return Score;
}
public void setScore(String score) {
	Score = score;
}
public float getOvers() {
	return overs;
}
public void setOvers(float overs) {
	this.overs = overs;
}
public String getPlayer1() {
	return Player1;
}
public void setPlayer1(String player1) {
	Player1 = player1;
}
public String getPlayer2() {
	return player2;
}
public void setPlayer2(String player2) {
	this.player2 = player2;
}
public Score(String score, float overs, String player1, String player2) {
	super();
	Score = "0/0";
	this.overs = overs;
	Player1 = player1;
	this.player2 = player2;
}
public Score() {
	// TODO Auto-generated constructor stub
}

}











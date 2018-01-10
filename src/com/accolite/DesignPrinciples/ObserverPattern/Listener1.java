package com.accolite.DesignPrinciples.ObserverPattern;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class Listener1 implements PropertyChangeListener{

	public Listener1(Score_Model model) {
        model.Subscribe(this);
    }
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("Listener");
		 System.out.println("Changed property: " + evt.getPropertyName() + " [old -> "
		            + evt.getOldValue() + "] | [new -> " + evt.getNewValue() +"]");
		
	}
	
	public static void main(String[] args) {
		Score_Model scoremodel = new Score_Model();
		PropertyChangeListener client1 = new Listener1(scoremodel);
		PropertyChangeListener client2 = new Listener3(scoremodel);
		PropertyChangeListener client3 = new Listener2(scoremodel);
		
		Score sc = scoremodel.getScore();
		if(sc == null) {
			System.out.println("error");
		}
		else {
			sc.setScore("9/1");
			scoremodel.updateScore("56/2");
		}
		sc.setPlayer1("Dhoni");
		scoremodel.updatePlayer("Kohli");
	}

}

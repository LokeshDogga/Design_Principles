package com.accolite.DesignPrinciples.ObserverPattern;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Listener2 implements PropertyChangeListener {

	public Listener2(Score_Model model) {
        model.Subscribe(this);
}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("Listener 2 : ");
		System.out.println("Changed property: " + evt.getPropertyName() + " [old -> "
	            + evt.getOldValue() + "] | [new -> " + evt.getNewValue() +"]");
	
	}
}


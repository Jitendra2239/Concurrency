package headfirstdesignpattern;

import java.util.ArrayList;

public class WeatherData implements Subject{

	private ArrayList<Observer > observers;
  
	private float temperatue;
	private float humidity;
	private float Pressure;
	
	
	public WeatherData() {
		observers=new ArrayList<Observer >();

	}
	@Override
	public void registerObseber(Observer o) {
		observers.add(o);
		System.out.println("added observers");
		
	}

	@Override
	public void removeObseber(Observer o) {
		// TODO Auto-generated method stub
		int i=observers.indexOf(o);
		observers.remove(i);
		System.out.println("removed observers");
	}

	@Override
	public void notifyObseber() {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++) {
		  Observer observer=observers.get(i);
		  observer.update(temperatue, humidity, Pressure);
		}
	}
	
	

}

package headfirstdesignpattern;

public interface Observer {
	private Subject subject;
	
	public void update(float temperatue,float humidity,float Pressure);
}

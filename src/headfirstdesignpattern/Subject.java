package headfirstdesignpattern;

public interface Subject {
public void registerObseber(Observer o);
public void removeObseber(Observer o);
public void notifyObseber();
}

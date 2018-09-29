package hw12;

import java.util.ArrayList;

/**
 * A simulated critter.
 */
public class Critter
{
    private int position;
    private double weight;
    private ArrayList<String> history;

    /**
    Constructs a critter at position 0 with blank history.
     */
    public Critter(double theWeight)
    {
        position = 0;
        weight = theWeight;
        history = new ArrayList<String>();
    }

    /**
    Gets the history of this critter.
    @return the history
     */
    public ArrayList<String> getHistory()
    {
        return history;
    }

    /**
    Adds to the history of this critter.
    @param event the event to add to the history
     */
    public void addHistory(String event)
    {
        history.add(event);
    }

    /**
    Gets the position of this critter.
    @return the position
     */
    public int getPosition()
    {
        return position;
    }

    /**
    Moves this critter.
    @param steps the number of steps by which to move.
     */
    public void move(int steps)
    {
        position = position + steps;
        addHistory("move to " + position);
    }

    public double getWeight()
    {
        return weight;
    }
    
    public String toString()
    {
        String s = "Critter[position=" + position + ",weight=" + weight + ",history=" + getHistory() + "]" ;
        return s;
    }
    
    public boolean equals(Object otherObject)
    {
      if (otherObject == null)
        return false;
      if (this.getClass() != otherObject.getClass())
        return false;
      Critter other = (Critter)otherObject;
      return (position == other.position && weight == other.weight && getHistory().equals(other.getHistory()));
    } 
}


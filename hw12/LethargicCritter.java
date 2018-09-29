package hw12;

/**
 * Lethargic critter only eats and sleeps.
 * 
 */
public class LethargicCritter extends Critter
{
    private boolean timeToEat;

    /**
     * Constructor for objects of class LethargicCritter
     * with the given weight and a position of 0
     * @param weight weight of this critter
     */
    public LethargicCritter(double weight)
    {
        super(weight);
        timeToEat = true;
    }
    
    @Override
    public void move(int steps)
    {
        if (timeToEat)
        {
            addHistory("eat");
        }
        else
        {
            addHistory("sleep");
        }
        
        timeToEat = !timeToEat;
    } 
    @Override
    public String toString()
    {
        String s = "LethargicCritter[position=" + getPosition() + ",weight=" + getWeight() 
        + ",history=" + getHistory() + "][timeToEat=" + timeToEat + "]" ;
        return s;
    }
    @Override
    public boolean equals(Object otherObject)
    {
      if (otherObject == null)
        return false;
      if (this.getClass() != otherObject.getClass())
        return false;
      LethargicCritter other = (LethargicCritter)otherObject;
      return (getPosition() == other.getPosition() && getWeight() == other.getWeight()
    		  && getHistory().equals(other.getHistory()) && timeToEat == other.timeToEat);
    } 
    
   
}

public class Feeder {

    /**
     * The amount of food, in grams, currently in the bird feeder; initialized
     * in the constructor and always greater than or equal to zero
     */
    private int currentFood;
    public Feeder(int food)
    {
        currentFood =food;
    }

    public int getcurrentfood()
    {
        return currentFood;
    }
    /**
     * Simulates one day with numBirds birds or possibly a bear at the bird
     * feeder, as described in part (a) Precondition: numBirds > 0
     */
    public int simulateOneDay(int numBirds)
    {
        if (currentFood > 0)
            if (Math.random()<0.1)
                currentFood = 0;
            else
                currentFood -= (numBirds);
                if (currentFood < 0)
                        currentFood = 0;
        return currentFood;
    }

    /**
     * Returns the number of days birds or a bear found food to eat at the
     * feeder in this simulation, as described in part (b) Preconditions:
     * numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays)
    {
        int x = numDays;
        int y = 0;
        while (x != 0 && currentFood != 0)
        {
            System.out.println(simulateOneDay(numBirds));
            x -= 1;
            y += 1;

            if (currentFood == 0)
                break;
        }
        return (y);
    }

}

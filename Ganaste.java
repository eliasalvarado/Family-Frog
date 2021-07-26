import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ganaste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ganaste extends World
{

    /**
     * Constructor for objects of class Ganaste.
     * 
     */
    CoheteD1 cd1 = new CoheteD1();
    public Ganaste()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(626, 369, 1); 
    }
    public void act()
    {
        aparecer();
    }
    public void aparecer()
    {
        if(Greenfoot.getRandomNumber(10) == 0)
        {
            addObject(cd1, Greenfoot.getRandomNumber(100), 368);
        }
    }
}

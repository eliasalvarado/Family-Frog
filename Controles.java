import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controles extends World
{

    /**
     * Constructor for objects of class Controles.
     * 
     */
    GreenfootSound musicaControles = new GreenfootSound("musicaMenu.wav");
    public Controles()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(626, 369, 1);
        prepare();
    }
    public void started()
    {
        musicaControles.setVolume(50);
        musicaControles.playLoop();
    }
    public void act()
    {
        started();
        if(Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("enter"))
        {
            stopped();
            Greenfoot.setWorld(new Menu()); 
        }
    }
    private void prepare()
    {
        Puntero puntero = new Puntero();
        addObject(puntero,535,18);
        puntero.setLocation(536,19);
    }
    public void stopped()
    {
        if(musicaControles.isPlaying())
        {
            musicaControles.setVolume(0);
            musicaControles.pause();
        }
    }
}

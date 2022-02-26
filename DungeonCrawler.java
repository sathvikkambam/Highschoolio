import java.util.*;
public class DungeonCrawler
{
    public static void main (String [][] args)
    {
        System.out.println("The year is 2073");
        Thread.sleep(300);
        System.out.println("You are in a spaceship traveling to the distant galaxy of NGC-3048");
        Thread.sleep(300);
        System.out.println("A large meteor crashes into the right side of the ship");
        Thread.sleep(300);
        System.out.println("The badly damaged ship crashes into the planet Xghrgd");
        Thread.sleep(300);
        System.out.println("Your only way to escape the hostile aliens is to reach the rocket launch site");
        Thread.sleep(300);
        System.out.println("As you crawl out the spacehsip you see an alien with a saber approaching you... ");
        Thread.sleep(300);
        System.out.println("LEVEL 1 - CRASH SITE");
        Thread.sleep(300);
        
        for(int i = 0; i<10; i++)
        {
            for(int j = 0; j<10; j++)
            {
                System.out.print(array[i][j]);
            }
             System.out.println();
        }
        System.out.println("# is the player/n! is the enemy\n$ is where the player needs to reach");
    }   
}

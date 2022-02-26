public class Player
{
    public int potions;
    public Item armor;
    public Item  weapon;
    public int[] stats = {2,2,5}; // DEF, ATK, Health
    public Player()
    {
        potions = 1;
        armor = new Item(2, "basic", "armor");
        weapon = new Item(2, "basic", "weapon");
        weapon = "basic";  
    }
    public void usePot()
    {
        if(potions > 0)
        {
            potions --;
            stats[2] += 2;
            System.out.println("Health increased by 2");
        }
        else
        {
            System.out.println("No Health Potions left");
        }
    }
}

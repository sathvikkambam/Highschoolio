public class Enemy
{
    public int health;
    public int damage;
    public Enemy(int h, int d)
    {
        health = h;
        damage = d;
    }
    public void attackPlayer(Player p)
    {
        if((p.weapon).stat() > damage)
        {
            health=health-(p.weapon).stat();
        }
    }
}

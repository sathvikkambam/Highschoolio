public class Enemy
{
    public int health;
    public int damage;
    public Enemy(int h, int d)
    {
        health = h;
        damage = d;
    }
    public void attackPlayer()
    {
        if(Player.weapon.stat() > Enemy.damage)
        {
            Enemy.health=Enemy.health-Player.damage;
}

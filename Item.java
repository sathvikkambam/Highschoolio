public class Item
{
    public int stat;
    public String rarity, type;
    public Item(int s, String r, String type)
    {
        stat = s;
        rarity = r;
        this.type = type;
    }
    public void describe()
    {
        System.out.print("A " + rarity + " " + type + " with ");
        if(type.equals("armor"))
        {
            System.out.println("DEF " + stat);
        }
        else
        {
            System.out.println("ATK " + stat);
        }
    }
}
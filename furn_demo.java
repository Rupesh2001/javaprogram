class furniture
{
	double weight;double price;

	void value(double weight,double price)
	{
		this.weight=weight;
		this.price=price;
		System.out.println("weight:"+weight);
		System.out.println("price:"+price);
	}
}
class chair extends furniture
{
	void show(double weight ,double price)
	{
		value(weight,price);
	}
}
class furn_demo
{
	public static void main(String[] args)
	 {
		chair c=new chair();
		c.show(7.5,100);
		chair cc=new chair();
		cc.show(12.75,100);
	}
}
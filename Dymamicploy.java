class Bike
{
void run()
{
	System.out.println("running");}
}
class Splender extends Bike
{
void run()
{
	System.out.println("running safely with 60km");
}
}
class Dymamicploy 
{
public static void main(String[] args)
{
Bike b;
Splender s1 = new Splender();
Bike b1 = new Bike();
b = b1;
b.run();
b = s1;
b.run();
}
}

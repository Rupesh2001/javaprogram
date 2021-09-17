class Animal
{
  public void run()
  {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal
{
  public void run()
  {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal
{
  public void run()
  {
    System.out.println("The dog says: bow wow");
  }
}

class polymorphism {
  public static void main(String[] args) {
    Animal ob = new Animal();
    Animal obj = new Pig();
    Animal obj1 = new Dog();
        
    ob.run();
    obj.run();
    obj1.run();
  }
}
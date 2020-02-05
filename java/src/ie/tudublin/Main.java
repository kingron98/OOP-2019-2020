package ie.tudublin;

public class Main
{

    public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
	}
    
    public static void main(String[] arg)
    {
        
        System.out.println("Hello world!");

        Animal misty = new Dog(); // Polymorphism
        misty.setName("Misty");
        System.out.println(misty.getName());  
        misty.speak();  
        Cat topcat = new Cat();
        topcat.speak();
        System.out.println(topcat.getNumLives());

        while(topcat.getNumLives() != -1)
        {
            topcat.kill();
        }

        /*Main main = new Main();
		main.helloProcessing();
        */
        
    }
}

public class Driver
{
	public static void main(String[] args)
	{
		BibleBook book1 = new BibleBook("Matthew", 28, "The gospel of Jesus Christ");
		BibleBook book2 = new BibleBook("Acts", 28, "The beginning of the early church");
		BibleBook book3 = new BibleBook("Revelation", 22, "John's revelation of heaven");
		
		book1.display();
		book2.display();
		book3.display();
	}
}

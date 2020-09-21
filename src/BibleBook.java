
public class BibleBook
{
	private String name;
	private int numberOfChapters;
	private String summary;
	
	public BibleBook(String name, int numberOfChapters, String summary)
	{
		this.name = name;
		this.numberOfChapters = numberOfChapters;
		this.summary = summary;
	}
	
	public void display()
	{
		System.out.println("Book name: " + this.name + " (" + this.numberOfChapters + " chapters) - " + this.summary);
	}
}

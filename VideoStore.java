package pblSection2.Minor_Project2;

public class VideoStore {
	private Video []store=new Video[10];
	private int count=0;
	public int findVideoIndex(String name)
	{
		for(int i=0;i<count;i++)
		{
			if(store[i].getName().equals(name))
			{
				return i;
			}
		}
		return -1;
	}
	public void addVideo(String name)
	{
		Video v=new Video(name);
		store[count++]=v;
		
		System.out.println("Video "+v.getName()+" added Successfully.");
	}
	public void doCheckout(String name)
	{
		int ind=findVideoIndex(name);
		if(ind!=-1)
		{
			store[ind].doCheckout();
		}
		System.out.println("Video "+name+" checkedout successfully");
	}
	public void doReturn(String name)
	{
		int ind=findVideoIndex(name);
		if(ind!=-1)
		{
			store[ind].doReturn();
		}
		System.out.println("Video "+name+" returned successfully");
	}
	public void receiveRating(String name, int rating)
	{
		int ind=findVideoIndex(name);
		if(ind!=-1)
		{
			store[ind].recieveRating(rating);
		}
		System.out.println("Rating "+rating+" has been mapped to the video "+name);
		
	}
	public void listInventory()
	{
		System.out.println("----------------------------------------");
		System.out.println("Video Name     | Checkout      | Rating");
		for(int i=0;i<count;i++)
		{
			System.out.println(store[i].getName()+"     | "+store[i].getCheckout()+"     | "+store[i].getRating());
		}
		System.out.println("----------------------------------------");
	}
}

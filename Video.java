package pblSection2.Minor_Project2;

public class Video {
	private String videoname;
	private boolean checkout;
	private int rating;
	Video(String videoname)
	{
		this.videoname=videoname;
	}
	public String getName()
	{
		return videoname;
	}
	public void doCheckout()
	{
		checkout=true;
	}
	public void doReturn()
	{
		checkout=false;
	}
	public void recieveRating(int rating)
	{
		this.rating=rating;
	}
	public int getRating()
	{
		return rating;
	}
	public boolean getCheckout()
	{
		return checkout;
	}
}

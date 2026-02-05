package pblSection2.Minor_Project2;
import java.util.Scanner;

public class VideoLauncher {
	public static void main(String []args)
	{
		VideoStore vs=new VideoStore();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.print("MAIN MENU\r\n"
				+ "=========\n"
				+ "1. Add Videos\r\n"
				+ "2. Check Out Video\r\n"
				+ "3. Return Video\r\n"
				+ "4. Receive Rating\r\n"
				+ "5. List Inventory\r\n"
				+ "6. Exit\r\n"
				+ "Enter your choice (1..6):");
		int inp=sc.nextInt();
		sc.nextLine();
		if(inp==1)
		{
			System.out.print("Enter the name of the video you want to add:");
			String name=sc.nextLine();
			vs.addVideo(name);
		}
		else if(inp==2)
		{
			System.out.print("Enter the name of the video you want to check out :");
			String name=sc.nextLine();
			vs.doCheckout(name);
		}
		else if(inp==3)
		{
			System.out.print("Enter the name of the video you want to return :");
			String name=sc.nextLine();
			vs.doReturn(name);
		}
		else if(inp==4)
		{
			System.out.print("Enter the name of the video you want to rate :");
			String name=sc.nextLine();
			System.out.print("Enter the rating for this video:");
			int rating=sc.nextInt();
			sc.nextLine();
			vs.receiveRating(name,rating );
		}
		else if(inp==5)
		{
			vs.listInventory();
		}
		else if(inp==6)
		{
			break;
		}
		else {
			System.out.println("Enter a Valid choice");
		}
		}
		sc.close();
		System.out.println("thank you");
	}
}

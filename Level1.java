

package cricket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Level1 {
	public static void main(String args[]) throws NumberFormatException, IOException{  
	     
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Select the player mode:");
		System.out.println("1.PvE");
		System.out.println("2.PvP");
		int x= Integer.parseInt(in.readLine());
		
		System.out.println("Select the batsman:");
		System.out.println("0-passive");
		System.out.println("1-aggressive");
		int batsman=Integer.parseInt(in.readLine());
		
		int current_runs=0;
		int runs=0;
		
		for(int i=0; i<6;i++)
		{
			
			
			switch(x)
			{
				case 1:
				{
					
					
					List<String> list = new ArrayList<>(); 
			        // add 5 element in ArrayList 
			        list.add("Full toss"); 
			        list.add("Yorker"); 
			        list.add("Out-swinger"); 
			        list.add("In-swinger"); 
			        list.add("Bouncer"); 
			        list.add("Slower Ball"); 
			        
			        Random rand = new Random(); 
			        String ball=list.get(rand.nextInt(list.size())); 
			        
			        current_runs=current_runs+runs;
			        System.out.println(" Current Runs"+current_runs);
					System.out.println("Runs on last ball"+runs);
					System.out.println("Current Ball"+ball);
			        
			        switch(ball)
			        {
				        case "Full toss":
				        {
				        	
				        	System.out.println("Select your shot:");
				        	System.out.println("0.Defend-0-20");
							System.out.println("1.Run-1-42.8");
							System.out.println("2.Run Fast-2-33.3");
							System.out.println("3.Square Cut-4-42.8");
							System.out.println("4.Helicopter-6-50");
							int shot=Integer.parseInt(in.readLine());
							
							runs=runs+1;
							
				        };
				        
				        case "Yorker":
				        {
				        	System.out.println("Select your shot:");
				        	System.out.println("0.Defend-5-40");
							System.out.println("1.Run-7-57.1");
							System.out.println("2.Straight Drive-6-50");
							System.out.println("3.Square Cut-7-57");
							System.out.println("4.Hook-7-57");
							int shot=Integer.parseInt(in.readLine());
							
							runs=runs+1;
				        };
				        
				        case "Out-swinger":
				        {
				        	System.out.println("Select your shot:");
				        	System.out.println("0.Defend-5-40");
							System.out.println("1.Run-7-57.1");
							System.out.println("2.Cover Drive-7-57");
							System.out.println("3.Pull-8-62.5");
							System.out.println("4.Helicopter-8-62.5");
							int shot=Integer.parseInt(in.readLine());
							
							runs=runs+2;
				        };
				        
				        case "In-swinger":
				        {
				        	System.out.println("Select your shot:");
				        	System.out.println("0.Defend-5-60");
							System.out.println("1.Run-7-71.4");
							System.out.println("2.On Drive-5-60");
							System.out.println("3.Pull-8-75");
							System.out.println("4.Hook-7-71.4");
							int shot=Integer.parseInt(in.readLine());
							
							runs=runs+5;
				        };
				        
				        case "Bouncer":
				        {
				        	System.out.println("Select your shot:");
				        	System.out.println("0.Defend-5-20");
							System.out.println("1.Run-7-42.8");
							System.out.println("2.Cover Drive-7-42.8");
							System.out.println("3.Pull-8-50");
							System.out.println("4.Hook-7-42.8");
							int shot=Integer.parseInt(in.readLine());
							
							runs=runs+4;
				        };
				        
				        case "Slower Ball":
				        {
				        	System.out.println("Select your shot:");
				        	System.out.println("0.Defend-5-60");
							System.out.println("1.Run-7-71.4");
							System.out.println("2.On Drive-5-60");
							System.out.println("3.Pull-8-75");
							System.out.println("4.Helicopter-8-75");
							int shot=Integer.parseInt(in.readLine());
							
							runs=runs+2;
				        };
				        
				        break;
				        
			        }
			        
			        
			        
				};
				
				break;
			}
		}
		
		System.out.println("Final Score="+current_runs);
	}
}
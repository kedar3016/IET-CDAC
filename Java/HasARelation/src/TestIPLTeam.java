
import java.util.*;

public class TestIPLTeam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			System.out.println("1:Add new Team\n2:Display All team\n3:Search team By id\n4: Add new Player"
					+ "\n5:Search Player By ID\n0:Exit");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch) {
				case 1: boolean status = TeamService.addNewTeam();
					   	if(status) {
					   		System.out.println("Team Added Sucessfully!!");
					   	}
						else {
							System.out.println("Error : Team not Added!!! ");
						}
						break;
						
				case 2 :TeamService.displayAll();
						break;
						
						
				case 3:	System.out.println("Enter the Pid : ");
						int tid = sc.nextInt();
						Team t = TeamService.findByTid(tid);
						if(t != null) {
							System.out.println(t);
						}
						else {
							System.out.println("Error!!!");
						}
						
						break;
						
						
				case 4: System.out.println("Enter the Team id : ");
						int tid1  = sc.nextInt();
						System.out.println("Enter the Player id ");
						int pid1 = sc.nextInt();
						System.out.println("Enter the Player Name : ");
						String pname = sc.next();
						System.out.println("Enter the Speciality: ");
						String sp = sc.next();
						boolean stat = TeamService.addNewPlayer(tid1,pid1,pname,sp);
						if(stat) {
							System.out.println("Player Added Succesfully!!");
						}
						else {
							System.out.println("Error!!");
						}
					
				case 5:System.out.println("Enter the Pid : ");
						int id = sc.nextInt();
						Team t1 = TeamService.findPlayer(id);
						
						if(t1 != null) {
							System.out.println(t1);
						}
						else {
							System.out.println("Not Found!!");
						}
						break;
				
				
				case 0:	System.out.println("Thank You For Visiting!!!");
						break;
			}
			
		}while(ch != 0);
		sc.close();

	}

}

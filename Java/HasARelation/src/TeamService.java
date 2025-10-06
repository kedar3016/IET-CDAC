
import java.util.*;

public class TeamService {
	
	static Team[] tarr;
	static int cnt = 0;
	
	
	
	static{
		tarr = new Team[10];
		
		Player[] plst= new Player[15];
		plst[0]=new Player(11,"Virat Kohali","Batsman");
		plst[1]=new Player(12,"Tilak varma","Batsman");
		plst[2]=new Player(13,"Hardik Pandya","Allrounder");
		Player c = new Player(45,"Rohit Sharma","Batsman");
		tarr[0] = new Team(101,"MI",c,plst,3);
		
		cnt = 1;
	}

	public static boolean addNewTeam() {
		Scanner sc  = new Scanner(System.in);
		if(cnt!=20) {
		System.out.println("Enter the Team id : ");
		int tid = sc.nextInt();
		System.out.println("Enter the Team Name : ");
		String tname = sc.next();
		
		System.out.println("Enter the Captain Id");
		int cId = sc.nextInt();
		System.out.println("Enter the Captain Name");
		String cName = sc.next();
		System.out.println("Enter the Speciality : ");
		String sp = sc.next();
		Player c = new Player(cId,cName,sp);
		
		
		Player plst[] = new Player[15];
		plst[0] = c;
		int  i =1;
		String ans = "y";
		do {
			System.out.println("Enter the Player Id : ");
			int pId = sc.nextInt();
			System.out.println("Enter the Player Name : ");
			String pName = sc.next();
			System.out.println("Enter the Speciality : ");
			String playerSp = sc.next();
			plst[i++] = new Player(pId,pName,playerSp); 
			System.out.println("You want to add new Player : ");
			ans = sc.next();
			
		}while(ans.equals("y"));
		
		tarr[cnt] = new Team(tid,tname,c,plst,i);
		cnt++;
		
		return true;
		}
		return false;
		
		
		}
	
	public static void displayAll() {
		for(Team t : tarr) {
			if(t != null) {
				System.out.println(t);
			}
			else {
				break;
			}
		}
	}

	public static Team findByTid(int tid) {
		for(Team t : tarr) {
			if(t!=null) {
				if(t.gettId() == tid) {
					return t;
				}else {
					break;
				}
			}
			
		}
		return null;
	}

	public static boolean addNewPlayer(int tid1, int pid1, String pname, String sp) {
		Team t = findByTid(tid1);
		if(t != null) {
			Player p = new Player(pid1,pname,sp);
			int s = t.getSize();
			
			t.getpList()[s] = p;
			t.setSize(s+1);
			return true;
			}
		return false;
	}
	
	public static Team findPlayer(int pid) {
		for(Team t :tarr) {
			if(t != null) {
				Player[] plst = t.getpList();
				for(Player p : plst) {
					if(p!=null) {
						if(p.getpId() == pid) {
							return t;
						}
						else {
							break;
						}
					}
					else {
						break;
					}
				}
			}
			
		}
		return null;
	}

}

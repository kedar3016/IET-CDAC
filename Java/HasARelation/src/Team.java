import java.util.Arrays;

public class Team {
	private int tId;
	private String tName;
	private Player captain;
	private Player pList[];
	private int size;
	public Team(int tId, String tName, Player captain, Player[] pList, int size) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.captain = captain;
		this.pList = pList;
		this.size = size;
	}
	public Team() {
		super();
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	
	public Player getCaptain() {
		return captain;
	}
	public void setCaptain(Player captain) {
		this.captain = captain;
	}
	public Player[] getpList() {
		return pList;
	}
	public void setpList(Player[] pList) {
		this.pList = pList;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Team [tId=" + tId + ", tName=" + tName + ", captain=" + captain + ", pList=" + Arrays.toString(pList)
				+ ", size=" + size + "]";
	}

}

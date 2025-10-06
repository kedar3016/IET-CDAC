
public class Player {
	private int pId;
	private String pName;
	private String specialaty;
	public Player(int pId, String pName, String specialaty) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.specialaty = specialaty;
	}
	public Player() {
		super();
	}
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getSpecialaty() {
		return specialaty;
	}
	public void setSpecialaty(String specialaty) {
		this.specialaty = specialaty;
	}
	@Override
	public String toString() {
		return "Player [pId=" + pId + ", pName=" + pName + ", specialaty=" + specialaty + "]";
	}
	

}

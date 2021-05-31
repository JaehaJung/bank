package bank.vo;

public class Account {
	private String id;
	private String pwd;
	private int money;
	public Account() {}
	public Account (String tId, String tPwd)
	{
		this.id = tId;
		this.pwd = tPwd;
		this.money = 0;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
		
}

package makeProject;

public class IPhone {
	
	private String[] acc;
	Phone phone;
	public IPhone(Phone phone) {
		this.phone = phone;
	}
	
	public String[] getAcc() {
		return acc;
	}
	public void setAcc(String[] acc) {
		this.acc = acc;
	}
}

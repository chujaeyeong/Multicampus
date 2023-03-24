package multi;

public class MeetingVO {
	private String rank;
	private String name;
	private String phone;
	private String boolean2;
	private String time;
	
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBoolean2() {
		return boolean2;
	}
	public void setBoolean2(String boolean2) {
		this.boolean2 = boolean2;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "MeetingVO [rank=" + rank + ", name=" + name + ", phone=" + phone + ", boolean2=" + boolean2 + ", time="
				+ time + "]";
	}
	
	
	
}

package multi;

public class MailVO {
	private String mailno;
	private String email;
	private String title;
	private String content;
	private String maildate;
	
	public String getMailno() {
		return mailno;
	}
	public void setMailno(String mailno) {
		this.mailno = mailno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMaildate() {
		return maildate;
	}
	public void setMaildate(String maildate) {
		this.maildate = maildate;
	}
	
	@Override
	public String toString() {
		return "MailVO [mailno=" + mailno + ", email=" + email + ", title=" + title + ", content=" + content
				+ ", maildate=" + maildate + "]";
	}
	
}

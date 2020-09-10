package model;

public class Register {
	private String fname;
	private String lname;
	private String gender;
	private String qualification;
	private String address;
	private String phoneno;
	private String mailid;
	private String username;
	private String password;
	private String hintquestion;
	private String hintanswer;
	private String designation;
	
	
	public Register(String fname, String lname, String gender, String qualification, String address, String phoneno,
			String mailid, String username, String password, String hintquestion, String hintanswer,
			String designation) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.qualification = qualification;
		this.address = address;
		this.phoneno = phoneno;
		this.mailid = mailid;
		this.username = username;
		this.password = password;
		this.hintquestion = hintquestion;
		this.hintanswer = hintanswer;
		this.designation = designation;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHintquestion() {
		return hintquestion;
	}
	public void setHintquestion(String hintquestion) {
		this.hintquestion = hintquestion;
	}
	public String getHintanswer() {
		return hintanswer;
	}
	public void setHintanswer(String hintanswer) {
		this.hintanswer = hintanswer;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	

}

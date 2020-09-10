package model;

public class Project {
	private  String ProjectId;
	private  String ProjectName;
	private  String ProjectDescription;
	private  String Sdate;
	private  String Duration;
	private  String ClientName;
	private    String ClientAddress;
	private   String ClientPhone;
	private   String ClienteMail;
	private   String ProjectLead;
	private   String DeptName;
	public Project(String projectId, String projectName, String projectDescription, String sdate, String duration,
			String clientName, String clientAddress, String clientPhone, String clienteMail, String projectLead,
			String deptName) {
		super();
		ProjectId = projectId;
		ProjectName = projectName;
		ProjectDescription = projectDescription;
		Sdate = sdate;
		Duration = duration;
		ClientName = clientName;
		ClientAddress = clientAddress;
		ClientPhone = clientPhone;
		ClienteMail = clienteMail;
		ProjectLead = projectLead;
		DeptName = deptName;
	}
	public String getProjectId() {
		return ProjectId;
	}
	public void setProjectId(String projectId) {
		ProjectId = projectId;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getProjectDescription() {
		return ProjectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		ProjectDescription = projectDescription;
	}
	public String getSdate() {
		return Sdate;
	}
	public void setSdate(String sdate) {
		Sdate = sdate;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public String getClientName() {
		return ClientName;
	}
	public void setClientName(String clientName) {
		ClientName = clientName;
	}
	public String getClientAddress() {
		return ClientAddress;
	}
	public void setClientAddress(String clientAddress) {
		ClientAddress = clientAddress;
	}
	public String getClientPhone() {
		return ClientPhone;
	}
	public void setClientPhone(String clientPhone) {
		ClientPhone = clientPhone;
	}
	public String getClienteMail() {
		return ClienteMail;
	}
	public void setClienteMail(String clienteMail) {
		ClienteMail = clienteMail;
	}
	public String getProjectLead() {
		return ProjectLead;
	}
	public void setProjectLead(String projectLead) {
		ProjectLead = projectLead;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	
	
	

}

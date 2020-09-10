package model;

public class BugAdd {
	private String BugCode;
	private String BugName;
	private String BugType;
	private String BugLevel;
	private String Priority;
	private String ProjectName;
	private String BugDate;
	private String TesterName;
	private String Status;
	public BugAdd(String bugCode, String bugName, String bugType, String bugLevel, String priority, String projectName,
			String bugDate, String testerName, String status) {
		super();
		BugCode = bugCode;
		BugName = bugName;
		BugType = bugType;
		BugLevel = bugLevel;
		Priority = priority;
		ProjectName = projectName;
		BugDate = bugDate;
		TesterName = testerName;
		Status = status;
	}
	public String getBugCode() {
		return BugCode;
	}
	public void setBugCode(String bugCode) {
		BugCode = bugCode;
	}
	public String getBugName() {
		return BugName;
	}
	public void setBugName(String bugName) {
		BugName = bugName;
	}
	public String getBugType() {
		return BugType;
	}
	public void setBugType(String bugType) {
		BugType = bugType;
	}
	public String getBugLevel() {
		return BugLevel;
	}
	public void setBugLevel(String bugLevel) {
		BugLevel = bugLevel;
	}
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getBugDate() {
		return BugDate;
	}
	public void setBugDate(String bugDate) {
		BugDate = bugDate;
	}
	public String getTesterName() {
		return TesterName;
	}
	public void setTesterName(String testerName) {
		TesterName = testerName;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	

}

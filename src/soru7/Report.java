package soru7;
import java.util.Date;

public class Report {
	
	protected String name;
	protected String result;
	protected Date createDate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String str) {
		this.name = str;
	}
	
	public String getResult() {
		return this.result;
	}
	public void setResult(String str) {
		this.result = str;
	}
	
	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date dt) {
		this.createDate = dt;
	}
	
	
}

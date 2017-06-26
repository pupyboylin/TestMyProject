package test.restful.model;

import java.util.Date;
import java.util.List;

public class SearchResult {
	
	private String username;
	private List include;
	private List exclude;
	private Integer start;
	private Integer rows;
	private Date timeStart;
	private Date timeEnd;
	private String orderBy;
	
	public SearchResult() {
	}
	
	public SearchResult(String username, List include, List exclude,
			Integer start, Integer rows, Date timeStart, Date timeEnd,
			String orderBy) {
		super();
		this.username = username;
		this.include = include;
		this.exclude = exclude;
		this.start = start;
		this.rows = rows;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.orderBy = orderBy;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List getInclude() {
		return include;
	}
	public void setInclude(List include) {
		this.include = include;
	}
	public List getExclude() {
		return exclude;
	}
	public void setExclude(List exclude) {
		this.exclude = exclude;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Date getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}
	public Date getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
	@Override
	public String toString() {
		return "searchParam [username=" + username + ", include=" + include
				+ ", exclude=" + exclude + ", start=" + start + ", rows="
				+ rows + ", timeStart=" + timeStart + ", timeEnd=" + timeEnd
				+ ", orderBy=" + orderBy + "]";
	}
	
	
	
	

}

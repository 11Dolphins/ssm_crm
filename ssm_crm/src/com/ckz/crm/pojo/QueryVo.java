package com.ckz.crm.pojo;

public class QueryVo {
	private String custName;
	private String custSource;
	private String custIndustry;
	private String custLevel;

	// 当前页码数
	private Integer page=1 ;
	// 数据库从哪一条数据开始查，即每页的开始数据
	private Integer start;
	// 每页显示数据条数
	private Integer size = 3;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustSource() {
		return custSource;
	}
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	public String getCustIndustry() {
		return custIndustry;
	}
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	public String getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size =size;
	}
	public QueryVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

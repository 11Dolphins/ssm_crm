package com.ckz.crm.pojo;

public class QueryVo {
	private String custName;
	private String custSource;
	private String custIndustry;
	private String custLevel;

	// ��ǰҳ����
	private Integer page=1 ;
	// ���ݿ����һ�����ݿ�ʼ�飬��ÿҳ�Ŀ�ʼ����
	private Integer start;
	// ÿҳ��ʾ��������
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

package com.ckz.crm.dao;

import java.util.List;

import com.ckz.crm.pojo.Customer;
import com.ckz.crm.pojo.QueryVo;

public interface CustomerByQueryVoDao {
	public Integer customerTotal(QueryVo vo);
	public List<Customer>customerRows(QueryVo vo);
	//����id��ѯ�û�
	public Customer editCustomer(Integer id);
	//ʵ���û�����
	public void updateCustomer(Customer customer);
	//ʵ���û�ɾ��
		public void deleteCustomer(Integer id);
		
}

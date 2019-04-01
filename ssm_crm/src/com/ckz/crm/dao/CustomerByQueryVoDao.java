package com.ckz.crm.dao;

import java.util.List;

import com.ckz.crm.pojo.Customer;
import com.ckz.crm.pojo.QueryVo;

public interface CustomerByQueryVoDao {
	public Integer customerTotal(QueryVo vo);
	public List<Customer>customerRows(QueryVo vo);
	//根据id查询用户
	public Customer editCustomer(Integer id);
	//实现用户更新
	public void updateCustomer(Customer customer);
	//实现用户删除
		public void deleteCustomer(Integer id);
		
}

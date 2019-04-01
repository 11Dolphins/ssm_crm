package com.ckz.crm.service;

import com.ckz.common.utils.Page;
import com.ckz.crm.pojo.Customer;
import com.ckz.crm.pojo.QueryVo;

public interface CustomerByQueryVo {
	 Page<Customer>pageList(QueryVo vo );
	 //根据ID查用户
	  public Customer editCustomer(Integer id);
	//更新用户
	  public void updateCustomer(Customer customer) ;
	//删除用户
	  public void deleteCustomer(Integer id) ;
	  }

package com.ckz.crm.service;

import com.ckz.common.utils.Page;
import com.ckz.crm.pojo.Customer;
import com.ckz.crm.pojo.QueryVo;

public interface CustomerByQueryVo {
	 Page<Customer>pageList(QueryVo vo );
	 //����ID���û�
	  public Customer editCustomer(Integer id);
	//�����û�
	  public void updateCustomer(Customer customer) ;
	//ɾ���û�
	  public void deleteCustomer(Integer id) ;
	  }

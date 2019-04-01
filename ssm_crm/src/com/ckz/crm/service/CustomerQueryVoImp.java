package com.ckz.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ckz.common.utils.Page;
import com.ckz.crm.dao.CustomerByQueryVoDao;
import com.ckz.crm.pojo.Customer;
import com.ckz.crm.pojo.QueryVo;
/*private String custName;
private String custSource;
private String CustIndustry;
private String CustLevel;*/
@Service
public class CustomerQueryVoImp implements CustomerByQueryVo {
	@Autowired
	private CustomerByQueryVoDao customerQueryVoDao;
	
     public Page<Customer>pageList(QueryVo vo ){
    	  Page <Customer>page = new Page<Customer>();
    	  if(vo!=null) {
    		  if(vo.getPage()!=null) {
    			  page.setPage(vo.getPage());
    			  vo.setStart((vo.getPage()-1)*vo.getSize());
    		  }
    		  if(vo.getCustName()!=null&&!"".equals(vo.getCustName().trim())) {
    			  vo.setCustName(vo.getCustName().trim());
    		  }
    		  if(vo.getCustSource()!=null&&!"".equals(vo.getCustSource().trim())) {
    			  vo.setCustName(vo.getCustSource().trim());
    		  }
    		  if(vo.getCustIndustry()!=null&&!"".equals(vo.getCustIndustry().trim())) {
    			  vo.setCustName(vo.getCustIndustry().trim());
    		  }
    		  if(vo.getCustLevel()!=null&&!"".equals(vo.getCustLevel().trim())) {
    			  vo.setCustName(vo.getCustLevel().trim());
    		  }
    		
        	  page.setRows(customerQueryVoDao.customerRows(vo));
        	  page.setSize(3);
        	  page.setTotal(customerQueryVoDao.customerTotal(vo));
    	  }
    	 
    	  return page;
    	  
      }
     //去编辑Customer页面
     public Customer editCustomer(Integer id) {
    	return  customerQueryVoDao.editCustomer(id);
     }
     //实现用户更新
     public void updateCustomer(Customer customer) {
    	  customerQueryVoDao.updateCustomer(customer);
     }
     //删除用户
     public void deleteCustomer(Integer id) {
   	  customerQueryVoDao.deleteCustomer(id);
     }
}

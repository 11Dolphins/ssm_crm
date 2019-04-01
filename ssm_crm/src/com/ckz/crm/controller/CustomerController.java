package com.ckz.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ckz.common.utils.Page;
import com.ckz.crm.dao.CustomerByQueryVoDao;
import com.ckz.crm.pojo.BaseDict;
import com.ckz.crm.pojo.Customer;
import com.ckz.crm.pojo.QueryVo;
import com.ckz.crm.service.CustomerByQueryVo;
import com.ckz.crm.service.SelectBaseDictService;
import com.sun.corba.se.impl.ior.GenericTaggedComponent;

@Controller
public class CustomerController {
	
	@Autowired
	private SelectBaseDictService selectBaseDictService;
	@Autowired
	private CustomerByQueryVo customerQueryVo;
	@Value("${fromtype}")
    private String formTypecode;
	@Value("${industrytype}")
	private String industryTypecode;
	@Value("${leveltype}")
	private String levelTypecode;	
	@RequestMapping(value="/customer/list.action")
  public String customer(Model model,QueryVo vo) {
		List<BaseDict> fromtype = selectBaseDictService.listBaseDict(formTypecode);
		List<BaseDict> industrytype = selectBaseDictService.listBaseDict(industryTypecode);
		List<BaseDict> leveltype = selectBaseDictService.listBaseDict( levelTypecode);
 model.addAttribute("fromType",fromtype );
 model.addAttribute("industryType",industrytype );
 model.addAttribute("levelType",leveltype );
		Page<Customer> page = customerQueryVo.pageList(vo);
		model.addAttribute("page", page);
		//回显数据	private String custName;
		
		 model.addAttribute("cust_name",vo.getCustName() );
		 model.addAttribute("custs_source",vo.getCustSource() );
	     model.addAttribute("cust_industry",vo.getCustIndustry() );
	     model.addAttribute("cust_level",vo.getCustLevel() );
	  return "customer";
  }
	
		
	//返回customer对象的json字符串,以ajax方式回显数据
	@RequestMapping( value="/customer/editCustomer.action")
	public @ResponseBody
	Customer editCustomer(Integer id){
		return customerQueryVo.editCustomer(id);
	}
	//实现更新用户功能
	@RequestMapping( value="/customer/update.action")
	public  @ResponseBody String update( Customer customer) {
		customerQueryVo.updateCustomer(customer);
		return "OK";
	}
	//删除用户
	@RequestMapping( value="/customer/delete.action")
	public  @ResponseBody String delteCustomer ( Integer id) {
		customerQueryVo.deleteCustomer(id);
		return "OK";
	}
	
}

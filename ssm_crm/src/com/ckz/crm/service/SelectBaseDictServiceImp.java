package com.ckz.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ckz.crm.dao.SelectBaseDict;
import com.ckz.crm.pojo.BaseDict;

@Service
public class SelectBaseDictServiceImp implements SelectBaseDictService {
 @Autowired
 private SelectBaseDict selectBaseDict;
 public List<BaseDict>listBaseDict(String code){
	return selectBaseDict.listBaseDict(code);
 }
}

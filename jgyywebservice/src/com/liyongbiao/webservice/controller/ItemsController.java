package com.liyongbiao.webservice.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.liyongbiao.webservice.po.ItemsCustom;
import com.liyongbiao.webservice.service.ItemsService;




@Controller
public class ItemsController {

	@Autowired
	private ItemsService itemsService;
	
	// 商品查询
	@RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception{
    	
    	//调用service 连接数据库，查找商品列表
    	List<ItemsCustom> itemsList = itemsService.findItemsList(null);	
    	
    	//返回ModelAndView
    	ModelAndView modelAndView=new ModelAndView();
    	
    	//在jsp页面中通过itemsList取数据；
    	modelAndView.addObject("itemsList", itemsList);
    	
    	modelAndView.setViewName("items/itemsList");
    	System.out.println("Hello-------------------");
		return modelAndView;
    	
    	
    	
    }	

	//商品修改
}

package com.liyongbiao.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.liyongbiao.webservice.po.ItemsCustom;
import com.liyongbiao.webservice.service.ItemsService;




@Controller
public class ItemsController {

	@Autowired
	private ItemsService itemsService;
	
	// ��Ʒ��ѯ
    public ModelAndView queryItems() throws Exception{
    	
    	//����service �������ݿ⣬������Ʒ�б�
    	List<ItemsCustom> itemsList = itemsService.findItemsList(null);	
    	
    	//����ModelAndView
    	ModelAndView modelAndView=new ModelAndView();
    	
    	//��jspҳ����ͨ��itemsListȡ���ݣ�
    	modelAndView.addObject("itemsList", itemsList);
    	
    	modelAndView.setViewName("items/itemsList");
    	
		return modelAndView;
    	
    	
    	
    }	

	//��Ʒ�޸�
}

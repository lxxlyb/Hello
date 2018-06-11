package com.liyongbiao.webservice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.liyongbiao.webservice.po.ItemsCustom;
import com.liyongbiao.webservice.service.ItemsService;

@Controller
@RequestMapping("/item")
public class ItemsController {

	@Autowired
	private ItemsService itemsService;

	@RequestMapping("/queryitem")
	public ModelAndView queryItems() throws Exception {

		List<ItemsCustom> itemsList = itemsService.findItemsList(null);

		// ModelAndView modelAndView=new ModelAndView();
		ModelAndView modelAndView = new ModelAndView("items/itemsList", "itemsList", itemsList);

		/*
		 * modelAndView.addObject("itemsList", itemsList);
		 * 
		 * modelAndView.setViewName("items/itemsList");
		 */
		System.out.println("Hello-------------------");
		return modelAndView;

	}

	@RequestMapping("/edititems")
	public ModelAndView editItems(HttpServletRequest request) throws Exception {
		// 定义一个modelandview
		ModelAndView modelAndView = new ModelAndView();

		// 调用service查询商品信息
		int id=Integer.parseInt(request.getParameter("id"));
		ItemsCustom findItemById = itemsService.findItemById(id);
		modelAndView.addObject("item", findItemById);

		// 商品修改页面
		modelAndView.setViewName("items/editItems");
		return modelAndView;

	}

	@RequestMapping("/editItemsSubmit")
	public String editItemsSubmit() throws Exception {
		
		
		  
		
		return null;

	}
}

package com.liyongbiao.webservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.liyongbiao.webservice.mapper.ItemsMapper;
import com.liyongbiao.webservice.po.ItemsCustom;
import com.liyongbiao.webservice.po.ItemsQueryVo;
import com.liyongbiao.webservice.service.ItemsService;

public class ItemsServiceImpl implements ItemsService{

	@Autowired
	 private ItemsMapper itemsMapper;
	
	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception {
		// TODO Auto-generated method stub
		return itemsMapper.findItemsList(itemsQueryVo);
	}

}

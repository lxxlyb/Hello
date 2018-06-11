package com.liyongbiao.webservice.service;

import java.util.List;

import com.liyongbiao.webservice.po.ItemsCustom;
import com.liyongbiao.webservice.po.ItemsQueryVo;

public interface ItemsService {

	/**
	 * ��Ʒ����service
	 * @param itemsQueryVo
	 * @return
	 * @throws Exception
	 */
	public List<ItemsCustom>  findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public  ItemsCustom findItemById(int id) throws Exception;
}

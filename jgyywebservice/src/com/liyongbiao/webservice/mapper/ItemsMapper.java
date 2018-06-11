package com.liyongbiao.webservice.mapper;

import java.util.List;

import com.liyongbiao.webservice.po.ItemsCustom;
import com.liyongbiao.webservice.po.ItemsQueryVo;

public interface ItemsMapper {

	/**
	 * <p>Title:           findItemsList </p>
	 * <p>Description:     查询商品列表 </p> 
	 * @param:             TODO
	 * @result:            List<ItemsCustom>
	 */
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	
	
	/**
	 * 根据商品编码查询商品信息
	 * @param id
	 * @return ItemsCustom
	 * @throws Exception
	 */
	public  ItemsCustom  findItemById(int id) throws Exception;
	
	
	
}

package sm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import sm.dao.NoveGoodsMapper;
import sm.pojo.NoveGoods;
import sm.service.GoodsService;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private NoveGoodsMapper noveGoodsMapper;

	
	public JSONObject getSelectResult(Integer goodsId) {
		List<NoveGoods> noveGoods = noveGoodsMapper.selectLeft(goodsId);
		JSONObject goods_list=null;
		if(noveGoods!=null) {
			goods_list =new JSONObject();
			goods_list.put("goodsName",noveGoods.get(0).getGoodsName());
			String pic =noveGoods.get(0).getGoodsPic();
			String[] list=pic.split(",");
			JSONObject goods_pic = new JSONObject();
			JSONArray goods_ary = new JSONArray();
			for(int i=0;i<list.length;i++) {
				goods_pic.put("small"+i, "http://ob9xcklov.bkt.clouddn.com/"+list[i]);
			}
			goods_ary.add(goods_pic);
			goods_list.put("goodsPic",goods_ary);
			goods_list.put("goodsArea", noveGoods.get(0).getGoodsArea());
			goods_list.put("goodsShowstatus",noveGoods.get(0).getGoodsShowstatus());
			goods_list.put("goodsBrand", noveGoods.get(0).getGoodsBrand());
			goods_list.put("goodsUse", noveGoods.get(0).getGoodsUse());
			goods_list.put("goodsDescript", noveGoods.get(0).getGoodsDescript());
			JSONObject goods_price = new JSONObject();
			JSONObject goods_size = new JSONObject();
			JSONArray goods_ary1 = new JSONArray();
			JSONArray goods_ary2 = new JSONArray();
			for(int i=0;i<noveGoods.size();i++) {
				goods_price.put("price"+i, noveGoods.get(i).getGoodsPrice());
				goods_size.put("size"+i,noveGoods.get(i).getGoodsSize());
			}
			goods_ary1.add(goods_price);
			goods_ary2.add(goods_size);
			goods_list.put("goodsPrice", goods_ary1);
			goods_list.put("goodsSize", goods_ary2);
			
			
		}else {
			return null;
		}
		return goods_list;
	}

}

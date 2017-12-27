package sm.service;

import com.alibaba.fastjson.JSONObject;

public interface GoodsService {

	//通过商品ID得到商品
	JSONObject getSelectResult(Integer goodsId);

}

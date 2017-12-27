package sm.controller.Api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * 通行证相关视图控制器
 * Created by ywh on 2017/12/20.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import sm.service.GoodsService;
import sm.utils.model.DefaultResultModel;
@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Autowired
	private GoodsService goodsServiceImpl;
	
	
	/**
     * 商品详情接口
     *
     * @param goodsId   商品编号
     * @return 商品返回数据体
     */
    @RequestMapping("/goodsDetail.do")
    @ResponseBody()
    public DefaultResultModel showGoodsDetail(HttpServletResponse resp,HttpServletRequest request,HttpSession session, Integer goodsId)
    	throws IOException,ServletException
    {
    	DefaultResultModel resultModel = DefaultResultModel.getInstance();
    	JSONObject noveGoods = goodsServiceImpl.getSelectResult(goodsId);
    	int result = 0;
    	if(noveGoods !=null){
    		result = 1;
    	}	
        return resultModel.packageObject(result, noveGoods);
    }
    
}

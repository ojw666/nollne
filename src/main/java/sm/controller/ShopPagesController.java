package sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class ShopPagesController {
	public ShopPagesController() {}
	
	/**
	 * �̳���ҳ
	 * @ywh
	 */
	@RequestMapping("/index")
	public String adminMallIndexPage() {return  "index/index";}
	
	/**
	 * ��Ʒ����
	 * @ywh
	 */
	@RequestMapping("/prod")
	public String adminMallProductPage() {return  "index/prod";}
	/**
	 * �����̳�
	 * @ywh
	 */
	@RequestMapping("/mall")
	public String adminMallMallPage() {return  "index/mall";}
	/**
	 * ��������
	 * @ywh
	 */
	@RequestMapping("/jour")
	public String adminMallJourPage() {return  "index/jour";}
	
}

package sm.controller.Second;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class SecondController {
	public SecondController() {}
	
	/**
	 * �ҵ�
	 * @ywh
	 */
	@RequestMapping("/mine")
	public String adminMallMinePage() {return  "second/mine";}
	/**
	 * ���ﳵ
	 * @ywh
	 */
	@RequestMapping("/cart")
	public String adminMallCartPage() {return  "second/cart";}
	/**
	 * ���򵽱���
	 * @ywh
	 */
	@RequestMapping("/bought")
	public String adminMallBoughtPage() {return  "second/bought";}
	/**
	 * �ҵĶ���
	 * @ywh
	 */
	@RequestMapping("/order")
	public String adminMallOrderPage() {return  "second/order";}
	/**
	 * �ҵ��ղ�
	 * @ywh
	 */
	@RequestMapping("/collection")
	public String adminMallCollectionPage() {return  "second/collection";}
	/**
	 * ���۹���
	 * @ywh
	 */
	@RequestMapping("/comment")
	public String adminMallCommentPage() {return  "second/comment";}
	
	
}

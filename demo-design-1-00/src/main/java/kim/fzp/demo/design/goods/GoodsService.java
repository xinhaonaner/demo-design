package kim.fzp.demo.design.goods;

import com.alibaba.fastjson.JSON;

/**
 * description 模拟实物商品服务
 *
 * @author fzp
 * @date 2022/7/21 10:20 上午
 */
public class GoodsService {
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}

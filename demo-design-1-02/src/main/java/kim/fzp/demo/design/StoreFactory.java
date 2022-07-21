package kim.fzp.demo.design;

import kim.fzp.demo.design.store.ICommodity;
import kim.fzp.demo.design.store.impl.CardCommodityService;
import kim.fzp.demo.design.store.impl.CouponCommodityService;
import kim.fzp.demo.design.store.impl.GoodsCommodityService;

/**
 * description
 *
 * @author fzp
 * @date 2022/7/21 10:08 上午
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }


}

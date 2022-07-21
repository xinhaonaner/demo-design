package kim.fzp.demo.design.store.impl;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import kim.fzp.demo.design.store.ICommodity;

import java.util.Map;

/**
 * description
 *
 * @author fzp
 * @date 2022/7/21 10:11 上午
 */
public class CardCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);


    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {

    }
}

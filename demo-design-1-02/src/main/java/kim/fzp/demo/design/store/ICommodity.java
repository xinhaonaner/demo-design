package kim.fzp.demo.design.store;

import java.util.Map;

/**
 * description
 *
 * @author fzp
 * @date 2022/7/21 10:09 上午
 */
public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}

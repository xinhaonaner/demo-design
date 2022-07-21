package kim.fzp.demo.design.card;

/**
 * description
 *
 * @author fzp
 * @date 2022/7/21 10:17 上午
 */
public class IQiYiCardService {
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }
}

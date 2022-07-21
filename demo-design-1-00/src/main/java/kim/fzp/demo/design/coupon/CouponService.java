package kim.fzp.demo.design.coupon;

/**
 * description 模拟优惠券服务
 *
 * @author fzp
 * @date 2022/7/21 10:18 上午
 */
public class CouponService {
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}

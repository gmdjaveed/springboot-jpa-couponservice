package com.jg.demo.jpa;

import com.jg.demo.jpa.model.Coupon;
import com.jg.demo.jpa.repo.CouponRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CouponserviceApplicationTests {

    @Autowired
    CouponRepo repo;

    @Test
    void testSaveCoupon(){
        Coupon coupon = new Coupon();
        coupon.setCode("SUPERSALE");
        coupon.setDiscount(new BigDecimal(20));
        coupon.setExpDate("12/12/2025");
        repo.save(coupon);
        System.out.println("testSaveCoupon Saved Coupon:" + coupon);
    }

    @Test
    void testFindByCoupon(){
        Coupon coupon = repo.findByCode("SUPERSALE");
        assertEquals (20, coupon.getDiscount().intValue());
        System.out.println("testFindByCoupon Found Coupon:" + coupon);
    }

}

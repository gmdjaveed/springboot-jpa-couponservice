package com.jg.demo.jpa.controller;

import com.jg.demo.jpa.model.Coupon;
import com.jg.demo.jpa.repo.CouponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CouponserviceController {

    @Autowired
    CouponRepo couponRepo;

    @PostMapping(value = "/coupons")
    public Coupon createCoupon(@RequestBody Coupon coupon){
        return couponRepo.save(coupon);
    }

    @GetMapping(value = "/coupons/{code}")
    public Coupon getCoupon(@PathVariable ("code") String code){
        return couponRepo.findByCode(code);
    }
}

package com.zb.njhld.controller;

import com.zb.njhld.Service.MerchantsService;
import com.zb.njhld.entity.Merchants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/merchants")
public class MerchantsController {

    @Autowired
    MerchantsService merchantsService;

    @RequestMapping("/find")
    public String findMerchants(Model model, Merchants merchants){

        merchants.setMerchantsName("wjb");
        merchants.setMerchantsPassword("778899");

        merchantsService.findMerchants(merchants);

        System.out.println("123");
        return "list";
    }

}

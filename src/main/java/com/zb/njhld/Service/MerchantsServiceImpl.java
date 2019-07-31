package com.zb.njhld.Service;


import com.zb.njhld.dao.MerchantsMapper;
import com.zb.njhld.entity.Merchants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantsServiceImpl implements MerchantsService {


    @Autowired
    MerchantsMapper merchantsMapper;


    @Override
    public List<Merchants> findMerchants(Merchants merchants) {
        return merchantsMapper.findMerchants(merchants);
    }
}

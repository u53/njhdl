package com.zb.njhld.dao;

import com.zb.njhld.entity.Merchants;

import java.util.List;

public interface MerchantsMapper {

    public List<Merchants> findMerchants(Merchants merchants);
}

package org.oursight.learning.spring.data.controller.rest;

import org.oursight.learning.spring.data.entity.BusinessInfo;
import org.oursight.learning.spring.data.repository.elasticsearch.BusinessDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 风险相关的REST服务
 * Created by neyao@github.com on 2016/3/11.
 */
@RestController
@RequestMapping("/api/company/v1")
public class CompanyResource {

    @Autowired
    BusinessDetailRepository businessDetailRepository;


    @RequestMapping(value = "/business_info/{id}", method = RequestMethod.GET)
    public BusinessInfo test(@PathVariable String id) throws Exception {
        BusinessInfo businessInfo = businessDetailRepository.findOne(id);
        return businessInfo;
    }
}

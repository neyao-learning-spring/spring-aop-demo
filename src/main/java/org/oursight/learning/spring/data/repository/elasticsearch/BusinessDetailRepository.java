package org.oursight.learning.spring.data.repository.elasticsearch;


import org.oursight.learning.spring.data.entity.BusinessInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by neyao@github.com on 2016/5/9.
 */
public interface BusinessDetailRepository extends ElasticsearchRepository<BusinessInfo, String> {
}

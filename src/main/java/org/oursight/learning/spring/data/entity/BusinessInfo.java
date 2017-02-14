package org.oursight.learning.spring.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by neyao@github.com on 2016/5/9.
 */
@Document(indexName = "flume-business-detail", type = "flumetype")
public class BusinessInfo {

    @Id
    private String id;

    private String scc_name;

    private String tfc_term_start;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScc_name() {
        return scc_name;
    }

    public void setScc_name(String scc_name) {
        this.scc_name = scc_name;
    }

    public String getTfc_term_start() {
        return tfc_term_start;
    }

    public void setTfc_term_start(String tfc_term_start) {
        this.tfc_term_start = tfc_term_start;
    }
}

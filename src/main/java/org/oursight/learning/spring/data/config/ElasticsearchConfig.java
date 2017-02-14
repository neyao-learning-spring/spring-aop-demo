package org.oursight.learning.spring.data.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * Created by neyao@github.com on 2016/5/9.
 */
@Configuration
@EnableElasticsearchRepositories(basePackages = "org.oursight.learning.spring.data.repository.elasticsearch")
public class ElasticsearchConfig {



    @Bean
    public ElasticsearchTemplate elasticsearchTemplate() {
        ElasticsearchTemplate template = new ElasticsearchTemplate(getEsClient());

        System.out.println();
        System.out.println();
        System.out.println("--------------");
        System.out.println("template = " + template);
        System.out.println("--------------");
        System.out.println();
        System.out.println();

        return template;
    }

    private Client getEsClient() {
        //Map esConfig = environment.getProperty("");


        Settings settings = ImmutableSettings.settingsBuilder().put("cluster.name", "elasticsearch").build();
        Client esClient = new TransportClient(settings).addTransportAddress(new InetSocketTransportAddress("221.122.121.96", 19300));
        return esClient;
    }

}

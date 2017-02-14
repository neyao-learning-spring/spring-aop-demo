package org.oursight.learning.spring.data.config;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import org.oursight.learning.spring.data.config.yaml.YamlConfig;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Shows the basic usage of yaml support
 * Created by neyao@github.com on 2016/5/3.
 */
public class YamlConfiguration {

    public YamlConfig getConfig() {
        return config;
    }

    private YamlConfig config;

    public YamlConfiguration() {
        try {
            YamlReader reader = new YamlReader(new FileReader("D:\\Workspaces\\Mine\\spring-data-jpa-demo\\src\\main\\resources\\config.yml"));
            config = reader.read(YamlConfig.class);
            System.out.println();
            System.out.println("=======================");
            System.out.println("config = " + config);
            System.out.println("=======================");
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (YamlException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        YamlConfiguration configuration = new YamlConfiguration();
        YamlConfig config = configuration.getConfig();
//        System.out.println(config.getIntMap().get("a1"));
        //System.out.println(config.getStringMap().get("a1").getClass());
    }
}

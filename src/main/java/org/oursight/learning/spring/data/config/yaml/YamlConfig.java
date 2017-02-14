package org.oursight.learning.spring.data.config.yaml;

import java.util.List;
import java.util.Map;

/**
 * Created by neyao@github.com on 2016/5/3.
 */
public class YamlConfig {

    private String userName;

    private int age;

    private List<String> emails;

    private Map<String, String> stringMap;

    private Map<String, Integer> intMap;

    private List<Phone> phones;

    private List<Email> emailInterfaces;

    public List<Email> getEmailInterfaces() {
        return emailInterfaces;
    }

    public void setEmailInterfaces(List<Email> emailInterfaces) {
        this.emailInterfaces = emailInterfaces;
    }

    public Map<String, Integer> getIntMap() {
        return intMap;
    }

    public void setIntMap(Map<String, Integer> intMap) {
        this.intMap = intMap;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "YamlConfig{" +
                "age=" + age +
                ", userName='" + userName + '\'' +
                ", emails=" + emails +
                ", stringMap=" + stringMap +
                ", intMap=" + intMap +
                ", phones=" + phones +
                ", emailInterfaces=" + emailInterfaces +
                '}';
    }

}

package org.oursight.learning.spring.data.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 风险相关的REST服务
 * Created by neyao@github.com on 2016/3/11.
 */
@RestController
@RequestMapping("/api/test1/v1")
public class TestResource1 {


    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String ping(
            @RequestParam(value = "type1", defaultValue = "name") String type1,
            @RequestParam(value = "type2", defaultValue = "name") String type2
    ) {
        System.out.println("    ---- TestResource.ping START ----");
        System.out.println("        type1 = " + type1);
        System.out.println("        type2 = " + type2);
        System.out.println("    ---- TestResource.ping END ----");
        return "done";
    }

    @RequestMapping(value = "/ping1", method = RequestMethod.GET)
    public String ping1(
            @RequestParam(value = "type1", defaultValue = "name") String type1,
            @RequestParam(value = "type2", defaultValue = "name") String type2
    ) {
        System.out.println("    ---- TestResource.ping1 START ----");
        System.out.println("        type1 = " + type1);
        System.out.println("        type2 = " + type2);
        System.out.println("    ---- TestResource.ping1 END ----");
        return "done";
    }

    @RequestMapping(value = "/ping2", method = RequestMethod.GET)
    public String ping2(
            @RequestParam(value = "type1", defaultValue = "name") String type1,
            @RequestParam(value = "type2", defaultValue = "name") String type2
    ) {
        System.out.println("    ---- TestResource.ping2 START ----");
        System.out.println("        type1 = " + type1);
        System.out.println("        type2 = " + type2);
        System.out.println("    ---- TestResource.ping2 END ----");
        return "done";
    }

    @RequestMapping(value = "/ping3", method = RequestMethod.GET)
    public String ping3(
            @RequestParam(value = "type1", defaultValue = "name") String type1,
            @RequestParam(value = "type2", defaultValue = "name") String type2
    ) {
        System.out.println("    ---- TestResource.ping3 START ----");
        System.out.println("        type1 = " + type1);
        System.out.println("        type2 = " + type2);
        System.out.println("    ---- TestResource.ping3 END ----");
        return "done";
    }

}

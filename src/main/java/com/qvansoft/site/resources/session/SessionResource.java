package com.qvansoft.site.resources.session;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionResource {

    @RequestMapping("/api/lolo")
    public String helloAdmin() {
        return "hello admin";
    }
}

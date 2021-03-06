package net.tdc.netflixmicroservices.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.tdc.netflixmicroservices.remote.BarClient;

@RestController
public class FooBarService {

    private BarClient barClient;

    @Autowired
    public FooBarService(BarClient barClient) {
        this.barClient = barClient;
    }

    @RequestMapping("/call")
    public String callFooBar() {
        return "Foo" + barClient.getInfo().getName();
    }
}

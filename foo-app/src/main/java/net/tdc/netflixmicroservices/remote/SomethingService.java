package net.tdc.netflixmicroservices.remote;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

public class SomethingService {


@HystrixCommand(fallbackMethod = "doSomethingThatCantFail")
public String doShomethingThatCanFail(){
    throw new RuntimeException("Error");
}

public String doSomethingThatCantFail(){
    return "Success";
}


}

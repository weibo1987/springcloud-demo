package me.tony.demo.springcloud.consumer;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider-service")
public interface DemoClient {

    @GetMapping("/ok")
    public String ok();
}

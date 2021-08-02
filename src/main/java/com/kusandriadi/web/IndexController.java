package com.kusandriadi.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;
import reactor.core.publisher.Mono;

@RestController
public class IndexController {

    @Value("${application.username}")
    private String username;

    @GetMapping("/")
    public String index(ModelMap map) {
        Mono<String> n = Mono.just(username);
        IReactiveDataDriverContextVariable reactiveDataDrivenMode =
                new ReactiveDataDriverContextVariable(n, 1);

        map.addAttribute("name", reactiveDataDrivenMode);

        return "index";
    }

    @GetMapping("/home")
    public String home(ModelMap map) {
        Mono<String> n = Mono.just(username);
        IReactiveDataDriverContextVariable reactiveDataDrivenMode =
                new ReactiveDataDriverContextVariable(n, 1);

        map.addAttribute("name", reactiveDataDrivenMode);

        return "index";
    }

}

package com.Helloworld.CiCdPractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//git ls-files --stage mvnw
//docker build --target build -t cicd-build-check .
//docker run -it --name app-build-container --entrypoint bash app:latest
//RENDER_DEPLOY_HOOK_URL
@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello sanchip!";
    }
}

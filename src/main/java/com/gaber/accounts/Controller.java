package com.gaber.accounts;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{

    @RequestMapping(value = "test")
    public String test()
    {
        return """
            Hello MR.Jenkins
            Iam talking to you from the other side of the world
            We just test Jenkins hooks
            see you later
            """;
    }

}

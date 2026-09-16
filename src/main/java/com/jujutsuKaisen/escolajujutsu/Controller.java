package com.jujutsuKaisen.escolajujutsu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
  
  @GetMapping("/")
  public String helloWord(){
    return "Hello World!";
  }

}

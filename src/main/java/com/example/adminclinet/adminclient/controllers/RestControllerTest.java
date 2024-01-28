package com.example.adminclinet.adminclient.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RestControllerTest {

  @GetMapping("/neeta")
  public String getText(){

    log.info("Info log printed");
    log.trace("Trace log printed");
    return "neeta";
  }

}

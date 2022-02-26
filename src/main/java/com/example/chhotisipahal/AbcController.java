package com.example.chhotisipahal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbcController {
  
	  @GetMapping("/welcome")
	  public String welcome() {
		  return "welcome to api world";
	  }
}

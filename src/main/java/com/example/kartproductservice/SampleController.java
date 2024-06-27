package com.example.kartproductservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SampleController {
@GetMapping("/{org}/{number}")
    public String sample(@PathVariable("org") String org, @PathVariable("number") int number) {
    StringBuilder sb = new StringBuilder();
    for (int i=1; i<number; i++) {
            sb.append("Hi"+org);
        }
    return sb.toString();
    }

}

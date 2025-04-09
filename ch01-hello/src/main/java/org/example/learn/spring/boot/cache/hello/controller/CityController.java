package org.example.learn.spring.boot.cache.hello.controller;

import org.example.learn.spring.boot.cache.hello.model.CityInfoDto;
import org.example.learn.spring.boot.cache.hello.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(path = "/findAll")
    public List<CityInfoDto> findAll() {
        return cityService.findAll();
    }
}

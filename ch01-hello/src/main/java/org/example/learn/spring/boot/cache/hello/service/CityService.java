package org.example.learn.spring.boot.cache.hello.service;

import org.example.learn.spring.boot.cache.hello.dao.mapper.CityInfoMapper;
import org.example.learn.spring.boot.cache.hello.model.CityInfoDto;
import org.example.learn.spring.boot.cache.hello.model.CityInfoPo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityInfoMapper cityInfoMapper;

    public List<CityInfoDto> findAll() {
        List<CityInfoPo> all = cityInfoMapper.findAll();
        if (all == null) {
            return null;
        }

        List<CityInfoDto> allDto = new ArrayList<>(all.size());
        all.forEach(i -> {
            CityInfoDto dto = new CityInfoDto();
            BeanUtils.copyProperties(i, dto);
            allDto.add(dto);
        });

        return allDto;
    }

}
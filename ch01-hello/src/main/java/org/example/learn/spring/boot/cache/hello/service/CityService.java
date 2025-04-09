package org.example.learn.spring.boot.cache.hello.service;

import org.example.learn.spring.boot.cache.hello.dao.mapper.CityInfoMapper;
import org.example.learn.spring.boot.cache.hello.model.CityInfoDto;
import org.example.learn.spring.boot.cache.hello.model.CityInfoPo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CityService {

    @Autowired
    private CityInfoMapper cityInfoMapper;

    public List<CityInfoDto> findAll() {
        List<CityInfoPo> poList = cityInfoMapper.findAll();
        if (poList == null) {
            return null;
        }

        List<CityInfoDto> dtoList = new ArrayList<>(poList.size());
        poList.forEach(i -> {
            CityInfoDto dto = new CityInfoDto();
            BeanUtils.copyProperties(i, dto);
            dtoList.add(dto);
        });

        return dtoList;
    }

    public CityInfoDto queryByCityName(String cityName) {
        Map<String, Object> dbParam = new HashMap<>();
        dbParam.put("cityName", cityName);
        List<CityInfoPo> poList = cityInfoMapper.queryByParam(dbParam);
        if (poList == null) {
            return null;
        }

        CityInfoDto dto = new CityInfoDto();
        BeanUtils.copyProperties(poList.get(0), dto);

        return dto;
    }
}
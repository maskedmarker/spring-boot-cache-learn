package org.example.learn.spring.boot.cache.hello.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.learn.spring.boot.cache.hello.model.CityInfoPo;

import java.util.List;
import java.util.Map;

@Mapper
public interface CityInfoMapper {

    List<CityInfoPo> findAll();

    List<CityInfoPo> queryByParam(Map<String, Object> param);
}

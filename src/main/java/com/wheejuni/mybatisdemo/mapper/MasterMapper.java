package com.wheejuni.mybatisdemo.mapper;

import com.wheejuni.mybatisdemo.model.Master;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MasterMapper {

    Master findByMasterId(int id);

    Master findByName(String name);
}

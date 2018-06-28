package com.wheejuni.mybatisdemo.service.impl;

import com.wheejuni.mybatisdemo.mapper.MasterMapper;
import com.wheejuni.mybatisdemo.model.Master;
import com.wheejuni.mybatisdemo.service.spec.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class MasterServiceImpl implements MasterService {

    private MasterMapper masterMapper;

    public MasterServiceImpl(MasterMapper masterMapper) {
        this.masterMapper = masterMapper;
    }

    @Override
    public Master findById(int id) {
        return masterMapper.findByMasterId(id);
    }

    @Override
    public Master findByName(String name) {
        return masterMapper.findByName(name);
    }
}

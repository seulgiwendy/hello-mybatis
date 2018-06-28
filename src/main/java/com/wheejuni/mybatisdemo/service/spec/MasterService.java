package com.wheejuni.mybatisdemo.service.spec;

import com.wheejuni.mybatisdemo.model.Master;

public interface MasterService {

    Master findById(int id);

    Master findByName(String name);
}

package com.wheejuni.mybatisdemo.mapper;

import com.wheejuni.mybatisdemo.model.Master;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles(profiles = "local-dev")
public class MasterMapperTest {

    @Autowired
    private MasterMapper masterMapper;

    private Master master;

    @Before
    public void setUp() {
        this.master = new Master("pobi");
    }

    @Test
    public void insert_test() {
        masterMapper.insertMaster(this.master);

        assertThat(masterMapper.findByName("pobi"), is(notNullValue()));
    }

}
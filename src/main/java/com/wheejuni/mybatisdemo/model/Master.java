package com.wheejuni.mybatisdemo.model;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

@Data
public class Master {

    private int masterId;
    private String name;

    private List<Student> students = Lists.newArrayList();

}

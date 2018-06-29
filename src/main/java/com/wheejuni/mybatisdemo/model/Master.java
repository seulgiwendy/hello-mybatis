package com.wheejuni.mybatisdemo.model;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Master {

    private Long masterId;
    private String name;

    public Master(String name) {
        this.name = name;
    }

    private List<Student> students = Lists.newArrayList();

}

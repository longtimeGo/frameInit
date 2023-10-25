package com.example.ownframe.service.impl;

import com.example.ownframe.dao.tbSchoolMapper;
import com.example.ownframe.entity.dto.TbSchool;
import com.example.ownframe.service.tbSchoolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class tbSchoolServiceImpl implements tbSchoolService {

    @Resource
    private tbSchoolMapper schoolMapper;


    @Override
    public List<TbSchool> getAllSchools() {
        return schoolMapper.getAllData();
    }
}

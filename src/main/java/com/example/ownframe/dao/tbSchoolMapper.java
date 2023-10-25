package com.example.ownframe.dao;

import com.example.ownframe.entity.dto.TbSchool;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface tbSchoolMapper{

    List<TbSchool> getAllData();

}

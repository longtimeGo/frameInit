package com.example.ownframe.controller;


import com.example.ownframe.annotation.ResponseResult;
import com.example.ownframe.entity.dto.TbSchool;
import com.example.ownframe.result.Result;
import com.example.ownframe.service.tbSchoolService;
import com.example.ownframe.utils.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api")
@ResponseResult
public class TestController {

    @Resource
    private tbSchoolService schoolService;

    @GetMapping("/test")
    public Result test() {
        List<TbSchool> allSchools = schoolService.getAllSchools();
        return ResultUtil.success(allSchools);
    }
}

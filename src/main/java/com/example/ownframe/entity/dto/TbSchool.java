package com.example.ownframe.entity.dto;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_school")
public class TbSchool {

    String ID;

    @TableField(value = "stuName")
    String stuName;
    @TableField(value = "stuName")
    Long stuAge;
}

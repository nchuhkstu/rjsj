package com.nchu.qhl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nchu.qhl.pojo.Grade;
import com.nchu.qhl.service.GradeService;
import com.nchu.qhl.mapper.GradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author qhl666
* @description 针对表【grade】的数据库操作Service实现
* @createDate 2024-05-09 00:33:18
*/
@Service
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade>
    implements GradeService{
    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public double get(long id) {
        LambdaQueryWrapper<Grade> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Grade::getHid,id);
        Grade grade = gradeMapper.selectOne(lambdaQueryWrapper);
        if(grade!=null){
            return grade.getGrade();
        }
        return 0;
    }

    @Override
    public boolean add(Grade grade) {
        gradeMapper.insert(grade);
        return true;
    }
}





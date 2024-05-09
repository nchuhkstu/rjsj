package com.nchu.qhl.service;

import com.nchu.qhl.pojo.Grade;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author qhl666
* @description 针对表【grade】的数据库操作Service
* @createDate 2024-05-09 00:33:18
*/
public interface GradeService extends IService<Grade> {

    double get(long id);

    boolean add(Grade grade);
}

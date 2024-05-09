package com.nchu.qhl.controller;

import com.nchu.qhl.pojo.Grade;
import com.nchu.qhl.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("grade")
public class GradeController {
    @Autowired
    private GradeService gradeService;
    @GetMapping("{id}")
    public double get(@PathVariable(name = "id")long id){
        return gradeService.get(id);
    }
    @PostMapping()
    public boolean add(@RequestBody Grade grade){
        return gradeService.add(grade);
    }
}

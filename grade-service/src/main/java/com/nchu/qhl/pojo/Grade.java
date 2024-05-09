package com.nchu.qhl.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName grade
 */
@TableName(value ="grade")
@Data
public class Grade implements Serializable {
    private Long hid;

    private Double grade;

    private static final long serialVersionUID = 1L;
}
package com.lw.sm.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ResultEntity
 * @Description 返回结果实体
 * @Author WL
 * @Date 2020/11/15
 **/
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResultEntity {
    private int code;
    private String message;
    private Object data;
}

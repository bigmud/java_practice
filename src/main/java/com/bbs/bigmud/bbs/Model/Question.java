package com.bbs.bigmud.bbs.Model;


import lombok.Data;

@Data
public class Question {

    private Integer id;
    private String title;
    private String description;
    private Long gmt_Create;
    private Long gmt_Modified;
    private Integer creater;
    private Integer Comment_Count;
    private Integer Like_Count;
    private Integer View_Count;
    private String tag;
}
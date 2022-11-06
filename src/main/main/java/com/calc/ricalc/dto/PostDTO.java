package com.calc.ricalc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostDTO implements Serializable {

    private Long id;
    private String title;
    private String anons;
    private String full_text;
    private int views;
}

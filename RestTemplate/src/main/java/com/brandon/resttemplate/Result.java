package com.brandon.resttemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private Long userId;
    private Long id;
    private String title;
    private Boolean completed;


}

package com.example.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Builder
@Accessors(fluent = true)
@AllArgsConstructor
public class UrlData {

    private int id;
    private String url;

}
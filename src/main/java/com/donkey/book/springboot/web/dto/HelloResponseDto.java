package com.donkey.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
//final 로 선언된 필드만 포함된 생성자를 생성
public class HelloResponseDto {

    private final String name;
    private final int amount;
}

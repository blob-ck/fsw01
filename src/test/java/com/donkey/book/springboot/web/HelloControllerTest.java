package com.donkey.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
//테스트 진행시 JUnit에 내장된 실행자 외에 다른 실행자(여기선 SpringRunner)를 실행
//스프링부트 테스트와 JUnit 사이의 연결자 역할
@WebMvcTest(controllers = HelloController.class)
//여러 스프링 테스트 어노테이션 중, Web(SpringMVC)레이어에 집중할 수 있는 어노테이션
//  Spring Web Layer = { Web, Service, Repository, Dto, Domain }
//  선언할 경우 사용 가능: @Controller, @ControllerAdvice 등
//            사용 불가: @Service, @Component, @Repository 등
// 이 테스트는 컨트롤러만 사용하므로 해당 어노테이션 사용했음
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;
    //웹API를 테스트할 때 사용
    //스프링MVC 테스트의 시작점
    //이 클래스를 통해 HTTP GET, POST, 등에 대한 API 테스트를 할 수 있음

    @Test
    public void returnHello() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
}

package com.icia.ex.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // @어노테이션
// 이 클래스는 컨트롤러 클래스라고 적용
// Controller클래스로 적용함으로서 클라이언트의 요청을 여기로 와서 체크함
public class HomeController {
    // 프로젝트 실행시 기본주소(/) 요청 메서드 선언
    // 프로젝트 시작하면 index.jsp를 브라우저에 출력
    @GetMapping("/")
    public String index() {
        return "index"; // index.jsp를 띄운다는 의미
    }
}

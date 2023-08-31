package com.icia.study.controller;

import com.icia.study.dto.StudyDTO;
import com.icia.study.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudyController {
    // StudyService 객체 주입
    @Autowired
    private StudyService studyService;
    @GetMapping("/req1")
    public String req1(){
        // StudyService 클래스의 req1 메서드 호출
        studyService.req1();
        return "index";
    }

    @GetMapping("/req2")
    public String req2(@RequestParam("q1") String q1, @RequestParam("q2") int q2){
        studyService.req2(q1, q2);
        return "index";
    }

    @PostMapping("/req3")
    public String req3(@ModelAttribute StudyDTO studyDTO){
        studyService.req3(studyDTO);
        return "index";
    }

    // 주소값 /req4가 넘어 올 경우 get으로 받아준다.
    // 주소를 받아 해당 페이지가 열리기를 원할 경우 보통 get으로 받는다.
    // /req4가 get으로 받았을 경우 실행될 메서드를 작성해준다.
    // 값을 Service에서 받아 views에 출력하고 싶을 경우 Model 객체를 매개변수로 생성해준다.
    @GetMapping("/req4")
    public  String req4(Model model){
        // StudyDTO클래스를 통해 비어있는 객체 studyDTO를 만든 뒤
        // studyService.req4()에서 건내준 StudyDTO 객체를 담는다.
        StudyDTO studyDTO = studyService.req4();
        // model에 addAttribute를 이용해 studyDTO를 넣고
        // 이를 호출하기 위해 사용되는 키로 study를 지정해준다.
        model.addAttribute("study", studyDTO);
        // 목적지 설정(출력할 페이지)
        return "req4";
    }

    @GetMapping("/req5")
    public String req5(Model model){
        List<StudyDTO> studyDTOList = studyService.req5();
        // 가져갈 데이터를 담는다.
        model.addAttribute("studyList", studyDTOList);
        // 목적지 설정(출력할 페이지)
        return "req5";
    }
}

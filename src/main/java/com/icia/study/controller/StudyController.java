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

    // /req4를 
    @GetMapping("/req4")
    public  String req4(Model model){
        StudyDTO studyDTO = studyService.req4();
        model.addAttribute("study", studyDTO);
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

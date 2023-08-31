package com.icia.study.service;

import com.icia.study.dto.StudyDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudyService {
    public void req1() {
        System.out.println("StudyService.req1");
    }

    // req2 메서드에서 q1, q2값 출력
    public void req2(String q1, int q2){
        System.out.println("StudyService.req2");
        System.out.println("q1 = " + q1 + ", q2 = " + q2);
    }

    public void req3(StudyDTO studyDTO) {
        System.out.println("StudyService.req3");
        System.out.println("studyDTO = " + studyDTO);
    }


    /*
    * req4 메서드
    * studyDTO 객체를 리턴한다.
    * index.jsp에서 req4 주소를 요청하면
    * 서비스 클래스의 req4 메서드가 리턴한 객체 데이터 값을 req4.jsp에 출력함
    */
    public StudyDTO req4() {
        // StudyDTO 클래스를 이용해 비어있는 객체 studyDTO를 만들어준다.
        StudyDTO studyDTO = new StudyDTO();
        studyDTO.setP1("a");
        studyDTO.setP2(22);
        studyDTO.setP3("d");
        // studyDTO를 controller에서 사용하기 위해 리턴해준다.
        return studyDTO;
    }

    /*
    * req5 메서드
    * StudyDTO가 담긴 리스트 객체를 리턴한다.
    * index.jsp에서 req5 주소를 요청하면
    * 서비스 클래스의 req5 메서드가 리턴한 객체 데이터 값을 req5.jsp에 출력함*/
    public List<StudyDTO> req5() {
        // StudyDTO클래스 형식의 객체를 담을 List를 studyDTOList라는 이름으로 생성해준다.
        List<StudyDTO> studyDTOList = new ArrayList<>();
        for (int i = 0; i<=10; i++){
            //StudyDTO 클래스를 이용해 비어있는 객체 studyDTO를 만들어준다.
            StudyDTO studyDTO = new StudyDTO();
            // studyDTO의 p1, p2, p3에 setter를 이용해 값을 담아준다.
            studyDTO.setP1("p1"+i);
            studyDTO.setP2(i);
            studyDTO.setP3("p3"+i);
            // 만들어진 studyDTO를 studyDTOList에 담아준다.
            studyDTOList.add(studyDTO);
        }
        // studyDTOList를 controller에서 사용하기 위해 return해준다.
        return studyDTOList;
    }
}

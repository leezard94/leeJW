package Controller;


import VO.vo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class controller {

    @GetMapping(value="/")
        public String index(){
            return "index";
        }


    @GetMapping("/test")
    //@ResponseBody
    public Map<String, Object> testAjax(vo testVo){

        Map<String, Object> result = new HashMap<String, Object>();

        // 이름
        System.out.println(testVo.getName());

        // 성별
        System.out.println(testVo.getSex());

        // 나이
        System.out.println(testVo.getAge());

        // 전화번호
        System.out.println(testVo.getTell());


        return result;

    }
}

package com.example.apitest.Controller;


import com.example.apitest.Mapper.UserProfileMapper;
import com.example.apitest.Model.StarVO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.Arrays;
import java.util.List;


@RestController
public class UserProfileController {

    //E 오로지 local 환경에서만 돌리기 위해서 사용하는 코드.
  /*
    private Map<String, StarVO> userMap;


    // 보통 제네릭 만들때 초기화 하기위해서 @PostConstruct 사용.
    @PostConstruct
    public void init() {

        userMap = new HashMap<String, StarVO>();
        userMap.put("1", new StarVO("1","leezard","12345","seoul"));
        userMap.put("2", new StarVO("2","leemong","51325","deagu"));
        userMap.put("3", new StarVO("3","chacha","31233","busan"));


    }

    //Star 이라는 객체를 리턴하면 이 객체를 json형태로 자동로 리턴해서 클라이언트 전달.
    @GetMapping("/star/{id}")
    public StarVO getStar(@PathVariable("id") String id) {
        return userMap.get(id);
    }


    //list 전체를 리턴하는 api
    @GetMapping("/star/all")
    public List<StarVO> getStar(){
        return new ArrayList<StarVO>(userMap.values());
    }


    //데이터 생성
    @PutMapping("/star/{id}")
    public void putStar(@PathVariable("id") String id, @RequestParam("race") String race,@RequestParam("ladder") String ladder,@RequestParam("map") String map){
        StarVO userStar = new StarVO(id, race, ladder, map);
        userMap.put(id, userStar);
    }

    //수정
    @PostMapping("/star/{id}")
    public void postStar(@PathVariable("id") String id,@RequestParam("race") String race,@RequestParam("ladder") String ladder,@RequestParam("map") String map){
        StarVO userStar = userMap.get(id);
        userStar.setName(race);
        userStar.setName(ladder);
        userStar.setName(map);
    }
    
    //삭제
    @DeleteMapping("/star/{id}")
    public void deleteStar(@PathVariable("id") String id) {
        userMap.remove(id);
    }
*/

    //E DB 환경에서 api crud

    private UserProfileMapper mapper;


    public UserProfileController(UserProfileMapper mapper) {
        this.mapper = mapper;
    }


    //한개의 id 만 조회.
    @GetMapping("/star/{id}")
    public StarVO getStar(@PathVariable("id") String id) {
        return mapper.getStar(id);
    }

    //데이터 전부 조회.
    @GetMapping("/star/all")
    public List<StarVO> getStarList() {
        return mapper.getStarList();
    }

    //데이터 추가.
    @PutMapping("/star/{id}")
    public void putStar(@PathVariable("id") String id, @RequestParam("race") String race, @RequestParam("ladder") String ladder, @RequestParam("map") String map) {
        mapper.insertStar(id, race, ladder, map);
    }

    //수정
    @PostMapping("/star/{id}")
    public void postStar(@PathVariable("id") String id, @RequestParam("race") String race, @RequestParam("ladder") String ladder, @RequestParam("map") String map) {
        mapper.updateStar(id, race, ladder, map);
    }

    //삭제
    @DeleteMapping("/star/{id}")
    public void deleteStar(@PathVariable("id") String id) {
        mapper.deleteStar(id);
    }




    //L -------------------------------- ModelAndView






    /*RestController 에서는 Model 객체를 만들어 데이터를 담고 View 로 넘기는 방식이 아니라
    객체만을 반환하고 객체 데이터는 JSON 또는 XML 형식으로 HTTP 로 담아 응답한다.
    그렇기 때문에 view 보여지게 한다면 ModelAndView 의 객체를 선언하여 따로 넘겨야한다.
    */

    //메인 page
    @RequestMapping("/home")
    public ModelAndView manage(Model model) {

        ModelAndView mav = new ModelAndView("view");
        model.addAttribute("list", mapper.getStarList());

        return mav;
    }


    // 정보 입력 페이지
    @RequestMapping("/write")
    public ModelAndView manage() {

        ModelAndView mav = new ModelAndView("write");

        return mav;
    }

    // 입력 완료
    @PostMapping("/{id}")
    public  ModelAndView add(String id,  String race,  String ladder, String map) {

        ModelAndView mav = new ModelAndView("writepro");
        mapper.insertStar(id, race, ladder, map);

        return mav;
    }

    // 데이터 삭제

 /*   @DeleteMapping("/delete/{id}")
    public ModelAndView remove(String id) {

        ModelAndView mav = new ModelAndView("delete");
        mapper.deleteStar(id);
        return mav;

    }*/


}

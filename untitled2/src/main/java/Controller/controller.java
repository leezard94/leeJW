package Controller;


import com.test.board.vo.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class controller {


    BoardService boardService;


    @RequestMapping(value="/")
    public String index(){
        return "index";
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String boardList(Model model) {
        model.addAttribute("list", boardService.getBoardList());
        return "list";
    }



}

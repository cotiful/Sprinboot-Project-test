package site.metacoding.data_test.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import site.metacoding.data_test.domain.boardTbl.BoardTbl;
import site.metacoding.data_test.domain.boardTbl.BoardTblRepository;

@Controller
public class BoardTblController {

    private BoardTblRepository boardTblRepository;

    public BoardTblController(BoardTblRepository boardTblRepository) {
        this.boardTblRepository = boardTblRepository;
    }

    @GetMapping("/search")
    public String search(@RequestParam(defaultValue = "") String keyword, Model model) { // keyword = 스프링

        // if(keyword == null){
        // System.out.println("널~");
        // }if(keyword.equals("")){
        // System.out.println("공백~");
        // }
        List<BoardTbl> boards = boardTblRepository.mSearch(keyword);
        // System.out.println("크기:"+boards.size()); -> 쿼리 잘못을 알 수 있게 됨!! size가 0이 나옴!

        model.addAttribute("boards", boards);
        return "home";
    }
}
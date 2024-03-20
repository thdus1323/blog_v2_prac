package shop.mtcoding.blog.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
BoardNativeRepository boardNativeRepository;

    @PostMapping("/board/save")
    public String save(String title, String content, String username){
        boardNativeRepository.save(title, content, username);
//        System.out.println("title : "+title);
//        System.out.println("content : "+content);
//        System.out.println("username : "+username);
        return "redirect:/";
    }

    @GetMapping("/" )
    public String index() {
        return "index";
    }

    @GetMapping("/board/save-form")
    public String saveForm() {
        return "board/save-form";
    }

    @GetMapping("/board/{id}")
    public String detail(@PathVariable Integer id) {
        return "board/detail";
    }
}

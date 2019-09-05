package cn.enjoyedu.ws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: ZMJ
 * @Date: 2019/9/5 14:52
 * @Description:
 */

@Controller
public class HtmlController {



        @RequestMapping("/html")
        public String getHtml() {
            System.out.println("hello3");
            return "ws_chatroom";
        }

}

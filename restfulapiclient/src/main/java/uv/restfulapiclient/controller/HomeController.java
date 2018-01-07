/**
 * 
 */
package uv.restfulapiclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author A.Riaydh
 *
 */
@Controller

public class HomeController {

	@GetMapping("/")
    String index(Model model) {
        return "index";
}
}

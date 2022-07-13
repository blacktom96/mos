package com.mosmanager.MOS.controlles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class CommandController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String CommandIndex(Model model) {
        model.addAttribute("message", "Hello Springboot");
        return "CommandIndex";
    }
	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
    public String CalendarIndex(Model model) {
        model.addAttribute("message", "Hello Springboot");
        return "CalendarIndex";
    }
}

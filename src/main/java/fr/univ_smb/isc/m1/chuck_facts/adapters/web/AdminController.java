package fr.univ_smb.isc.m1.chuck_facts.adapters.web;

import fr.univ_smb.isc.m1.chuck_facts.application.ChuckFactsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    private final ChuckFactsService chuckFactsService;

    public AdminController(ChuckFactsService chuckFactsService) {
        this.chuckFactsService = chuckFactsService;
    }

    @GetMapping(value="/admin")
    public String home(Model model) {
        model.addAttribute("facts", chuckFactsService.facts());
        return "admin";
    }

}

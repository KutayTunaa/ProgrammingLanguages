package Kodlama.io.Devs.ProgrammingLanguages.webApı;

import Kodlama.io.Devs.ProgrammingLanguages.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.ProgrammingLanguages.entities.ProgrammingLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class controllers {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public controllers (ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }
    @GetMapping("/getAll")
    public List<ProgrammingLanguages> getAll() {
        return programmingLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(ProgrammingLanguages languages) throws Exception {
        programmingLanguageService.add(languages);
    }
    @DeleteMapping ("/delete")
    public void delete(ProgrammingLanguages languages) {
        programmingLanguageService.delete(languages);
    }
    @PutMapping ("/update")
    public void update(ProgrammingLanguages languages) throws Exception {
        programmingLanguageService.update(languages);
    }
    @GetMapping("/{id}")
    public ProgrammingLanguages callById(@PathVariable int id) throws Exception {
        return programmingLanguageService.callById(id);
    }

}

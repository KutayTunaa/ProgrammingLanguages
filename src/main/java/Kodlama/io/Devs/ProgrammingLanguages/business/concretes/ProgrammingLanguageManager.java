package Kodlama.io.Devs.ProgrammingLanguages.business.concretes;

import Kodlama.io.Devs.ProgrammingLanguages.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.ProgrammingLanguages.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.ProgrammingLanguages.entities.ProgrammingLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository languageRepository;
    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<ProgrammingLanguages> getAll() {
        return this.languageRepository.getAll();
    }

    @Override
    public void add(ProgrammingLanguages programmingLanguages) throws Exception {
        if (programmingLanguages.getName().isEmpty()) {
            throw new Exception("Program ismi boş olamaz...");
        } else if (alreadyExist(programmingLanguages.getName())) {
            throw new Exception("isim boş bırakılamaz...");
        } else {
            languageRepository.add(programmingLanguages);
        }

    }
        private boolean alreadyExist (String name){
            for (ProgrammingLanguages languages : languageRepository.getAll()) {
                if (languages.getName().equals(name)) {
                    return false;
                }
            }       return true;
    }

    @Override
    public void delete(ProgrammingLanguages programmingLanguages) {
        languageRepository.delete(programmingLanguages);
    }

    @Override
    public void update(ProgrammingLanguages programmingLanguages) throws Exception {
        if (programmingLanguages.getName().isEmpty()) {
            throw new Exception("Program ismi boş olamaz...");
        } else if (alreadyExist(programmingLanguages.getName())) {
            throw new Exception("isim boş bırakılamaz...");
        } else {
            languageRepository.add(programmingLanguages);
        }

    }

    @Override
    public ProgrammingLanguages callById(int id) throws Exception {
        return languageRepository.callById(id);
    }

}

package Kodlama.io.Devs.ProgrammingLanguages.dataAccess.concretes;

import Kodlama.io.Devs.ProgrammingLanguages.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.ProgrammingLanguages.entities.ProgrammingLanguages;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryPLanguagesRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguages> languages;
    private ProgrammingLanguageRepository programmingLanguageRepository;


    public InMemoryPLanguagesRepository() {
        languages = new ArrayList<ProgrammingLanguages>();
        languages.add(new ProgrammingLanguages("C#", 01 ));
        languages.add(new ProgrammingLanguages("Java", 02 ));
        languages.add(new ProgrammingLanguages("Python", 03 ));
    }

    @Override
    public List<ProgrammingLanguages> getAll() {
        return languages;
    }

    @Override
    public void add(ProgrammingLanguages programmingLanguages) throws Exception {
        languages.add(programmingLanguages);
    }

    @Override
    public void delete(ProgrammingLanguages programmingLanguages) {
        delete(programmingLanguages);
    }

    @Override
    public void update(ProgrammingLanguages programmingLanguages) throws Exception {
        update(programmingLanguages);
    }

    @Override
    public ProgrammingLanguages callById(int id) throws Exception {
        for (ProgrammingLanguages language: languages ){
            if (language.getId() == id){
                return language ;
            }
        }
        throw new Exception("kayit bulunamadi");
    }

    }



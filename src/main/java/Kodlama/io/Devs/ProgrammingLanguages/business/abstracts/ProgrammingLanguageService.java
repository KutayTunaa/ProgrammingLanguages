package Kodlama.io.Devs.ProgrammingLanguages.business.abstracts;

import Kodlama.io.Devs.ProgrammingLanguages.entities.ProgrammingLanguages;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguages> getAll();

    void add(ProgrammingLanguages programmingLanguages) throws Exception;

    void delete(ProgrammingLanguages programmingLanguages);

    void update(ProgrammingLanguages programmingLanguages) throws Exception;

    ProgrammingLanguages callById(int id) throws Exception;

}

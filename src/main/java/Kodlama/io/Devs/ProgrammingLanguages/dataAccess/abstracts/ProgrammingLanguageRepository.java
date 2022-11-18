package Kodlama.io.Devs.ProgrammingLanguages.dataAccess.abstracts;

import Kodlama.io.Devs.ProgrammingLanguages.entities.ProgrammingLanguages;

import java.util.List;

public interface ProgrammingLanguageRepository {

    List<ProgrammingLanguages> getAll();

    void add(ProgrammingLanguages programmingLanguages) throws Exception;

    void delete(ProgrammingLanguages programmingLanguages);

    void update(ProgrammingLanguages programmingLanguages) throws Exception;

    ProgrammingLanguages callById(int id) throws Exception;
}

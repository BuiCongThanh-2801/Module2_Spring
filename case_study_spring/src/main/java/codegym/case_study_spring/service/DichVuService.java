package codegym.case_study_spring.service;

import codegym.case_study_spring.model.FuramaDichVu;

import java.util.Optional;

public interface DichVuService   {
    public Iterable<FuramaDichVu> getAllDichVu();
    public Optional<FuramaDichVu> getDichVu(Long idDichVu);
    public void saveDichVu (FuramaDichVu dichVu);
    public void deleteDichVu(Long idDichVu);
}

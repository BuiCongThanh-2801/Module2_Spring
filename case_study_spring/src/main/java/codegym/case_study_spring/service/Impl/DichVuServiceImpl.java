package codegym.case_study_spring.service.Impl;

import codegym.case_study_spring.model.FuramaDichVu;
import codegym.case_study_spring.repository.DichVuRepository;
import codegym.case_study_spring.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DichVuServiceImpl implements DichVuService {
    @Autowired
    private DichVuRepository dichVuRepository;

    @Override
    public Iterable<FuramaDichVu> getAllDichVu() {
        return dichVuRepository.findAll();
    }

    @Override
    public Optional<FuramaDichVu> getDichVu(Long idDichVu) {
        return dichVuRepository.findById(idDichVu);
    }

    @Override
    public void saveDichVu(FuramaDichVu dichVu) {
        dichVuRepository.save(dichVu);
    }

    @Override
    public void deleteDichVu(Long idDichVu) {
        dichVuRepository.deleteById(idDichVu);
    }
}

package com.example.candidate.Services;

import com.example.candidate.Entity.Candidat;
import com.example.candidate.Repository.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatService {
    @Autowired
    private CandidatRepository candidatRepo;
    public Candidat addCandidat(Candidat candidat){
        return candidatRepo.save(candidat);
    }
    public Candidat updateCandidat(int id, Candidat newCandidat) {

        if (candidatRepo.findById(id).isPresent()) {
            Candidat existingCandidat = candidatRepo.findById(id).get();
            existingCandidat.setNom(newCandidat.getNom());
            existingCandidat.setPrenom(newCandidat.getPrenom());
            existingCandidat.setEmail(newCandidat.getEmail());
            return candidatRepo.save(existingCandidat);
        } else
            return null;
    }
    public String deleteCandidat(int id) {
        if (candidatRepo.findById(id).isPresent()) {
            candidatRepo.deleteById(id);
            return "candidat supprimé";
        } else
            return "candidat non supprimé";
    }
}

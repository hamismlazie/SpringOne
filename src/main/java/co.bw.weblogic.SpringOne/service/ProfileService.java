package co.bw.weblogic.SpringOne.service;

import co.bw.weblogic.SpringOne.model.Profile;

import java.util.List;
import java.util.UUID;

public interface ProfileService {
        List<Profile> findAll();
    Profile findByEmail(String email);
    Profile findById(UUID id);
    void deleteById(UUID id);
    Profile save(Profile profile, UUID userId);
}

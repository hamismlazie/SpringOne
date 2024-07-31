package co.bw.weblogic.SpringOne.service.impl;

import co.bw.weblogic.SpringOne.model.Profile;
import co.bw.weblogic.SpringOne.repository.ProfileRepository;
import co.bw.weblogic.SpringOne.repository.UserRepository;
import co.bw.weblogic.SpringOne.service.ProfileService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
@Transactional

public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private ProfileRepository profileRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Profile> findAll() {
        return profileRepository.findAll();
    }

    @Override
    public Profile findByEmail(String email) {
        return profileRepository.findByEmail(email).orElse(null);
    }

    @Override
    public Profile findById(UUID id) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {
    profileRepository.deleteById(id);

    }

    @Override
    public Profile save(Profile profile, UUID userId) {
            profileRepository.save(profile);
            return profile;

    }
}

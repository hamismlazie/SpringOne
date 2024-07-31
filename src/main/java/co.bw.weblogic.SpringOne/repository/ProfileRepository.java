package co.bw.weblogic.SpringOne.repository;

import co.bw.weblogic.SpringOne.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ProfileRepository extends JpaRepository <Profile, UUID>{
    Optional<Profile> findByEmail(String email);

}

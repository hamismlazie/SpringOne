package co.bw.weblogic.SpringOne.controller;

import co.bw.weblogic.SpringOne.model.Profile;
import co.bw.weblogic.SpringOne.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/profile")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @PostMapping("/{id}")
    public Profile saveProfile(@RequestBody Profile profile,@PathVariable UUID id) {
        return profileService.save(profile,id);
    }
    @GetMapping("/")
    public List<Profile> getAllUsers() {
        return profileService.findAll();
    }
    @GetMapping("/{id}")
    public Profile findUserById(@PathVariable UUID id) {
        return profileService.findById(id);
    }
    @GetMapping("/email/{email}")
    public Profile findProfileByEmail(@PathVariable String email) {
        return profileService.findByEmail(email);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable UUID id) {
        profileService.deleteById(id);
    }
}

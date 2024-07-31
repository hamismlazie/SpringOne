package co.bw.weblogic.SpringOne.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.util.Lazy;

import java.util.UUID;

@Entity
@Transactional
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "profiles")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String address;
    private String phone;
    private String city;
    private String email;

    @OneToOne(mappedBy = "profile",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
     private User user;
}

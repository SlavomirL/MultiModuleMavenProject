package guru.springframework.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@XmlRootElement(name = "User")
public class User {

    @Id
    private Long id;

    private String firstName;
    private String lastname;
    private String email;
}

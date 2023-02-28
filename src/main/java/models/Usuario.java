package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(appliesTo = "usua")
@ToString @EqualsAndHashCode
public class Usuario {

    @Id
    @Getter @Setter @Column(name = "id")
    private String id;


    @Getter @Setter @Column(name = "Nombre")
    private String nombre;

    @Getter @Setter @Column(name = "Apellido")
    private String apellido;
    @Getter @Setter @Column(name = "Correo")
    private String correo;
    @Getter @Setter @Column(name ="Teléfono")
    private String telefono;
    @Getter @Setter @Column(name = "Password")
    private String contrasena;


}
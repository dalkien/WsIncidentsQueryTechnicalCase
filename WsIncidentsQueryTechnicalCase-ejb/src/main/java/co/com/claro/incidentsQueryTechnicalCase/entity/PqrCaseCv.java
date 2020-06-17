package co.com.claro.incidentsQueryTechnicalCase.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PQR_CASE_CV")
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(name = "PqrCaseCv.findAll", query = "SELECT q FROM PqrCaseCv q")
})
public class PqrCaseCv implements Serializable {

    @Id
    @Column(name = "ID")
    @Getter @Setter
    private Long id;
}

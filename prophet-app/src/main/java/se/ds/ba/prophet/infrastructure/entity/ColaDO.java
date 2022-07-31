package se.ds.ba.prophet.infrastructure.entity;

import lombok.*;
import javax.persistence.*;

/**
 * @author SE.COLA
 */

@Entity
@Table(name = "ColaDO")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ColaDO {

  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

}

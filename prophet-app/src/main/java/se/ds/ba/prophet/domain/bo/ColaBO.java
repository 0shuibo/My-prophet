package se.ds.ba.prophet.domain.bo;

import lombok.*;

/**
 * @author SE.COLA
 */

@EqualsAndHashCode
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ColaBO {

  private Long id;

  private String name;

  private String description;

  public ColaBO(Long id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }
}

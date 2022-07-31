package se.ds.ba.prophet.domain.dto;

import lombok.*;

/**
 * @author SE.COLA
 */

@EqualsAndHashCode
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ColaDTO{

  private Long id;

  private String name;

  private String description;

  public ColaDTO(Long id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }
}

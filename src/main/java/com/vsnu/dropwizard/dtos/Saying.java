package com.vsnu.dropwizard.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Saying {
    @JsonProperty
    private long id;

    @Length(max = 3)
    @JsonProperty
    private String content;
}

package io.github.dft.speedship.model.ltl.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InsuredValue {
    public String unit;
    public String value;
}

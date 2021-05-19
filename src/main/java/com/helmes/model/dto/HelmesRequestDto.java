package com.helmes.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelmesRequestDto {
    private String name;
    private List<Sector> sector;
    private boolean acceptedTerms;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Sector {
        private String label;
        private String value;
    }
}

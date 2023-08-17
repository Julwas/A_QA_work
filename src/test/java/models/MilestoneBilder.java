package models;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

@Builder
@ToString
@EqualsAndHashCode
public class MilestoneBilder {

    private int id;

    @NonNull
    private String name;
    private String references;
    private String description;
    @ToString.Exclude
    private boolean completed;
}
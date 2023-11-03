package com.example.SingleTableExample.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter @Setter
@DiscriminatorValue("A")
@AllArgsConstructor
@SuperBuilder
public class Ave extends Animal{

}

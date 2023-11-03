package com.example.SingleTableExample.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter @Setter
@DiscriminatorValue("M")
@AllArgsConstructor
@SuperBuilder
public class Mamifero extends Animal{


}

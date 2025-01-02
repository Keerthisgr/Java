package com.xworkz.collection.generics.customtype;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Gmail {
    private String toAddress;
    private String fromAddress;
    private String description;
}

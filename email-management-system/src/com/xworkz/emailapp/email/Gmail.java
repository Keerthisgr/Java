package com.xworkz.emailapp.email;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Gmail {
    private String to;
    private String from;
    private String subject;
    private String body;
    private boolean isDocAttached;
}

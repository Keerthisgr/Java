package com.xworkz.gmailapp.gmail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Gmail {
    private String to;
    private String from;
    private String subject;
    private String body;
    private boolean isDocAttached;
}

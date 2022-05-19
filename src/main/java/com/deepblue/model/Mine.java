package com.deepblue.model;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mine {

    private Long id;

    private String username;

    private String password;
}

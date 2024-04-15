package com.techheaven.userdetailserviceapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleHasUserKey implements Serializable {

    @Column(name = "user_id")
    private long user;

    @Column(name = "role_id")
    private long userRole;

}

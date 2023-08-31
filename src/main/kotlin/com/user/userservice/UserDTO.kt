package com.user.userservice

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@NoArgsConstructor
@AllArgsConstructor
data class UserDTO {
    val firstName: String? = null
    val middleName: String? = null;
    val lastName: String? = null;
    val fullName: String? = null;
    val email: String? = null;
    val mobilePhone: String? = null;
}
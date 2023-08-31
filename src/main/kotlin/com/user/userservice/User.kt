package com.user.userservice

import lombok.AllArgsConstructor
import lombok.Data
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Data
@AllArgsConstructor
@Table(name = "tbl_users")
class User(firstName: String?, middleName: String?, lastName: String?, fullName: String?, email: String?, mobilePhone: String?) {
    @Id
    var id: Long? = null
    var firstName: String? = null;
    var middleName: String? = null;
    var lastName: String? = null;
    var fullName: String? = null;
    var email: String? = null;
    var mobilePhone: String? = null;
}
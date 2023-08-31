package com.user.userservice

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/users")
class UserController(private val userService: UserServiceImpl) {

    @GetMapping("/")
    suspend fun getUsers() = userService.getAll()

    @GetMapping("/{id}")
    suspend fun getUserById(@PathVariable id: Long) = userService.getById(id)

    @PostMapping("/createNew")
    suspend fun save(@RequestBody newUser: UserDTO) = userService.createNewUser(newUser)

    @PutMapping("/updateUser/{id}")
    suspend fun update(@RequestBody user: User, @PathVariable id: Long) = userService.updateUser(user, id)

    @DeleteMapping("/delete/{id}")
    suspend fun delete(@PathVariable id: Long) = userService.deleteUser(id)

    private fun User.toModel(): User =
            User(
                    firstName = this.firstName,
                    middleName = this.middleName,
                    lastName = this.lastName,
                    fullName = this.fullName,
                    email = this.email,
                    mobilePhone = this.mobilePhone
            )
}
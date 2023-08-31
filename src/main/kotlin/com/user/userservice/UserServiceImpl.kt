package com.user.userservice

import kotlinx.coroutines.flow.toList
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository) {
    suspend fun getAll(): List<User> =
            userRepository.findAll().toList()

    suspend fun getById(id: Long): User? {
        return if (userRepository.existsById(id)){
            userRepository.findById(id)
        } else{
            return null
        }
    }

    suspend fun createNewUser(newUser: User) = userRepository.save(newUser)

    suspend fun updateUser(newUser: User, id: Long) : User? {
        return if (userRepository.existsById(id)){
            newUser.id = id
            userRepository.save(newUser)
        }else {
            return null
        }
    }

    suspend fun deleteUser(id:Long) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id)
        }
    }
}
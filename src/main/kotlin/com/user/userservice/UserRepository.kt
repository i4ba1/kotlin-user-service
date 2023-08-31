package com.user.userservice

import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository:CoroutineCrudRepository<User, Long> {
}
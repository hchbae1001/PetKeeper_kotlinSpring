package dto

import java.util.*

data class UserDTO(
    val userId: Long? = null,
    val userOauthId: String? = null,
    val userEmail: String? = null,
    val userPassword: String? = null,
    val userName: String? = null,
    val userPhone: String? = null,
    val userAccessToken: String? = null,
    val userBirthdate: Date? = null,
    val userImage: String = "https://petkeeper.s3.ap-northeast-2.amazonaws.com/user-profile/default-img",
    val userAuth: String? = null,
    val userDate: Date? = null,
    val userTime: Date? = null,
    val isDeleted: Boolean? = false,
    val userOauthProvider: String? = null,
    val userEmailVerified: Boolean? = false
)
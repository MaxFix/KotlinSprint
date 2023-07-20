package lesson_11

fun main() {
    val firstContact = MyContact("жена", "userName")
    val secondContact = MyContact("подруга", "userName")
    val thirdContact = MyContact("подруга2", "userName")


    val screen1 = Contact(
        iCloudMail = "mail@mail.ru", favoriteContacts = listOf(firstContact)
    )
    screen1.setFavoriteContacts(secondContact)
    screen1.showFavoriteContacts()
    println()
    screen1.setFavoriteContacts(thirdContact)
    screen1.showFavoriteContacts()
    println()

    val screen2 = UserInfoHeader(
        "myAvatar.png", "Ïvan", "Smirnoff"
    )
    screen2.setAvatar()
    screen2.setFirstName()
    screen2.setSecondName()
    println()
    println(screen1.call)
}

class Contact(
    val messageTitle: String = "написать",
    var writeMessage: String = "Открываем диалог",
    val callTitle: String = "вызов",
    val call: String = "Начинаем звонок",
    val videoTitle: String = "видео",
    val video: String = "Начинаем видеозвонок",
    val mailTitle: String = "почта",
    val mail: String = "Открыть окно отправки email сообщения",
    val faceTimeTitle: String = "FaceTime",
    val faceTimeVideo: String = "Начинаем FaceTime видео звонок",
    val faceTimeCall: String = "Начинаем FaceTime аудио звонок",
    val iCloudMail: String,
    var favoriteContacts: List<MyContact>,
) {
    fun sendMessage() {
        println(writeMessage)
    }

    fun phoneCall() {
        call
    }

    fun videoCall() {
        video
    }

    fun sendEmail() {
        mail
    }

    fun faceTimeCall() {
        println("Начинаем аудиозвонок в FaceTime")
    }

    fun faceTimeVideoCall() {
        println("Начинаем видеозвонок в FaceTime")
    }

    fun setFavoriteContacts(contact: MyContact) {
        favoriteContacts += listOf(contact)
    }

    fun showFavoriteContacts() {
        favoriteContacts.forEach {
            it.showInfo()
        }
    }
}

class UserInfoHeader(
    var avatar: String,
    var firstName: String,
    var lastName: String,
) {

    fun setAvatar() {
        println("Новая аватарка установлена")
    }

    fun setFirstName() {
        println("Введите имя")
        firstName = readln()
        println("Теперь ваше имя $firstName")
    }

    fun setSecondName() {
        println("Введите фамилию")
        lastName = readln()
        println("Теперь ваша фамилия $lastName")
    }
}

class PersonalPhones(
    val mobilePhoneTitle: String = "сотовый",
    val mobilePhone: Long,
    val homePhoneTitle: String = "домашний",
    val homePhone: Long,
) {
    fun copyMobilePhone() {
        println("Копируем мобильный номер телефона при нажатии")
    }

    fun copyHomePhone() {
        println("Копируем домашний номер телефона при нажатии")
    }
}

class MyContact(
    private val title: String,
    private val userName: String,
    val myFavoriteContacts: Boolean = true,
) {
    fun showInfo() {
        println("Роль $title и имя $userName")
    }
}
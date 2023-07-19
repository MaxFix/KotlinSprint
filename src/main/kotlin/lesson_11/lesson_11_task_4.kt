package lesson_11

fun main() {
    val firstContact = MyContacts("жена", "userName")
    val secondContact = MyContacts("подруга", "userName")
    val thirdContact = MyContacts("подруга", "userName")

    val screen1 = Contact(
        firstName = "First Name", lastName = "Second Name", mobilePhone = 89999994242,
        homePhone = 89998884242, iCloudMail = "mail@mail.ru", myFavoriteContacts = listOf(firstContact, secondContact, thirdContact)
    )

    screen1.setAvatar()
    screen1.setFirstName()
    screen1.setSecondName()
    println(screen1.call)
    screen1.myFavoriteContacts[0].showInfo()

}

class Contact(
    var avatar: String = "avatar_picture.png",
    var firstName: String,
    var lastName: String,
    val messageIcon: String = "message_icon.png",
    val messageTitle:String = "написать",
    var writeMessage: String = "Открываем диалог",
    val callIcon: String = "call_icon.png",
    val callTitle: String = "вызов",
    val call: String = "Начинаем звонок",
    val videoIcon: String = "video_icon.png",
    val videoTitle: String = "видео",
    val video: String = "Начинаем видеозвонок",
    val mailIcon: String = "main_icon.png",
    val mailTitle: String = "почта",
    val mail: String = "Открыть окно отправки email сообщения",
    val mobilePhoneTitle: String = "сотовый",
    val mobilePhone: Long,
    val homePhoneTitle: String = "домашний",
    val homePhone: Long,
    val faceTimeTitle: String = "FaceTime",
    val faceTimeVideoIcon:String = "facetime_video_icon",
    val faceTimeVideo:String = "Начинаем FaceTime видео звонок",
    val faceTimeCallIcon:String = "facetime_call_icon",
    val faceTimeCall:String = "Начинаем FaceTime аудио звонок",
    val iCloudTitle: String = "iCloud",
    val iCloudMail: String,
    val myFavoriteContacts: List<MyContacts>,
) {
    fun setAvatar() {
        println("Укажите путь до новой аватарки:")
        avatar = readln()
        println("Новая аватарка установлена из $avatar")
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

    fun copyMobilePhone() {
        println("Копируем мобильный номер телефона при нажатии")
    }

    fun copyHomePhone() {
        println("Копируем домашний номер телефона при нажатии")
    }

    fun faceTimeCall() {
        println("Начинаем аудиозвонок в FaceTime")
    }

    fun faceTimeVideoCall() {
        println("Начинаем видеозвонок в FaceTime")
    }
}

class MyContacts(
    private val title: String,
    private val userName: String,
) {
    fun showInfo() {
        println("Роль $title и имя $userName")
    }
}
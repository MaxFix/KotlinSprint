package lesson_11

fun main() {
    val user1 = User(nickname = "dino", statuses = "разговаривает")
    val user2 = User(nickname = "zavr", statuses = "микрофон выключен")
    val user3 = User(avatar = "gnom.png", nickname = "grim", statuses = "пользователь заглушен")

    val room1 = Room(name = "Приватная комната", members = listOf(user1, user2, user3))
    room1.showGroupName()
    room1.startGroupCall()
    room1.scrollUp()
    room1.scrollDown()
    user1.showStatus()
    user2.showStatus()
    room1.showUsers(0)
    room1.showUsers(1)
    room1.endGroupCall()

    println()

    val room2 = Room(cover = "mew.png", name = "Business room", members = listOf(user2, user3))
    room2.showCover()
    user3.avatarLongTap()
    room2.muteMic()
    room2.unmuteMic()
}

class Room(
    val cover: String = "default_cover.png",
    val name: String,
    val members: List<User>,
) {
    fun showGroupName() {
        println("Название группы $name")
    }
    fun scrollDown() {
        println("Скроллим ленту комнат вниз")
    }

    fun scrollUp() {
        println("Скроллим ленту комнат вверх")
    }

    fun startGroupCall() {
        println("Начинаем групповой звонок")
    }

    fun endGroupCall() {
        println("Заканчиваем групповой звонок")
    }

    fun muteMic() {
        println("Отключаем микрофон")
    }

    fun unmuteMic() {
        println("Включаем микрофон")
    }

    fun showUsers(index: Int) {
        println("Ник пользователя: ${members[index].nickname}")
    }

    fun showCover() {
        println("Иконка группы $cover")
    }
}

class User(
    avatar: String = "avatar.png",
    val nickname: String,
    val statuses: String,
) {
    fun avatarLongTap() {
        println("Делаем лонгтап по аватару")
        highlightNickname()
    }

    private fun highlightNickname() {
        println("Подсвечиваем никнейм $nickname")
    }

    fun showStatus() {
        if (statuses.lowercase() == "разговаривает") println("Статус пользователя: Разговаривает")
        else if (statuses.lowercase() == "микрофон выключен") println("Статус пользователя: Микрофон выключен")
        else if (statuses.lowercase() == "пользователь заглушен") println("Статус пользователя: Пользователь заглушен")
        else println("Пустой статус пользователя")
    }
}
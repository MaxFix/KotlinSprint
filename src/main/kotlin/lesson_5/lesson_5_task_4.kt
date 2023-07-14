package lesson_5

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"
const val WELCOME_TEXT = """
        Внимание, пассажир. Моя обязанность, как обычно, незавидная, 
        - приветствовать вас на борту корабля "Heart of Gold". [вздыхает...] 
        Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. 
        Я всегда готов служить, хотя это не приносит мне радости... 
        но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...] 
        Да, вперед, пожалуйста, вводите свои данные...
        """
const val SUCCESS_LOGIN_TEXT = """
        [вздыхает...] Ваши данные проверены, и о, чудо, они верны... 
        Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". Хотя мне всё равно... 
        Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] 
        Надеюсь, вам понравится пребывание здесь больше, чем мне.
        """
const val ENTER_LOGIN_TEXT = "Введите свой логин: "
const val ENTER_PASSWORD_TEXT = "Введите свой пароль: "
const val UNREGISTERED_USER_TEXT = "Предлагаю пользователю сначала зарегистрироваться через главный компьютер" +
                                    "\nВсего хорошего!"
fun main() {
    println(WELCOME_TEXT.trimIndent())
    println(ENTER_LOGIN_TEXT)
    val name = readln()
    println(ENTER_PASSWORD_TEXT)
    val password = readln()

    if (name == LOGIN && password == PASSWORD) {
        println(SUCCESS_LOGIN_TEXT.trimIndent())
    } else {
        println(UNREGISTERED_USER_TEXT)
    }
}
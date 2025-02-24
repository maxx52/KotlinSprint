package ru.maxx52.lesson_22

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}

data class MainScreenState(
    val data: String = DataState.NO_DATA.toString(),
    val isLoading: Boolean = false
)

class MainScreenViewModel {
    private var mainScreenState = MainScreenState()

    fun loadData() {
        mainScreenState = mainScreenState.copy(isLoading = false)
        println("Текущее состояние: $mainScreenState")

        mainScreenState = mainScreenState.copy(isLoading = true, data = DataState.LOAD_DATA.toString())
        println("Текущее состояние: $mainScreenState")

        Thread.sleep(2000)

        mainScreenState = mainScreenState.copy(isLoading = false, data = DataState.HAVE_DATA.toString())
        println("Текущее состояние: $mainScreenState")
    }
}

enum class DataState(private val s: String) {
    NO_DATA("отсутствие данных"),
    LOAD_DATA("загрузка данных"),
    HAVE_DATA("наличие загруженных данных");

    override fun toString(): String {
        return s
    }
}
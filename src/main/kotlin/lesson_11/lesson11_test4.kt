package ru.maxx52.lesson_11

fun main() {

    val ingredient1 = Ingredient("Мука", 200)
    val ingredient2 = Ingredient("Сахар", 100)
    val ingredients = listOf(ingredient1, ingredient2)

    val recipe1 = Recipe("Пирог", "Вкусный яблочный пирог", ingredients)
    val recipe2 = Recipe(
        "Кекс",
        "Нежный ванильный кекс",
        listOf(Ingredient("Яйцо", 3),
            Ingredient("Масло", 100)
        )
    )

    val category = Category("Выпечка")
    category.addRecipe(recipe1)
    category.addRecipe(recipe2)

    println("Категория: ${category.name}")
    for (recipe in category.getRecipes()) {
        println("Рецепт: ${recipe.name}, Описание: ${recipe.description}")
        for (ingredient in recipe.getIngredients()) {
            println(" - ${ingredient.nameIngredient}: ${ingredient.volumeIngredient} г")
        }
    }
}

class Category(val name: String) {
    private val recipeList = mutableListOf<Recipe>()

    fun addRecipe(recipe: Recipe) {
        recipeList.add(recipe)
    }

    fun getRecipes(): List<Recipe> {
        return recipeList
    }
}

class Recipe(
    val name: String,
    val description: String,
    private val ingredients: List<Ingredient>
) {
    fun getIngredients(): List<Ingredient> {
        return ingredients
    }
}

class Ingredient(
    val nameIngredient: String,
    val volumeIngredient: Int,
)
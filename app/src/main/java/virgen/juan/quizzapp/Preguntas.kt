package virgen.juan.quizzapp

import androidx.annotation.StringRes

data class Preguntas(
    @StringRes val textResId: Int,
    val answer: Boolean
)

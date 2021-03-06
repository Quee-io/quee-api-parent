package io.quee.ktx.develop.shared.func

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **Sat Aug, 2019**
 */
@FunctionalInterface
interface Mapper<I, O : I> {
    fun map(input: I): O
}
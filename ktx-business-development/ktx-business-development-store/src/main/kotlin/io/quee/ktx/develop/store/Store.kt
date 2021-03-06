package io.quee.ktx.develop.store

import io.quee.ktx.develop.identity.Identity
import java.io.Serializable

/**
 * Created By [**Ibrahim Al-Tamimi **](https://www.linkedin.com/in/iloom/)<br></br>
 * Created At **Sat Aug, 2019**
 */
interface Store<ID : Serializable, I : Identity<ID>> {
    fun I.save(): I
    fun List<I>.save(): Iterable<I>
    fun ID.delete()
    fun I.delete()
    fun List<ID>.deleteAllByIds()
    fun List<I>.deleteAll()
    val storeQuery: StoreQuery<ID, I>
    fun identityCreator(): StoreIdentityCreator<ID, I>
    fun I.identityUpdater(): StoreIdentityUpdater<ID, I>
}
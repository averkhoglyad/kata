package test

import org.assertj.core.api.InstanceOfAssertFactories
import org.assertj.core.api.InstanceOfAssertFactory
import org.assertj.core.api.ListAssert

inline fun <reified E> list(): InstanceOfAssertFactory<List<*>, ListAssert<E>> =
    InstanceOfAssertFactories.list<E>(E::class.java)

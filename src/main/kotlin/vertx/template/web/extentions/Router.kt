package vertx.template.web.extentions

import io.vertx.ext.web.Router
import kotlinx.coroutines.CoroutineDispatcher
import vertx.template.web.CoroutineRouter

inline fun Router.coroutine(dispatcher: CoroutineDispatcher): CoroutineRouter {
    return CoroutineRouter(dispatcher, this)
}
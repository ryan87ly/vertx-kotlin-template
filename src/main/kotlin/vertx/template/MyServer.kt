package vertx.template

import io.vertx.core.Vertx
import vertx.template.web.WebServer

class MyServer {
    val vertx = Vertx.vertx()
    val webServer = WebServer(vertx)

    suspend fun start(): Unit {
        webServer.start()
    }
}
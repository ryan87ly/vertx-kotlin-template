package vertx.template.web.endpoints

import io.vertx.ext.web.Router

interface HttpEndpoint {
    val router: Router
}
package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render());
    }

    public Result about() {
        return ok(about.render());
    }

    public Result page1() {
        return ok(page1.render());
    }

    public Result page2() {
        return ok(page2.render());
    }

    public Result page3() {
        return ok(page3.render());
    }

    public Result products() {
        return ok(products.render());
    }

    public Result services() {
        return ok(services.render());
    }

    public Result shopping_cart() {
        return ok(shopping_cart.render());
    }

    public Result login() {
        return ok(login.render());
    }
}

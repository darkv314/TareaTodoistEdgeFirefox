package factoryBrowser;

public class FactoryBrowser {

    public static IBrowser make(String type){
        IBrowser browser = switch (type.toLowerCase()) {
            case "chrome" -> new Chrome();
            case "edge" -> new Edge();
            case "firefox" -> new FireFox();
            default -> new Chrome();
        };

        return browser;
    }
}

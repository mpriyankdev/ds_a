package webcrawler.bfs;

public class App {

    public static void main(String[] args) {
        WebCrawler webCrawler = new WebCrawler();
        String rootUrl = "http://www.google.com";

        webCrawler.discoverWeb(rootUrl);
    }


}

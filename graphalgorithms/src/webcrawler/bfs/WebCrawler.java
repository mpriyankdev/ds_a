package webcrawler.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {

    private Queue<String> queue;
    private List<String> discoveredWebsites;

    public WebCrawler(){
        this.queue = new LinkedList<>();
        this.discoveredWebsites = new ArrayList<>();
    }

    public void discoverWeb(String root){
        this.queue.add(root);
        this.discoveredWebsites.add(root);

        while(!queue.isEmpty()){
            String v = this.queue.remove();
            String rawHtml = readUrl(v);

            String regexp = "http://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(rawHtml);
            while(matcher.find()){
                final String actualUrl = matcher.group();
                if(!discoveredWebsites.contains(actualUrl)){
                    discoveredWebsites.add(actualUrl);
                    System.out.println("Website found with URL : "+actualUrl);
                    this.queue.add(actualUrl);
                }
            }
        }
    }

    private String readUrl(String v) {

        String rawHtml = "";

        try{
            URL url = new URL(v);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine = "";

            while((inputLine = bufferedReader.readLine())!=null){
                rawHtml += inputLine;
            }


        }catch (Exception e){
            e.printStackTrace();
        }

        return rawHtml;
    }

}

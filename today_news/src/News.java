import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class News {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.yna.co.kr/news").get();

        Elements newsheadlines = doc.getElementsByClass("tit-news");
        for (Element e : newsheadlines) {
            String str = e.text();
            System.out.println(str);
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContentExtratorNASA extends ContentExtrator {
    public List<Content> extractor(String json) {
        JsonParser parser = new JsonParser();
        List<Map<String, String>> attributeList = parser.parse(json);

        List<Content> allContents = new ArrayList<>();

        for (Map<String, String> attribute: attributeList) {
            String title = attribute.get("title").strip().replace(":", "-").replace("/", "-");

            String urlImage = attribute.get("url");

            String rating = attribute.get("rating");

            Content content = new Content(title, urlImage);
            allContents.add(content);
        }
        return allContents;
    }
}

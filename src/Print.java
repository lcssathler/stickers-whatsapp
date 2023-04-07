import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class Print {
    public void printData (List<Content> apiContent) throws Exception {
        for (Content content: apiContent) {
            System.out.println("Nome: " + content.title());

            //imprimindo poster
            System.out.println("Poster: " + content.urlImage());
            System.out.println();

            //gerando uma figurinha do filme
            InputStream inputStream = new URL(content.urlImage()).openStream();
            String fileName = "stickerswhatsapp/" + content.title() + ".png";
            StickerGenerator sticker = new StickerGenerator();
            sticker.generate(inputStream, fileName);
        }
    }
}

import java.io.File;
import java.util.List;

public class StickerAPI {
    public static void main(String[] args) throws Exception {

        //creating the directory to store the stickers
        var directory = new File("stickerswhatsapp/");
        directory.mkdir();
        if (directory.mkdir()) {
            System.out.println("Diretório criado com sucesso!");
        }

        // making a http connection
        String url = System.getenv("IMDB_KEY");
        ContentExtrator extract = new ContentExtratorIMDB();

//        String url = System.getenv("NASA_KEY");
//        ContentExtrator extract = new ContentExtratorNASA();

        Http httpclient = new Http();

        // extracting json content
        String json = httpclient.getData(url);
        List<Content> contentList = extract.extractor(json);

        // printing list content
        Print print = new Print();
        print.printData(contentList);
    }
}

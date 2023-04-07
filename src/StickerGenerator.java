import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;


public class StickerGenerator {
    public void generate(InputStream inputStream, String fileName) throws Exception{
        // leitura da imagem
        BufferedImage originalImage = ImageIO.read(inputStream);
        if (originalImage == null) {
            return;
        }

        // reading the dimensions of the previous image and creating a new image
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();
        int newHeight = height + 200;
        BufferedImage newImage = new BufferedImage(width, newHeight, BufferedImage.TRANSLUCENT);

        //overwriting the new image with the original image
        Graphics2D graphicsNewImage = (Graphics2D) newImage.getGraphics();
        graphicsNewImage.drawImage(originalImage, 0, 0, null);

        // setting the font
        Font font = new Font("Comic Sans", Font.BOLD, 90);
        graphicsNewImage.setColor(Color.YELLOW.brighter());
        graphicsNewImage.setFont(font);


        // adding a phrase to the sticker
        String text = "FICÇÃO CIENTÍFICA";

        //centering the phrase
        FontMetrics fontMetrics = graphicsNewImage.getFontMetrics();
        Rectangle2D rectangle = fontMetrics.getStringBounds(text, graphicsNewImage);
        int rectangleWidth = (int) rectangle.getWidth();
        int textPositionX = (width - rectangleWidth) / 2;
        int textPositionY = newHeight - 50;
        graphicsNewImage.drawString(text, textPositionX, newHeight - 50);

        // putting border on phrase
        FontRenderContext fontRenderContext = graphicsNewImage.getFontRenderContext();
        var textLayout = new TextLayout(text, font, fontRenderContext);

        Shape outline = textLayout.getOutline(null);
        AffineTransform transform = graphicsNewImage.getTransform();
        transform.translate(textPositionX, textPositionY );
        graphicsNewImage.setTransform(transform);

        var outlineStroke = new BasicStroke(width * 0.008f);
        graphicsNewImage.setStroke(outlineStroke);

        graphicsNewImage.setColor(Color.BLACK);
        graphicsNewImage.draw(outline);
        graphicsNewImage.setClip(outline);

        // writing the new image in a new file
        ImageIO.write(newImage, "png", new File(fileName));


    }
}


package ru.spbu.arts.java.oop.javafx;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Images extends Application {

    @Override
    public void start(Stage stage){
        stage.setTitle("task with drawing");
        Parent mom = initInterface();
        stage.setScene((new Scene(mom)));
        stage.show();

    }

    private Parent initInterface(){
        WritableImage firstPainting = new WritableImage(100, 100);
        PixelWriter forFirstImage = firstPainting.getPixelWriter();
        for (int x=0; x<100; x++){
            for (int y=0; y<100; y++){
                forFirstImage.setColor(x, y, Color.MAROON);
            }
        }
        ImageView first = new ImageView(firstPainting);

        WritableImage secondPainting = new WritableImage(256, 256);
        PixelWriter forSecondPainting = secondPainting.getPixelWriter();
        for (int x=0; x<256; x++){
            for (int y=0; y<256; y++){
                forSecondPainting.setColor(x,y,Color.rgb(x,y,123));
            }
        }
        ImageView second = new ImageView(secondPainting);

        WritableImage thirdPainting = new WritableImage(360,100);
        PixelWriter forThirdPainting = thirdPainting.getPixelWriter();
        for (int x =0; x<360; x++){
            for (int y=0; y<100; y++){
                forThirdPainting.setColor(x,y, Color.hsb(x, (double)y/100, 0.5));
            }
        }
        ImageView third = new ImageView(thirdPainting);

        WritableImage fourthPainting = new WritableImage(100,100);
        PixelWriter forFourthPainting = fourthPainting.getPixelWriter();
        for (int x=0; x<100; x++) {
            for (int y = 0; y < 100; y++) {
                if (y > 25 && y < 75 && x>25 && x<75) { //точно только по x?
                    forFourthPainting.setColor(x, y, Color.BLACK);
                } else {
                    forFourthPainting.setColor(x, y, Color.WHITE);
                }
            }
        }
        ImageView fourth = new ImageView(fourthPainting);

        WritableImage fifthPainting = new WritableImage(100,100);
        PixelWriter forFifthPainting = fifthPainting.getPixelWriter();
        for (int x=0; x<100; x++) {
            for (int y = 0; y < 100; y++) {
                if ((int)(Math.pow((x-50),2) + (int)Math.pow((y-50),2))<50*50){
                    forFifthPainting.setColor(x,y,Color.BLACK);
                }else{
                    forFifthPainting.setColor(x,y, Color.WHITE);
                }
            }
        }
        ImageView fifth = new ImageView(fifthPainting);

        WritableImage sixthPainting = new WritableImage(360,100);
        PixelWriter forSixthPainting = sixthPainting.getPixelWriter();
        for (int x =0; x<360; x++){
            for (int y=0; y<100; y++){
                forSixthPainting.setColor(x,y, LCH.colorFromLCH(0.5, x, (double)y/100));
            }
        }
        ImageView sixth = new ImageView(sixthPainting);

        WritableImage seventhPainting = new WritableImage(371, 100);
        PixelWriter forSeventhPainting = seventhPainting.getPixelWriter();
        for (int y =0; y<100; y++){
            for (int x = 380; x<750; x++){
                    double[] transformRGB = TransformWaves.transformWave(x);
                    Color rainbow = Color.color(transformRGB[0]/255.0,transformRGB[1]/255.0, transformRGB[2]/255.0);
                    forSeventhPainting.setColor(x-380, y, rainbow);
                    }
                }

        ImageView seventh = new ImageView(seventhPainting);

        return new FlowPane(first,
                second, third, fourth, fifth, sixth, seventh);
    }
}

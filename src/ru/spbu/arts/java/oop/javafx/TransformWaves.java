package ru.spbu.arts.java.oop.javafx;

public class TransformWaves {

    public static double[] transformWave(int wavelength){
        double gamma = 0.8;
        double R, G ,B, attenuation;
        if (wavelength >= 380 & wavelength <= 440) {
                attenuation = 0.3 + 0.7 * (wavelength - 380) / (440 - 380);
                R = Math.pow((-(wavelength - 440) / (440 - 380)) * attenuation , gamma);
                G = 0.0;
                B = Math.pow(1.0 * attenuation , gamma);
            }
            else if (wavelength >= 440 & wavelength <= 490) {
                R = 0.0;
                G = Math.pow((wavelength - 440) / (490 - 440), gamma);
                B = 1.0;
            }
            else if (wavelength >= 490 & wavelength <= 510) {
                R = 0.0;
                G = 1.0;
                B = Math.pow(-(wavelength - 510) / (510 - 490),  gamma);
            }
            else if (wavelength >= 510 & wavelength <= 580) {
                R = Math.pow ((wavelength - 510) / (580 - 510), gamma);
                G = 1.0;
                B = 0.0;
            }
            else if (wavelength >= 580 & wavelength <= 645) {
                R = 1.0;
                G = Math.pow(-(wavelength - 645) / (645 - 580), gamma);
                B = 0.0;
            }
            else if (wavelength >= 645 & wavelength <= 750) {
                attenuation = 0.3 + 0.7 * (750 - wavelength) / (750 - 645);
                R = Math.pow(1.0 * attenuation, gamma);
                G = 0.0;
                B = 0.0;
            }
            else {
                R = 0.0;
                G = 0.0;
                B = 0.0;
            }
            R = R * 255;
            G = G * 255;
            B = B * 255;

        double[] rgb = new double[]{R, G, B};
        return (rgb);

        }
    }


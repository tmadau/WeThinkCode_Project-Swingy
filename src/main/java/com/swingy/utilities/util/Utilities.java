package com.swingy.utilities.util;

import java.awt.FontFormatException;
import java.io.IOException;
import java.awt.Font;
import java.io.File;

public class Utilities {

    public static Font smallFont;
    public static Font bigFont;
    public static Font font2;
    public static Font font3;

    public Utilities() {
        String pathToResources = findPathToResources();
        loadFonts(pathToResources);
    }

    private void loadFonts(String pathToResources) {
        try {
            smallFont = Font.createFont(Font.TRUETYPE_FONT, new File(pathToResources.concat("fonts/font.otf"))).deriveFont(18f);
            bigFont = Font.createFont(Font.TRUETYPE_FONT, new File(pathToResources.concat("fonts/font.ttf"))).deriveFont(30f);
            font2 = Font.createFont(Font.TRUETYPE_FONT, new File(pathToResources.concat("fonts/font2.ttf"))).deriveFont(20f);
            font3 = Font.createFont(Font.TRUETYPE_FONT, new File(pathToResources.concat("fonts/font3.ttf"))).deriveFont(20f);
        }
        catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public static String findPathToResources() {
        return System.getProperty("user.dir").concat("/resources/");
    }

}

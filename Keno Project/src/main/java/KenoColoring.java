import java.util.*;

public class KenoColoring{
    private static String GENERAL;
    private static String IDLE;
    private static String HOVERED;
    private static String CLICKED;
    private static String BACKGROUND;
    private static String ACCENT;
    private static String ColorPallete;
    private static String primary;
    private static String border;

    public static String getGeneral(){
        return GENERAL;
    }

    public static String getIdle(){
        return IDLE;
    }

    public static String getHovered(){
        return HOVERED;
    }

    public static String getClicked(){
        return CLICKED;
    }

    public static String getAccent(){ return ACCENT;}

    public static String getBackground(){
        return BACKGROUND;
    }

    public static String getPrimary(){ return primary; }

    public static String getBorder(){ return border; }

    private static class LesbianPride extends KenoColoring{
        // #f1d4d4
        // #e6739f
        // #cc0e74
        // #790c5a
        String GENERAL;
        String IDLE;
        String HOVERED;
        String CLICKED;

        String primaryColor = "#f1d4d4";
        String primaryColorHovered = "#edcece";
        String primaryColorClicked = "#dec1c1";
        String borderColor = "#e6739f";
        String backgroundColor = "#cc0e74";
        String accentColor = "#790c5a";

        String font = "'Apple Chancery'";
        String fontSize = "24px";
        String fontSizeSmall = "16px";

        LesbianPride(){
            GENERAL = "-fx-font-size : " + fontSizeSmall + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColor + ";";
            IDLE = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColor + ";";
            HOVERED = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColorHovered + ";";
            CLICKED = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColorClicked + ";";
        }

        String getBackgroundColor(){
            return backgroundColor;
        }
        String getAccentColor(){ return accentColor;}

        String getGENERAL(){ return GENERAL; }
        String getIDLE(){ return IDLE; }
        String getHOVERED(){ return HOVERED; }
        String getCLICKED(){ return CLICKED; }
        String getBorderColor(){ return borderColor; }
        String getPrimaryColor(){ return primaryColor; }
    }

    private static class CandyCorn extends KenoColoring{
        // #fff8cd
        // #ffe05d
        // #ff9642
        // #646464
        String GENERAL;
        String IDLE;
        String HOVERED;
        String CLICKED;

        String primaryColor = "#fff8cd";
        String primaryColorHovered = "#f5eec4";
        String primaryColorClicked = "#e6dfb5";
        String borderColor = "#ffe05d";
        String backgroundColor = "#ff9642";
        String accentColor = "#646464";

        String font = "'Apple Chancery'";
        String fontSize = "24px";
        String fontSizeSmall = "16px";

        CandyCorn(){
            GENERAL = "-fx-font-size : " + fontSizeSmall + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColor + ";";
            IDLE = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColor + ";";
            HOVERED = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColorHovered + ";";
            CLICKED = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColorClicked + ";";
        }

        String getBackgroundColor(){
            return backgroundColor;
        }
        String getAccentColor(){ return accentColor;}

        String getGENERAL(){ return GENERAL; }
        String getIDLE(){ return IDLE; }
        String getHOVERED(){ return HOVERED; }
        String getCLICKED(){ return CLICKED; }
        String getBorderColor(){ return borderColor; }
        String getPrimaryColor(){ return primaryColor; }
    }

    private static class SunSet extends KenoColoring{
        // #eeecda
        // #f08a5d
        // #b83b5e
        // #6a2c70
        String GENERAL;
        String IDLE;
        String HOVERED;
        String CLICKED;

        String primaryColor = "#eeecda";
        String primaryColorHovered = "#e3e1d1";
        String primaryColorClicked = "#d9d6c5";
        String borderColor = "#f08a5d";
        String backgroundColor = "#b83b5e";
        String accentColor = "#6a2c70";

        String font = "'Apple Chancery'";
        String fontSize = "24px";
        String fontSizeSmall = "16px";

        SunSet(){
            GENERAL = "-fx-font-size : " + fontSizeSmall + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColor + ";";
            IDLE = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColor + ";";
            HOVERED = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColorHovered + ";";
            CLICKED = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColorClicked + ";";
        }

        String getBackgroundColor(){
            return backgroundColor;
        }
        String getAccentColor(){ return accentColor;}

        String getGENERAL(){ return GENERAL; }
        String getIDLE(){ return IDLE; }
        String getHOVERED(){ return HOVERED; }
        String getCLICKED(){ return CLICKED; }
        String getBorderColor(){ return borderColor; }
        String getPrimaryColor(){ return primaryColor; }
    }

    private static class SummerFruit extends KenoColoring{
        // #ccf6c8
        // #fafcc2
        // #f6d6ad
        // #f9c0c0
        String GENERAL;
        String IDLE;
        String HOVERED;
        String CLICKED;

        String primaryColor = "#ccf6c8";
        String primaryColorHovered = "#c2edbe";
        String primaryColorClicked = "#b3deaf";

        String borderColor = "#f6d6ad";
        String backgroundColor = "#fafcc2";
        String accentColor = "#f9c0c0";

        String font = "'Apple Chancery'";
        String fontSize = "24px";
        String fontSizeSmall = "16px";

        SummerFruit(){
            GENERAL = "-fx-font-size : " + fontSizeSmall + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColor + ";";
            IDLE = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColor + ";";
            HOVERED = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColorHovered + ";";
            CLICKED = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColorClicked + ";";
        }

        String getBackgroundColor(){
            return backgroundColor;
        }
        String getAccentColor(){ return accentColor;}

        String getGENERAL(){ return GENERAL; }
        String getIDLE(){ return IDLE; }
        String getHOVERED(){ return HOVERED; }
        String getCLICKED(){ return CLICKED; }
        String getBorderColor(){ return borderColor; }
        String getPrimaryColor(){ return primaryColor; }
    }

    private static class Watermelon extends KenoColoring{
        // #ffb0b0
        // #fe7171
        // #335d2d
        // #7ea04d
        String GENERAL;
        String IDLE;
        String HOVERED;
        String CLICKED;

        String primaryColor = "#ffb0b0";
        String primaryColorHovered = "#f0a5a5";
        String primaryColorClicked = "#d49292";

        String borderColor = "#7ea04d";
        String backgroundColor = "#335d2d";
        String accentColor = "#fe7171";

        String font = "'Apple Chancery'";
        String fontSize = "24px";
        String fontSizeSmall = "16px";

        Watermelon(){
            GENERAL = "-fx-font-size : " + fontSizeSmall + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColor + ";";
            IDLE = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColor + ";";
            HOVERED = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColorHovered + ";";
            CLICKED = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColorClicked + ";";
        }

        String getBackgroundColor(){
            return backgroundColor;
        }
        String getAccentColor(){ return accentColor;}

        String getGENERAL(){ return GENERAL; }
        String getIDLE(){ return IDLE; }
        String getHOVERED(){ return HOVERED; }
        String getCLICKED(){ return CLICKED; }
        String getBorderColor(){ return borderColor; }
        String getPrimaryColor(){ return primaryColor; }
    }

    private static class PeachTea extends KenoColoring{
        // #99b898
        // #feceab
        // #ff847c
        // #e84a5f
        String GENERAL;
        String IDLE;
        String HOVERED;
        String CLICKED;

        String primaryColor = "#aacca9";
        String primaryColorHovered = "#99b898";
        String primaryColorClicked = "#85a184";

        String borderColor = "#ff847c";
        String backgroundColor = "#feceab";
        String accentColor = "#e84a5f";

        String font = "'Apple Chancery'";
        String fontSize = "24px";
        String fontSizeSmall = "16px";

        PeachTea(){
            GENERAL = "-fx-font-size : " + fontSizeSmall + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColor + ";";
            IDLE = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColor + ";";
            HOVERED = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColorHovered + ";";
            CLICKED = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor + "; -fx-background-color: " + primaryColorClicked + ";";
        }

        String getBackgroundColor(){
            return backgroundColor;
        }
        String getAccentColor(){ return accentColor;}

        String getGENERAL(){ return GENERAL; }
        String getIDLE(){ return IDLE; }
        String getHOVERED(){ return HOVERED; }
        String getCLICKED(){ return CLICKED; }
        String getBorderColor(){ return borderColor; }
        String getPrimaryColor(){ return primaryColor; }
    }

    public KenoColoring(){
        GENERAL = "-fx-font-size : 16px; -fx-font-family : ''; -fx-border-width: 4px; -fx-border-color: darkred;" + "-fx-background-color: #fffaec;";

        IDLE = "-fx-font-size : 24px; -fx-font-family : 'Apple Chancery'; -fx-border-width: 4px; -fx-border-color: darkred;" + "-fx-background-color: #fffaec;";

        HOVERED = "-fx-font-size : 24px; -fx-font-family : 'Apple Chancery'; -fx-border-width: 4px; -fx-border-color: darkred;" + "-fx-background-color: #e5e1d4;";

        CLICKED = "-fx-font-size : 24px; -fx-font-family : 'Apple Chancery'; -fx-border-width: 4px; -fx-border-color: darkred;" + "-fx-background-color: #b2afa5;";
        ColorPallete = "Lesbian";
    }

    private static void updateColors(){
        switch(ColorPallete){
            case "Lesbian":
                LesbianPride lesbian = new LesbianPride();
                GENERAL = lesbian.getGENERAL();
                IDLE = lesbian.getIDLE();
                HOVERED = lesbian.getHOVERED();
                CLICKED = lesbian.getCLICKED();
                BACKGROUND = lesbian.getBackgroundColor();
                ACCENT = lesbian.getAccentColor();
                primary = lesbian.getPrimaryColor();
                border = lesbian.getBorderColor();
                ColorPallete = "Candy";
                break;
            case "Candy":
                CandyCorn candy = new CandyCorn();
                GENERAL = candy.getGENERAL();
                IDLE = candy.getIDLE();
                HOVERED = candy.getHOVERED();
                CLICKED = candy.getCLICKED();
                BACKGROUND = candy.getBackgroundColor();
                ACCENT = candy.getAccentColor();
                primary = candy.getPrimaryColor();
                border = candy.getBorderColor();
                ColorPallete = "SunSet";
                break;
            case "SunSet":
                SunSet sun = new SunSet();
                GENERAL = sun.getGENERAL();
                IDLE = sun.getIDLE();
                HOVERED = sun.getHOVERED();
                CLICKED = sun.getCLICKED();
                BACKGROUND = sun.getBackgroundColor();
                ACCENT = sun.getAccentColor();
                primary = sun.getPrimaryColor();
                border = sun.getBorderColor();
                ColorPallete = "Summer";
                break;
            case "Summer":
                SummerFruit summer = new SummerFruit();
                GENERAL = summer.getGENERAL();
                IDLE = summer.getIDLE();
                HOVERED = summer.getHOVERED();
                CLICKED = summer.getCLICKED();
                BACKGROUND = summer.getBackgroundColor();
                ACCENT = summer.getAccentColor();
                primary = summer.getPrimaryColor();
                border = summer.getBorderColor();
                ColorPallete = "Watermelon";
                break;
            case "Watermelon":
                Watermelon water = new Watermelon();
                GENERAL = water.getGENERAL();
                IDLE = water.getIDLE();
                HOVERED = water.getHOVERED();
                CLICKED = water.getCLICKED();
                BACKGROUND = water.getBackgroundColor();
                ACCENT = water.getAccentColor();
                primary = water.getPrimaryColor();
                border = water.getBorderColor();
                ColorPallete = "Peach";
                break;
            case "Peach":
                PeachTea peach = new PeachTea();
                GENERAL = peach.getGENERAL();
                IDLE = peach.getIDLE();
                HOVERED = peach.getHOVERED();
                CLICKED = peach.getCLICKED();
                BACKGROUND = peach.getBackgroundColor();
                ACCENT = peach.getAccentColor();
                primary = peach.getPrimaryColor();
                border = peach.getBorderColor();
                ColorPallete = "Lesbian";
                break;
            default:
                LesbianPride temp = new LesbianPride();
                GENERAL = temp.getGENERAL();
                IDLE = temp.getIDLE();
                HOVERED = temp.getHOVERED();
                CLICKED = temp.getCLICKED();
                BACKGROUND = temp.getBackgroundColor();
                ACCENT = temp.getAccentColor();
                primary = temp.getPrimaryColor();
                border = temp.getBorderColor();
                break;
        }
    }

    public static Vector<String> newColors(){
        updateColors();
        Vector<String> colorList = new Vector(8);

        colorList.add(getGeneral());
        colorList.add(getIdle());
        colorList.add(getHovered());
        colorList.add(getClicked());
        colorList.add(getBackground());
        colorList.add(getAccent());
        colorList.add(getPrimary());
        colorList.add(getBorder());

        return colorList;
    }
}
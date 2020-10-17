public class KenoColoring{
    private String GENERAL;
    private String IDLE;
    private String HOVERED;
    private String CLICKED;
    private String BACKGROUND;
    private String ColorPallete;

    private lesbian = new LesbianPride();
    private candy = new CandyCorn();
    private sunset = new SunSet();
    private watermelon = new Watermelon();
    private summer = new SummerFruit();
    private peach = new PeachTea();

    public class KenoColoring(){
        GENERAL = "-fx-font-size : 16px; -fx-font-family : ''; -fx-border-width: 4px; -fx-border-color: darkred;" +
                "-fx-background-color: #fffaec;";

        IDLE = "-fx-font-size : 32px; -fx-font-family : 'Apple Chancery'; -fx-border-width: 4px; -fx-border-color: darkred;" +
                "-fx-background-color: #fffaec;";

        HOVERED = "-fx-font-size : 32px; -fx-font-family : 'Apple Chancery'; -fx-border-width: 4px; -fx-border-color: darkred;" +
                "-fx-background-color: #e5e1d4;";

        CLICKED = "-fx-font-size : 32px; -fx-font-family : 'Apple Chancery'; -fx-border-width: 4px; -fx-border-color: darkred;" +
                "-fx-background-color: #b2afa5;";
        ColorPallete = 'default'
    }

    public String getGeneral(){
        return GENERAL;
    }

    public String getIdle(){
        return IDLE;
    }

    public String getHovered(){
        return HOVERED;
    }

    public String getClicked(){
        return CLICKED;
    }

    public String getBackground(){
        return BACKGROUND;
    }

    private void updateColors(){
        switch(ColorPallete){
            case 'Lesbian':
                LesbianPride temp = new LesbianPride();
                ColorPallete = 'Candy';
                break;
            case 'Candy':
                CandyCorn temp = new CandyCorn();
                ColorPallete = 'SunSet';
                break;
            case 'SunSet':
                SunSet temp = new SunSet();
                ColorPallete = 'Summer';
                break;
            case 'Summer':
                SummerFruit temp = new SummerFruit();
                ColorPallete = 'Watermelon';
                break;
            case 'Watermelon':
                Watermelon temp = new Watermelon();
                ColorPallete = 'Peach';
                break;
            case 'Peach':
                PeachTea temp = new PeachTea();
                ColorPallete = 'Lesbian';
                break;
            default:
                LesbianPride temp = new LesbianPride();
                break;
        }
        GENERAL = temp.getGeneral();
        IDLE = temp.getIdle();
        HOVERED = temp.getHovered();
        CLICKED = temp.getClicked();
        BACKGROUND = temp.getBackground();
    }

    public Vector<String> newColors(){
        Vector<String> colorList = new Vector<String>(5);

        colorList[0] = getGeneral();
        colorList[1] = getIdle();
        colorList[2] = getHovered();
        colorList[3] = getClicked();
        colorList[4] = getBackground();

        return colorList;
    }

    private class LesbianPride extends KenoColoring{
        // #f1d4d4
        // #e6739f
        // #cc0e74
        // #790c5a
        String GENERAL;
        String IDLE;
        String HOVERED;
        String CLICKED;

        String primaryColor = '#f1d4d4';
        String primaryColorHovered = '#edcece';
        String primaryColorClicked = '#dec1c1';

        String borderColor = '#e6739f';

        String backgroundColor = '#cc0e74';

        String accentColor = '#790c5a';

        String font = 'Apple Chancery';

        String fontSize = '32px';

        String fontSizeSmall = '16px';

        class LesbianPride(){
            GENERAL = "-fx-font-size : " + fontSizeSmall + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor +
                "; -fx-background-color: " + primaryColor + ";";
            IDLE = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor +
                    "; -fx-background-color: " + primaryColor + ";";
            HOVERED = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor +
                    "; -fx-background-color: " + primaryColorHovered + ";";
            CLICKED = "-fx-font-size : " + fontSize + "; -fx-font-family : " + font + "; -fx-border-width : 4px; -fx-border-color : " + borderColor +
                    "; -fx-background-color: " + primaryColorClicked + ";";
        }

        String getBackgroundColor(){
            return backgroundColor;
        }
    }

    private class CandyCorn{
        // #fff8cd
        // #ffe05d
        // #ff9642
        // #646464
    }

    private class SunSet{
        // #eeecda
        // #f08a5d
        // #b83b5e
        // #6a2c70
    }

    private class SummerFruit{
        // #ccf6c8
        // #fafcc2
        // #f6d6ad
        // #f9c0c0
    }

    private class Watermelon{
        // #ffb0b0
        // #fe7171
        // #335d2d
        // #7ea04d
    }

    private class PeachTea{
        // #99b898
        // #feceab
        // #ff847c
        // #e84a5f
    }
}
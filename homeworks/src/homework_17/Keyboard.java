package homework_17;

import java.util.Arrays;

public class Keyboard {
    String[] layouts;
    boolean backlight;
    boolean numpad;
    public Keyboard(){
        this.layouts = new String[]{"RU", "ENG"};
        this.backlight = false;
        this.numpad = true;
    }
    public Keyboard(boolean backlight, boolean numpad, String[] layouts){
        this.layouts = layouts;
        this.backlight = backlight;
        this.numpad = numpad;
    }

    public String[] getLayouts() {
        return layouts;
    }

    public void setLayouts(String[] layouts) {
        this.layouts = layouts;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

    public boolean isNumpad() {
        return numpad;
    }

    public void setNumpad(boolean numpad) {
        this.numpad = numpad;
    }
    @Override
    public String toString(){
        return String.format("layouts: %s; backlight: %s; numpad: %s", Arrays.toString(this.layouts), this.backlight, this.numpad);
    }
}

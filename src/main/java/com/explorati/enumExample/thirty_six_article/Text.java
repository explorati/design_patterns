package com.explorati.enumExample.thirty_six_article;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 20:46 2019/12/21 0021
 * @ Description ：用EnumSet代替位域
 */
//Bit field enumeration constants - OBSOLETE!
public class Text {

    public static final int STYLE_BOLD = 1 << 0;
    public static final int STYLE_ITALIC = 1 << 1;
    public static final int STYLE_UNDERLINE = 1 << 2;
    public static final int STYLE_STRIKETHROUGH = 1 << 3;

    public void applyStyles(int style) {

    }

    public static void main(String[] args) {
        Text text = new Text();
        //用OR位运算将几个常量合并到一个集合中，称作位域
        text.applyStyles(STYLE_BOLD | STYLE_ITALIC);
    }
}

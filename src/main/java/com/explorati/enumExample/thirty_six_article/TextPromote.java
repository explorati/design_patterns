package com.explorati.enumExample.thirty_six_article;

import java.util.EnumSet;
import java.util.Set;

/**
 * @ Author : Weijian_Wang
 * @ Date : Created in 20:49 2019/12/21 0021
 * @ Description ：EnmSet -- a modern replacement for bit fields
 */
public class TextPromote {

    public enum Style {
        BOLD, ITALIC, UNDERLINE, STRIKETHROUGH
    }

    public void applyStyles(Set<Style> styles) {
        EnumSet.of(Style.BOLD, Style.ITALIC);
    }
}

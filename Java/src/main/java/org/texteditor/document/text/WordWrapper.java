package org.texteditor.document.text;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

public record WordWrapper(@Range(from = 1, to = Integer.MAX_VALUE) int maxLineLength) {

    /**
     * Wrap the text at a maximum of {@link #maxLineLength} characters per line.
     * <p>
     * Rules for wrapping are:
     * <ul>
     *     <li>Wrapping occurs preferably between words. The space is then removed,
     *         i.e. it does not end up at the end or beginning of either line.</li>
     *     <li>If wrapping *between* words is not possible, wrapping *within* a
     *         word is done instead.</li>
     * </ul>
     */
    public String wrap(@NotNull String text) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
}

package org.texteditor.document;

import org.texteditor.document.text.WordWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.util.List;

public class Paragraph {

    private final String text;
    private final WordWrapper wordWrapper;

    public Paragraph(@NotNull String text, @Range(from = 1, to = Integer.MAX_VALUE) int maxWidth) {
        this.text = text;
        this.wordWrapper = new WordWrapper(maxWidth);
    }

    /**
     * The lines in the paragraph with word wrapping applied.
     */
    public List<String> lines() {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    /**
     * Every line in the paragraph is at most this long, however due to word
     * wrapping the actual longest line may be shorter than this limit.
     */
    public int maxAllowedWidth() {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    /**
     * The number of lines in the paragraph as a result of word wrapping.
     */
    public int height() {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    /**
     * The longest actual occurring line length in the paragraph as a result of
     * word wrapping.
     */
    public int width() {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
}

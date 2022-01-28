package draw.litho;

import draw.litho.providers.ILithoPatternProvider;
import javafx.scene.canvas.Canvas;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class LithoCardsRegEx {

    //region Builder pattern
    private static class LithoRegExPatternProvider {
        public Pattern[] RegExPattern;
        public ILithoPatternProvider Provider;

        public boolean IsOccurs(String message) {
            return Arrays.stream(RegExPattern).anyMatch(pattern -> pattern.matcher(message).find());
        }

        public LithoRegExPatternProvider(Pattern[] pattern, ILithoPatternProvider provider) {
            this.Provider = provider;
            this.RegExPattern = pattern;
        }
    }

    public static class Builder {
        public Builder(LithoCardsCore lithoCards) {
            this.lithoCards = lithoCards;
        }

        public Builder() {
            this.lithoCards = new LithoCards();
        }

        private final LithoCardsCore lithoCards;
        private final List<LithoRegExPatternProvider> Providers = new ArrayList<>();

        public Builder Register(ILithoPatternProvider provider, Pattern... pattern) {
            Providers.add(new LithoRegExPatternProvider(pattern, provider));
            return this;
        }

        public LithoCardsRegEx Build() {
            return new LithoCardsRegEx(this);
        }
    }

    //endregion

    private final LithoCardsCore lithoCards;

    private final List<LithoRegExPatternProvider> Providers;

    private LithoCardsRegEx(@NotNull Builder builder) {
        this.Providers = builder.Providers;
        this.lithoCards = builder.lithoCards;
    }

    public void Clear() {
        lithoCards.Clear();
    }

    public void Clear(Canvas canvas) {
        lithoCards.Clear(canvas);
    }

    public void Draw(Canvas canvas) {
        lithoCards.Draw(canvas);
    }

    public void Update(String message) {
        Clear();

        Providers
                .stream()
                .filter(RegExProvider ->
                        RegExProvider.IsOccurs(message)
                )
                .forEach(RegExProvider -> lithoCards
                        .Add(RegExProvider.Provider));
    }

    public void UpdateAndDraw(Canvas canvas, String message) {
        Clear(canvas);
        Update(message);
        Draw(canvas);
    }
}

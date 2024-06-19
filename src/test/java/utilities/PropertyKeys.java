package utilities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PropertyKeys {
    HOST("host"),
    BOSHOST("boshost");
    public final String key;
}



package string;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

import static org.junit.Assert.assertEquals;
import static strings.DuplicateWords.removeDuplicateWords;

/**
 * @author lferracini
 * @project = challenges
 * @since <pre>20/11/2019</pre>
 */
public class DuplicateWordsSteps {

    @Dado("que digite {string} e removo as palavras duplicadas entao vejo a frase {string}")
    public void removoAsPalavrasDuplicadas(String fraseDuplicada, String fraseCorrigida) {
        assertEquals(fraseCorrigida, removeDuplicateWords(fraseDuplicada));
    }
}

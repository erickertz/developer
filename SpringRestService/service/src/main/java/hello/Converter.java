package hello;

import com.urbn.interviewtest.RomanNumeralConverter;
import org.springframework.beans.factory.annotation.Autowired;

public class Converter {
    @Autowired
    private RomanNumeralConverter romanConverter;
    private final String content;

    public Converter(int NUMBER) {  
        this.content = romanConverter.RomanNumeralConverter(NUMBER);
    }
    
    public String getContent() {
        return content;
    }
}

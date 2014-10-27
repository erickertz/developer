package hello;

import com.urbn.interviewtest.RomanNumeralConverter;

public class Converter {
	private final long id;
    private final int number;
    private final String content;
    private final RomanNumeralConverter romanNumeralConverter;

    public Converter(long id, int number) {
    	this.id = id;
        this.number = number;
        this.romanNumeralConverter = new RomanNumeralConverter();
        this.content = this.romanNumeralConverter.RomanNumeralConverter(number);
    }
    
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}

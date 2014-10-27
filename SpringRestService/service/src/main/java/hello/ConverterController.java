package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConverterController {
	private final AtomicLong counter = new AtomicLong();
	
    @RequestMapping("/convert")
    public @ResponseBody Converter converter(@RequestParam(value="number", required=true) int number) {
        return new Converter(counter.incrementAndGet(), number);
    }
  
}

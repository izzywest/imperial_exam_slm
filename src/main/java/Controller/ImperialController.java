package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class ImperialController {

    @GetMapping("/api/centimeter")

    public double calcCentimeterFromInches(@RequestParam double inch) {
        return inch*2.54;
    }

    @GetMapping("/api/meter")

    public double calcMeterFromYard(@RequestParam double yard) {
        return yard/1.094;
    }

}

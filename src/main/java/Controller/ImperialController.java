package Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ImperialController {

    @GetMapping("/api/calcCentimeterFromInches")

    public double calcCentimeterFromInches(@GetMapping double inch) {
        return inch*2.54;
    }

    @GetMapping("/api/calcMeterFromYard")

    public double calcMeterFromYard(@GetMapping double yard) {
        return yard / 1.094;
    }

}

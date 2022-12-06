package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController public class ImperialController {

    @GetMapping("/centimeter/{inch}")
    double centimeter(@PathVariable double inch) {
        return inch * 2.54;
    }

    @GetMapping("/meter/{yard}")
    double meter(@PathVariable double yard) {
        return yard / 1.094;
    }
}

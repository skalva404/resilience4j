package demo.r4j.reg.controller;

import demo.r4j.reg.dto.SellerDto;
import demo.r4j.reg.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/addSeller")
    public String addSeller(@RequestBody SellerDto sellerDto){
        return registrationService.addSeller(sellerDto);
    }

    @GetMapping("/sellersList")
    public List<SellerDto> getSellersList() {
        return registrationService.getSellersList();
    }
}

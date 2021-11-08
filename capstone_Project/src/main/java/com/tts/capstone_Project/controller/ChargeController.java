package com.tts.capstone_Project.controller;

import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.tts.capstone_Project.model.ChargeRequest;
import com.tts.capstone_Project.service.StripeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChargeController {

    @Autowired
    private StripeService service;

    @PostMapping("/charge")
    public String charge(ChargeRequest chargeRequest, Model model) throws StripeException {
        chargeRequest.setDescription("Example Charge");
        chargeRequest.setCurrency(ChargeRequest.Currency.EUR);
        Charge charge = service.charge(chargeRequest);
        model.addAttribute("id", charge.getId());
        model.addAttribute("status", charge.getStatus());
        model.addAttribute("chargeId", charge.getId());
        model.addAttribute("balance_transaction", charge.getBalanceTransaction());
        return "result";
    }

    @ExceptionHandler(StripeException.class)
    public String handleError(Model model, StripeException e){
        model.addAttribute("Error", e.getMessage());
        return "result";
    }
}

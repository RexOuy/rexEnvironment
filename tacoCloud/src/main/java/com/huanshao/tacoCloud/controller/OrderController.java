package com.huanshao.tacoCloud.controller;

import com.huanshao.tacoCloud.bean.Order;
import com.huanshao.tacoCloud.bean.User;
import com.huanshao.tacoCloud.jdbc.OrderRepository;
import com.huanshao.tacoCloud.jdbc.UserRepository;
import com.huanshao.tacoCloud.props.OrderProps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("order")
public class OrderController {

    private OrderProps props;

    private OrderRepository orderRepo;
    private UserRepository userRepo;

    public OrderController(OrderRepository orderRepo, UserRepository userRepo, OrderProps props) {
        this.orderRepo = orderRepo;
        this.userRepo = userRepo;
        this.props = props;
    }

    @GetMapping
    public String ordersForUser(@AuthenticationPrincipal User user, Model model) {
        Pageable pageable = PageRequest.of(0,props.getPageSize());
        model.addAttribute("orders", orderRepo.findByUserOrderByCreatedAtDesc(user,pageable));
        return "orerList";
    }

    @GetMapping("/current")
    public String orderForm() {
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid Order order, Errors errors,
                               SessionStatus sessionStatus, @AuthenticationPrincipal User user) {
        if (errors.hasErrors()) {
            return "orderForm";
        }

        order.setUser(user);

        orderRepo.save(order);
        sessionStatus.setComplete();

        log.info("Order submitted: "+ order);
        return "redirect:/";
    }
}

package sample.cafekiosk.spring.api.controller.order;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sample.cafekiosk.spring.api.controller.order.request.OrderCreateRequest;
import sample.cafekiosk.spring.api.service.order.OrderService;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("new")
    @ResponseStatus(HttpStatus.CREATED)
    public void createOrder(@RequestBody OrderCreateRequest request) {
        LocalDateTime registeredDateTIme = LocalDateTime.now();
        orderService.createOrder(request, registeredDateTIme);
    }

}

package onlinebookstore.presentation;

import onlinebookstore.OnlineBookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OnlineBookStoreController {

  private final OnlineBookStoreService service;

  @Autowired
  OnlineBookStoreController(OnlineBookStoreService service) {
    this.service = service;
  }

  @GetMapping("/list")
  public String list() {
    service.execute();
    return "hello";
  }
}

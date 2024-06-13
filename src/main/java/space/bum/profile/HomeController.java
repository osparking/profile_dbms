package space.bum.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HomeController {

  @Value("${application.dbms}")
  String dbmsInUse;
  
  @Value("${spring.profiles.active}")
  String profiles;

  @GetMapping("/dbms")
  public void getDbms() {
    log.info("Profile: {}, DBMS: {}", profiles, dbmsInUse);
  }

}

package ar.com.telecom.fmvue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Log
@SpringBootTest
class FmVueApplicationTests {

    @Test
    void contextLoads() {
        log.info("un log de test")
    }

}

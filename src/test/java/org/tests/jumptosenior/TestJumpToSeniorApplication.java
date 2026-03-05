package org.tests.jumptosenior;

import org.springframework.boot.SpringApplication;

public class TestJumpToSeniorApplication {

    public static void main(String[] args) {
        SpringApplication.from(JumpToSeniorApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}

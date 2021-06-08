package org.edu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class Example {
        public static void main(String[] args) {
            Optional.ofNullable(new Object()).orElse(getDefaul());
        }

    private static Object getDefaul() {
        System.out.println("hi");
        return new Object();
    }

}


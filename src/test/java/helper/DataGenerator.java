package helper;

import org.apache.commons.lang3.RandomStringUtils;

public class DataGenerator {

    public static String generateString() {
        return RandomStringUtils.randomAlphabetic(10);
    }

    public static String generatePassword() {
        return RandomStringUtils.randomAlphanumeric(10);
    }
    }


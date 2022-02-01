package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {

    @Test
    void testReadFile(){
        //given
        FileReader fileReader = new FileReader();

        //when&then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("aa")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))

        );
    }
}

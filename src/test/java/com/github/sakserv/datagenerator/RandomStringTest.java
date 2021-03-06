package com.github.sakserv.datagenerator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
public class RandomStringTest {

    private final static File dictionaryFile = new File("dictionary.txt");
    private static RandomString randomString;

    @BeforeClass
    public static void setUp() {
        randomString = new RandomString(dictionaryFile);
    }

    @Test
    public void testGetDictionaryFile() throws Exception {
        assertEquals(dictionaryFile, randomString.getDictionaryFile());
    }

    @Test
    public void testGetRandomValue() throws Exception {
        assertTrue(randomString.getRandomValue() instanceof String);
    }
}
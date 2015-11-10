package com.github.sakserv.datagenerator;

import org.junit.BeforeClass;
import org.junit.Test;

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
public class RandomIntegerTest {

    private static RandomInteger randomInteger;
    private static final Integer lowerBound = 1;
    private static final Integer upperBound = 100;

    @BeforeClass
    public static void setUp() {
        randomInteger = new RandomInteger(lowerBound, upperBound);
    }

    @Test
    public void testGetLowerBound() throws Exception {
        assertEquals(lowerBound, randomInteger.getLowerBound());
    }

    @Test
    public void testGetUpperBound() throws Exception {
        assertEquals(upperBound, randomInteger.getUpperBound());
    }

    @Test
    public void testGetRandomValue() throws Exception {
        Integer randomValue = randomInteger.getRandomValue();
        assertTrue(lowerBound <= randomValue && randomValue <= upperBound);
    }
}
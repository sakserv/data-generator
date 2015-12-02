package com.github.sakserv.datagenerator;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
public class RandomLongTest {

    private static RandomLong randomLong;
    private static final Long lowerBound = 1l;
    private static final Long upperBound = 100l;

    @BeforeClass
    public static void setUp() {
        randomLong = new RandomLong(lowerBound, upperBound);
    }

    @Test
    public void testGetLowerBound() throws Exception {
        assertEquals(lowerBound, randomLong.getLowerBound());
    }

    @Test
    public void testGetUpperBound() throws Exception {
        assertEquals(upperBound, randomLong.getUpperBound());
    }

    @Test
    public void testGetRandomValue() throws Exception {
        Long randomValue = randomLong.getRandomValue();
        assertTrue(lowerBound <= randomValue && randomValue <= upperBound);
    }
}
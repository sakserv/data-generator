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
public class RandomFloatTest {

    private static RandomFloat randomFloat;
    private static Integer precision = 2;

    @BeforeClass
    public static void setUp() {
        randomFloat = new RandomFloat(precision);
    }

    @Test
    public void testGetPrecision() throws Exception {
        assertEquals(precision, randomFloat.getPrecision());
    }

    @Test
    public void testGetRandomValue() throws Exception {
        assertTrue(0f <= randomFloat.getRandomValue() && randomFloat.getRandomValue() <= 1f);
    }

    @Test
    public void testPrecisionLength() {
        assertEquals((int) precision, randomFloat.getRandomValue().toString().replace("0.", "").length());
    }
}